package dev.pkj.javabackendlld.designpatterns.decorator;

public class Client {
    public static void main(String[] args) {
        IceCream iceCream = new ChocoChips(
                                new VanillaScoop(
                                    new StrawberryScoop(
                                        new ChocalateCone(
                                                new OrangeCone()
                                        )
                                    )
                                )
                            );

        System.out.println(iceCream.getDescription());
        System.out.println(iceCream.getCost());
    }
}
