package dev.pkj.javabackendlld.designpatterns.factory.components.dropdown;

public class IosDropdown implements Dropdown{
    @Override
    public void showDropdown() {
        System.out.println("This is Ios Dropdown");
    }

    @Override
    public void chooseDropdown() {
        System.out.println("Select from Ios Dropdown");
    }
}
