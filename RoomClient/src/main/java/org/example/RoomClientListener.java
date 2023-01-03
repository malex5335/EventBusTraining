package org.example;

import com.google.common.eventbus.Subscribe;

public class RoomClientListener {
	private static int eventsHandled;

	@Subscribe
	public void stringEvent(String event) {
		eventsHandled++;
		new RoomClient(event);
	}

	@Subscribe
	public void roomChangeEvent(RoomChange event) {
		eventsHandled++;
		new RoomClient(event.message());
	}
}
