package com.soumik.observer;

public class EmailTopicSubscriber implements Observer {
    private String name;
    private Subject topic;

    public EmailTopicSubscriber(String message) {
        this.name = message;
    }

    @Override
    public void update() {
        String message = (String) topic.getUpdate(this);
        if (message != null) {
            System.out.println(name + "Consuming message");
        } else {
            System.out.println(name + "No new message ");
        }

    }

    @Override
    public void setSubject(Subject subject) {
        this.topic = subject;
    }
}
