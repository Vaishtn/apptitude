package com.xworkz.cockroach.Event;

public class ExceptionalEvent {
	public ExceptionalEvent() {
		System.out.println("Created ExceptionalEvent");
	}

	public void createExceptionalEvent(boolean create) throws Throwable {
		System.out.println("invoked createExceptionalEvent");
		if (create) {
			System.out.println("creating exceptional event");
			Throwable throwable = new Throwable();
			throw throwable;
		} else {
			System.out.println("no exceptional event");
		}
	}



}
