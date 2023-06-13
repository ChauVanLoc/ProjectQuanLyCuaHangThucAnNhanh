package managementStore;

import java.util.ArrayList;
import java.util.List;

public class NotificationManager {
	private List<Notification> notifications;

	public NotificationManager() {
		notifications = new ArrayList<>();
	}

	public List<Notification> getNotifications() {
		return notifications;
	}

	public void setNotifications(List<Notification> notifications) {
		this.notifications = notifications;
	}

	public void addNotification(Notification notify) {
		notifications.add(notify);
	}

	public void removeNotification(Notification notify) {
		notifications.remove(notify);
	}

	public void editNotification(Notification notify) {
		Notification existingNotification = findNotificationById(notify.getId());
		if (existingNotification != null) {
			// Update the properties of the existing notification
			existingNotification.setTitle(notify.getTitle());
			existingNotification.setType(notify.getType());
			existingNotification.setContent(notify.getContent());
			existingNotification.setStartDate(notify.getStartDate());
			existingNotification.setEndDate(notify.getEndDate());
			existingNotification.setCreated(notify.getCreated());
			existingNotification.setStatus(notify.isStatus());
		}
	}

	private Notification findNotificationById(String id) {
		for (Notification notification : notifications) {
			if (notification.getId().equals(id)) {
				return notification;
			}
		}
		return null; // Notification with the specified ID not found
	}

	// Lịch sử thông báo
	public void notificationHistory() {
		if (notifications.isEmpty()) {
			System.out.println("Notification history is empty!");
		} else {
			for (Notification notify : notifications) {
				System.out.println(notify + "\n");
			}
		}
	}

}
