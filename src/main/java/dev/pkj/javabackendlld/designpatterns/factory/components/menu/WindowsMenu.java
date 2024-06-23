package dev.pkj.javabackendlld.designpatterns.factory.components.menu;

public class WindowsMenu implements  Menu{
    @Override
    public void showMenu() {
        System.out.println("Windows Menu shown");
    }
}
