package dev.pkj.javabackendlld.designpatterns.factory.components.button;

public class AndroidButton implements Button {
    @Override
    public void showButton() {
        System.out.println("This is Android Button");
    }

    @Override
    public void clickButton() {
        System.out.println("Android Button is clicked");

    }
}
