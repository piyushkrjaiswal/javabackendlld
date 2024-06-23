package dev.pkj.javabackendlld.designpatterns.factory;

import dev.pkj.javabackendlld.designpatterns.factory.components.button.Button;
import dev.pkj.javabackendlld.designpatterns.factory.components.button.WindowsButton;
import dev.pkj.javabackendlld.designpatterns.factory.components.dropdown.Dropdown;
import dev.pkj.javabackendlld.designpatterns.factory.components.dropdown.WindowsDropdown;
import dev.pkj.javabackendlld.designpatterns.factory.components.menu.Menu;
import dev.pkj.javabackendlld.designpatterns.factory.components.menu.WindowsMenu;

public class WindowsUiFactory implements UiFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Menu createMenu() {
        return new WindowsMenu();
    }

    @Override
    public Dropdown createDropdown() {
        return new WindowsDropdown();
    }
}
