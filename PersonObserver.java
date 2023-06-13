package managementStore;

public interface PersonObserver {
	public void getIdPerson();
	public void update();
	public void addPersonObserver(PersonObserver o);
	public void removePersonObserver(PersonObserver o);
	public void notifyPersonObservers();
}
