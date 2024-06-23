package dev.pkj.javabackendlld.designpatterns.decorator;

public class ChocoChips implements IceCream{
    private IceCream iceCream;

    ChocoChips(IceCream iceCream) {
        this.iceCream = iceCream;
    }
    @Override
    public int getCost() {
        return iceCream.getCost() + 20;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + "Chocalate chips";
    }
}
