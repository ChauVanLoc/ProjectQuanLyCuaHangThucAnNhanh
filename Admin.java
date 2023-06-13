package managementStore;

public class Admin implements Subject {
	Person person;
	Customer personManager;
	NotificationManager notificationManager;
	ProductManager productManager;

	@Override
	public void addNotification(Notification notify) {
		notificationManager.addNotification(notify);
	}

	@Override
	public void removeNotification(Notification notify) {
		notificationManager.removeNotification(notify);
	}

	@Override
	public void editNotification(Notification notify) {
		notificationManager.editNotification(notify);
	}

	@Override
	public void addPersonObserver(PersonObserver o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removePersonObserver(PersonObserver o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notifyObserver(PersonObserver o) {
		// TODO Auto-generated method stub
		
	}

}
