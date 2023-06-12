package models;

import java.util.ArrayList;
import java.util.List;

public class ManageCustomer {
	private List<CustomerObserver> cuss;

	public ManageCustomer() {
		this.cuss = new ArrayList<>();
	}

	public List<CustomerObserver> getCustomer() {
		return cuss;
	}

	public void addCustomer(CustomerObserver o) {
		this.cuss.add(o);
	}

	public void deleteCustomer(CustomerObserver o) {
		this.cuss.remove(o);
	}

	public void updateCustomer() {

	}

}
