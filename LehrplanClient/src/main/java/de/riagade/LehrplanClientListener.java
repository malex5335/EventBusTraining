package de.riagade;

import com.google.common.eventbus.*;

public class LehrplanClientListener {
	private static int eventsHandled;

	@Subscribe
	public void stringEvent(String event) {
		eventsHandled++;
		new LehrplanClient(event);
	}
}
