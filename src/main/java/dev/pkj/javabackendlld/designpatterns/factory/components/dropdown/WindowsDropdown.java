package dev.pkj.javabackendlld.designpatterns.factory.components.dropdown;

public class WindowsDropdown implements Dropdown{
    @Override
    public void showDropdown() {
        System.out.println("This is Windows Dropdown");
    }

    @Override
    public void chooseDropdown() {
        System.out.println("Select from Windows Dropdown");
    }
}
