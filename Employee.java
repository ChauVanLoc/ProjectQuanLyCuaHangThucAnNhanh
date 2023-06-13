package managementStore;

import java.util.ArrayList;
import java.util.List;

public abstract class Employee implements PersonObserver {
	protected Person person;
	protected String academicLevel;
	private List<Notification> subscribedNotifications;

	public Employee(Person person, String academicLevel) {
		super();
		this.person = person;
		this.academicLevel = academicLevel;
		this.subscribedNotifications = new ArrayList<>();
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public String getAcademicLevel() {
		return academicLevel;
	}

	public void setAcademicLevel(String academicLevel) {
		this.academicLevel = academicLevel;
	}

	public List<Notification> getSubscribedNotifications() {
		return subscribedNotifications;
	}

	public void setSubscribedNotifications(List<Notification> subscribedNotifications) {
		this.subscribedNotifications = subscribedNotifications;
	}

	@Override
	public void getIdPerson() {
		getPerson().getId();
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

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
	public void notifyPersonObservers() {
		// TODO Auto-generated method stub

	}
	// Tạo subject là 1 nhân viên
	private Subject createEmployeeSubject() {
        return new Subject() {
            private List<PersonObserver> personObservers = new ArrayList<>();
            private List<Notification> notifications = new ArrayList<>();

            @Override
            public void addPersonObserver(PersonObserver o) {
                personObservers.add(o);
            }

            @Override
            public void removePersonObserver(PersonObserver o) {
                personObservers.remove(o);
            }

            @Override
            public void notifyObserver(PersonObserver o) {
                o.update();
            }

            @Override
            public void addNotification(Notification notify) {
                notifications.add(notify);
            }

            @Override
            public void removeNotification(Notification notify) {
                notifications.remove(notify);
            }

            @Override
            public void editNotification(Notification notify) {
            	// todo
            }
        };
	}
	
	public void subscribeToWorkScheduleNotifications(NotificationManager notificationManager) {
        // Check if the employee is already subscribed
        if (isSubscribedToWorkScheduleNotifications()) {
            System.out.println(person.getName() + " is already subscribed to work schedule notifications.");
            return;
        }

        // Find the work schedule notification in the notification manager
        Notification workScheduleNotification = findWorkScheduleNotification(notificationManager);

        if (workScheduleNotification != null) {
        	// Hiện thực Subject là một nhân viên
            Subject employeeSubject = createEmployeeSubject();
            workScheduleNotification.setSubject(employeeSubject);
            subscribedNotifications.add(workScheduleNotification);
            System.out.println(person.getName() + " has subscribed to work schedule notifications.");
        } else {
            System.out.println("Work schedule notification not found.");
        }
    }

	private Notification findWorkScheduleNotification(NotificationManager notificationManager) {
		// Iterate through the notifications in the notification manager to find the
		// work schedule notification
		for (Notification notification : notificationManager.getNotifications()) {
			if (notification.getType().equals("Work Schedule") && notification.getSubject() == null) {
				return notification;
			}
		}
		return null; // Work schedule notification not found
	}

	public boolean isSubscribedToWorkScheduleNotifications() {
		// Check if the employee is subscribed to work schedule notifications
		for (Notification notification : subscribedNotifications) {
			if (notification.getType().equals("Work Schedule")) {
				return true;
			}
		}
		return false;
	}
}
