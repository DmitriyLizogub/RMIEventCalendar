package com.dmitriy.rmi.eventcalendar.service;

import com.dmitriy.rmi.eventcalendar.common.Event;
import com.dmitriy.rmi.eventcalendar.common.Person;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.GregorianCalendar;
import java.util.List;

public interface CalendarService extends Remote {

    void addEvent2(String name, String description, GregorianCalendar startDate, GregorianCalendar endDate, List<Person> attenders) throws RemoteException;

    Event removeEvent(String name) throws RemoteException;

    Event addAttender(String name, Person... newPersons) throws RemoteException;

    Event getEvent(String name) throws RemoteException;
}
