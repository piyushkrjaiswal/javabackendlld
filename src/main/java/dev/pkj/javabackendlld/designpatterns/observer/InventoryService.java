package dev.pkj.javabackendlld.designpatterns.observer;

public class InventoryService implements OnOrderPlacedSubscriber{

    InventoryService() {
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.registerSubscriber(this);
    }

    @Override
    public void announceOrderPlaced() {
        System.out.println("Notify inventory");
    }
}
