package de.riagade;

import com.google.common.eventbus.*;

public class WatcherListener {
	private static int eventsHandled;

	@Subscribe
	public void deadEvent(DeadEvent event) {
		eventsHandled++;
		System.out.printf("Watcher found dead event: %s%n", event);
	}
}
