package managementStore;

public interface Subject {
	public void addPersonObserver(PersonObserver o);
	public void removePersonObserver(PersonObserver o);
	public void notifyObserver(PersonObserver o);
	
	public void addNotification(Notification notify);
	public void removeNotification(Notification notify);
	public void editNotification(Notification notify);
}
