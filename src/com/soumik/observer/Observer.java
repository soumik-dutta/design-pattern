package com.soumik.observer;

public interface Observer {
    void update();
    void setSubject(Subject subject);
}
