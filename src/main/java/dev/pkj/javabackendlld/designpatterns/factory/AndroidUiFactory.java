package dev.pkj.javabackendlld.designpatterns.factory;

import dev.pkj.javabackendlld.designpatterns.factory.components.button.AndroidButton;
import dev.pkj.javabackendlld.designpatterns.factory.components.button.Button;
import dev.pkj.javabackendlld.designpatterns.factory.components.dropdown.AndroidDropdown;
import dev.pkj.javabackendlld.designpatterns.factory.components.dropdown.Dropdown;
import dev.pkj.javabackendlld.designpatterns.factory.components.menu.AndroidMenu;
import dev.pkj.javabackendlld.designpatterns.factory.components.menu.Menu;

public class AndroidUiFactory implements UiFactory {
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public Dropdown createDropdown() {
        return new AndroidDropdown();
    }
}
