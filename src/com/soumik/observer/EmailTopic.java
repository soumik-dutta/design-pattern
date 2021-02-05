package com.soumik.observer;

import java.util.ArrayList;
import java.util.List;

public class EmailTopic implements Subject {
    public List<Observer> observers;
    private String message;

    public EmailTopic() {
        observers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        if (observer == null) {
            throw new NullPointerException("Null observer found");
        }
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void unregister(Observer observer) {
        if (observer == null) {
            throw new NullPointerException("Null observer found");
        }
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(Observer::update);
    }

    @Override
    public Object getUpdate(Observer observer) {
        return this.message;
    }

    public void postMessage(String message) {
        System.out.println("Message posted to my topic : " + message);
        this.message = message;
        notifyObservers();
    }
}
