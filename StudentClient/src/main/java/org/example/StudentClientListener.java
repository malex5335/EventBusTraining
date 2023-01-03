package org.example;

import com.google.common.eventbus.Subscribe;

public class StudentClientListener {
	private static int eventsHandled;

	@Subscribe
	public void stringEvent(String event) {
		eventsHandled++;
		new StudentClient(event);
	}
}
