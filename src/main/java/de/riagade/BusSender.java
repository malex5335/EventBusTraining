package de.riagade;

import com.google.common.eventbus.EventBus;
import org.example.*;

public class BusSender {
	EventBus eventBus;

	public static void main(String[] args) {
		BusSender busSender = new BusSender();
		var roomChange = new RoomChange("Change the Room!");
		busSender.send(roomChange);
	}

	public BusSender() {
		this.eventBus = new EventBus();
		eventBus.register(new TeacherClientListener());
		eventBus.register(new StudentClientListener());
		eventBus.register(new RoomClientListener());
		eventBus.register(new LehrplanClientListener());
		eventBus.register(new WatcherListener());
	}
	public void send(Object event) {
		eventBus.post(event);
	}
}