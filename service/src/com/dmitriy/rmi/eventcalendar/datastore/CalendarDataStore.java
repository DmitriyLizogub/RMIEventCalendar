package com.dmitriy.rmi.eventcalendar.datastore;

import com.dmitriy.rmi.eventcalendar.common.Event;

public interface CalendarDataStore {

    void publish(Event event);

    Event remove(String eventName);

    Event getEvent(String name);
}
