package dev.pkj.javabackendlld.designpatterns.decorator;

public class ChocalateCone implements IceCream{
    private IceCream iceCream;

    ChocalateCone(IceCream iceCream) {
        this.iceCream = iceCream;
    }
    @Override
    public int getCost() {
        if(iceCream != null) {
            return iceCream.getCost() + 25;
        }

        return 25;
    }

    @Override
    public String getDescription() {
        if(iceCream != null) {
            return iceCream.getDescription() + "Chocalate Cone";
        }

        return "Chocalate Cone";
    }
}
