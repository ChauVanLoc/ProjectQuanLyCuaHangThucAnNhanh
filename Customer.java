package managementStore;

import java.util.ArrayList;
import java.util.List;

public abstract class Customer implements PersonObserver {
	protected Person person;
	protected List<PersonObserver> personObservers = new ArrayList<>();
	protected List<Address> deliveryAddress;
	protected List<Notification> subscribedNotifications;

	public Customer(Person person) {
		this.person = person;
		this.deliveryAddress = new ArrayList<>();
		this.subscribedNotifications = new ArrayList<>();
	}
	
	public void addDeliveryAddress(Address address) {
        deliveryAddress.add(address);
    }

    public void removeDeliveryAddress(Address address) {
        deliveryAddress.remove(address);
    }

    public void subscribeToNotification(Notification notification) {
        if (!subscribedNotifications.contains(notification)) {
            subscribedNotifications.add(notification);
            notification.addPersonObserver(this);
        }
    }

    public void unsubscribeFromNotification(Notification notification) {
        subscribedNotifications.remove(notification);
        notification.removePersonObserver(this);
    }

	@Override
	public void getIdPerson() {
		this.person.getId();
	}

	@Override
	public void update() {
		
	}

	@Override
	public void addPersonObserver(PersonObserver o) {
		if (!personObservers.contains(o)) {
            personObservers.add(o);
        }
	}

	@Override
	public void removePersonObserver(PersonObserver o) {
		personObservers.remove(0);
	}

	@Override
	public void notifyPersonObservers() {
		for (PersonObserver observer : personObservers) {
            observer.update();
        }
	}
}
