package dev.pkj.javabackendlld.designpatterns.decorator;

public class VanillaScoop implements IceCream{
    private IceCream iceCream;

    VanillaScoop(IceCream iceCream) {
        this.iceCream = iceCream;
    }
    @Override
    public int getCost() {
        return iceCream.getCost() + 40;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + "Vanilla Scoop";
    }
}
