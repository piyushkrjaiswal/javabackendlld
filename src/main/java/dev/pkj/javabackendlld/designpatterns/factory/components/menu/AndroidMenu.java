package dev.pkj.javabackendlld.designpatterns.factory.components.menu;

public class AndroidMenu implements Menu{
    @Override
    public void showMenu() {
        System.out.println("Android Show Menu");
    }
}
