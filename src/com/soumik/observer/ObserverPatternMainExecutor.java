package com.soumik.observer;

import com.soumik.MainExecutor;

public class ObserverPatternMainExecutor implements MainExecutor {

    @Override
    public void execute() {
        EmailTopic topic = new EmailTopic();

        Observer observer1 =  new EmailTopicSubscriber("Sending email to Primary email");
        Observer observer2 =  new EmailTopicSubscriber("Sending email to Secondary email");
        Observer observer3 =  new EmailTopicSubscriber("Sending email to Alternate email");


        topic.register(observer1);
        topic.register(observer2);
        topic.register(observer3);

        observer1.setSubject(topic);
        observer2.setSubject(topic);
        observer3.setSubject(topic);

        observer1.update();

        topic.postMessage("Thank you for choosing Indigo");



    }
}
