package dev.pkj.javabackendlld.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Flipkart {
    private static Flipkart instance = null;

    private Flipkart(){

    }

    private List<OnOrderPlacedSubscriber> onOrderPlacedSubscriberList = new ArrayList<>();

    public static Flipkart getInstance() {
        if(instance == null) {
            instance =  new Flipkart();
        }

        return instance;
    }

    void registerSubscriber(OnOrderPlacedSubscriber onOrderPlacedSubscriber) {
        onOrderPlacedSubscriberList.add(onOrderPlacedSubscriber);
    }

    void deRegisterSubscriber(OnOrderPlacedSubscriber onOrderPlacedSubscriber) {
        onOrderPlacedSubscriberList.remove(onOrderPlacedSubscriber);
    }

    public void onOrderPlaced() {
        for(OnOrderPlacedSubscriber onOrderPlacedSubscriber: onOrderPlacedSubscriberList) {
            onOrderPlacedSubscriber.announceOrderPlaced();
        }

    }
}
