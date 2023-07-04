package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import models.Item;
import models.PersonObserver;
import models.Subject;
import models.manage.ProductManage;
import models.person.Order;
import models.person.customer.Customer;
import models.person.customer.GatewayPayment;
import views.Menu;
import views.RechargeMoney;

public class OrderController {
	private Menu menu;
	private ProductManage productManage;
	private JPanel panel;

	public OrderController(Menu menu, ProductManage productManage, JPanel panel) {
		this.menu = menu;
		this.productManage = productManage;
		this.panel = panel;
	}

	public List<Item> getItems() {
		return this.menu.getItems();
	}

	public void addItem(Item item) {
		this.menu.addItem(item);
	}

	public void deleteItem(Item item) {
		this.menu.deleteItem(item);
	}

	public void pay(List<Item> items, String address, String phone, PersonObserver customer, int score,
			GatewayPayment gateway) {
		Order order = ((Customer) customer).createOrder(items, address, phone, score);
		popupMessage(((Customer) customer).pay(order, gateway), customer, order);
	}

	public void payAgain(Order order, PersonObserver customer) {
		popupMessage(((Customer) customer).payAgain(order), customer, order);
	}

	public void popupMessage(boolean status, PersonObserver customer, Order order) {
		if (status) {
			JOptionPane.showMessageDialog(this.panel, "Payment success", "Success", JOptionPane.INFORMATION_MESSAGE);
		} else {
			int result = JOptionPane.showConfirmDialog(this.panel, "Do you want to recharge to continue paying?",
					"Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if (result == JOptionPane.YES_OPTION) {
				RechargeMoney rechargeView = new RechargeMoney();
				rechargeView.setVisible(true);
				rechargeView.getLb_available_content().setText(((Customer) customer).getGateway().getMoney() + "");
				rechargeView.getBtn_recharge().addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int amount = (int) Double.parseDouble(rechargeView.getJt_amount().getText());
						if (((Customer) customer).recharge(amount)) {
							rechargeView.getLb_available_content()
									.setText(((Customer) customer).getGateway().getMoney() + "");
							JOptionPane.showMessageDialog(rechargeView, "Recharge success", "Success",
									JOptionPane.INFORMATION_MESSAGE);
							boolean isPayAgain = ((Customer) customer).payAgain(order);
							if (isPayAgain) {
								JOptionPane.showMessageDialog(rechargeView, "Payment success", "Success",
										JOptionPane.INFORMATION_MESSAGE);
							} else {
								JOptionPane.showMessageDialog(rechargeView, "Money in wallet is not enough", "Failed",
										JOptionPane.INFORMATION_MESSAGE);
							}
						} else {
							JOptionPane.showMessageDialog(rechargeView, "Recharge failed", "Failed",
									JOptionPane.INFORMATION_MESSAGE);
						}
					}
				});
			} else if (result == JOptionPane.NO_OPTION) {
				JOptionPane.showMessageDialog(this.panel, "Money in wallet is not enough", "Failed",
						JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}

	public void popupRecharge() {

	}

	public void createOrderByEmployee(List<Item> items, String address, String phone, PersonObserver customer,
			Subject sub, int score) {

	}
}
