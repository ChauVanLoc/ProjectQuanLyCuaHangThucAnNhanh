package models;

public abstract class PersonObserver {
	protected Subject subject;

	public Subject getSubject() {
		return this.subject;
	}
}
