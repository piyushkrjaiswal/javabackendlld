package dev.pkj.javabackendlld.designpatterns.factory.components.button;

public class WindowsButton implements Button{
    @Override
    public void showButton() {
        System.out.println("This is windows button");
    }

    @Override
    public void clickButton() {
        System.out.println("Windows Button clicked");
    }
}
