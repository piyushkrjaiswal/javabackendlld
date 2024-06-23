package dev.pkj.javabackendlld.designpatterns.observer;

public class Client {
    public static void main(String[] args) {
        // observer design pattern is basically for a publisher-subscriber problem
        // whenever some events happen, we want to do a lot of things, everytime we want to add/remove action that we want to do
        // we will have to do code changes
        // but this add/remove action we want to perform at runtime.
        // so we reverse the dependencies i.e.,
        // All the classes(subscriber) want to execute themselves in case the event takes place(publisher).
        Flipkart flipkart = Flipkart.getInstance();
        EmailService emailService = new EmailService();
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        InventoryService inventoryService = new InventoryService();

        InventoryService inventoryService1 = new InventoryService();
        EmailService emailService1 = new EmailService();

        flipkart.onOrderPlaced();
    }
}
