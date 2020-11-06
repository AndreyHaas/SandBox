package com.haas.nsk.andy.service;

public class EventServiceImpl implements EventService {

    @Override
    public void findEvent() {
        System.out.println("It is method findEvent()");
    }

    private void use() {
        findEvent();
    }
}
