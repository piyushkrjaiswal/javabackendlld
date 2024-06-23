package dev.pkj.javabackendlld.designpatterns.factory.components.button;

public class IosButton implements Button {
    @Override
    public void showButton() {
        System.out.println(" This is Ios button");
    }

    @Override
    public void clickButton() {
        System.out.println("Ios button clicked");
    }
}
