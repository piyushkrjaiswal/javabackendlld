package dev.pkj.javabackendlld.designpatterns.factory;

import dev.pkj.javabackendlld.designpatterns.factory.components.button.Button;
import dev.pkj.javabackendlld.designpatterns.factory.components.button.IosButton;
import dev.pkj.javabackendlld.designpatterns.factory.components.dropdown.Dropdown;
import dev.pkj.javabackendlld.designpatterns.factory.components.dropdown.IosDropdown;
import dev.pkj.javabackendlld.designpatterns.factory.components.menu.IosMenu;
import dev.pkj.javabackendlld.designpatterns.factory.components.menu.Menu;

public class IosUiFactory implements UiFactory {

    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public Menu createMenu() {
        return new IosMenu();
    }

    @Override
    public Dropdown createDropdown() {
        return new IosDropdown();
    }
}
