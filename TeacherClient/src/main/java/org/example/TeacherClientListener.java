package org.example;

import com.google.common.eventbus.Subscribe;

public class TeacherClientListener {
	private static int eventsHandled;

	@Subscribe
	public void stringEvent(String event) {
		eventsHandled++;
		new TeacherClient(event);
	}
}
