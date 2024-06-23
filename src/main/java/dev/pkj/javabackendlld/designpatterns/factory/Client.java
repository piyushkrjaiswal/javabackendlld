package dev.pkj.javabackendlld.designpatterns.factory;

import dev.pkj.javabackendlld.designpatterns.factory.components.button.Button;
import dev.pkj.javabackendlld.designpatterns.factory.components.dropdown.Dropdown;
import dev.pkj.javabackendlld.designpatterns.factory.components.menu.Menu;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UiFactory uiFactory = flutter.getUIFactory(SupportedPlatforms.ANDROID);

        Button button = uiFactory.createButton();
        button.showButton();
        button.clickButton();

        Dropdown dropdown = uiFactory.createDropdown();
        dropdown.chooseDropdown();
        dropdown.showDropdown();

        Menu menu = uiFactory.createMenu();
        menu.showMenu();

    }
}
