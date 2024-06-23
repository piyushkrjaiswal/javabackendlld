package dev.pkj.javabackendlld.designpatterns.factory;

public class UiFactoryFactory {
    public static UiFactory getUiFactoryForPlatform(SupportedPlatforms platform) {
        if(platform.equals(SupportedPlatforms.ANDROID)) {
            return new AndroidUiFactory();
        } else if(platform.equals(SupportedPlatforms.WINDOWS)) {
            return new WindowsUiFactory();
        } else if(platform.equals(SupportedPlatforms.IOS)) {
            return new IosUiFactory();
        }

        return null;
    }
}
