package dev.pkj.javabackendlld.designpatterns.factory;

import dev.pkj.javabackendlld.designpatterns.factory.components.button.Button;
import dev.pkj.javabackendlld.designpatterns.factory.components.dropdown.Dropdown;
import dev.pkj.javabackendlld.designpatterns.factory.components.menu.Menu;

public interface UiFactory {
    // Factory method

    Button createButton();
    Menu createMenu();

    Dropdown createDropdown();


}
