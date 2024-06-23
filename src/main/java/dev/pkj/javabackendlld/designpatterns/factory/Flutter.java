package dev.pkj.javabackendlld.designpatterns.factory;

public class Flutter {
    // Non factory method
    void refreshUi() {
        System.out.println("Refresh Ui");
    }

    void setTheme() {
        System.out.println("Set theme");
    }


    public UiFactory getUIFactory(SupportedPlatforms platform) {
        // delegating the responsibility to UiFactoryFactory - a helper class
        // THis is a practical factory
        return UiFactoryFactory.getUiFactoryForPlatform(platform);
    }
}
