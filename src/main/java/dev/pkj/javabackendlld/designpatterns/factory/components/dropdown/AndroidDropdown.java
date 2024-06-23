package dev.pkj.javabackendlld.designpatterns.factory.components.dropdown;

public class AndroidDropdown implements Dropdown{
    @Override
    public void showDropdown() {
        System.out.println("This is Android Dropdown");

    }

    @Override
    public void chooseDropdown() {
        System.out.println("Select from Dropdown");

    }
}
