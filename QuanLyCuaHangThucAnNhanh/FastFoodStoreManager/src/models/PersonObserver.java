package models;

import java.util.ArrayList;
import java.util.List;

public abstract class PersonObserver {
	protected Subject subject;
	protected List<Notification> notifications = new ArrayList<>();

	public Subject getSubject() {
		return this.subject;
	}
}
