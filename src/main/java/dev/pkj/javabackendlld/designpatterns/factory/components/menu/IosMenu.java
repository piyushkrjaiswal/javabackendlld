package dev.pkj.javabackendlld.designpatterns.factory.components.menu;

public class IosMenu implements Menu {
    @Override
    public void showMenu() {
        System.out.println("Ios Menu Shown");
    }
}
