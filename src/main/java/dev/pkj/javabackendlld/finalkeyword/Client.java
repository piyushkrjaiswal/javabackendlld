package dev.pkj.javabackendlld.finalkeyword;

public class Client {
    public static void main(String[] args) {
        final int i = 1;
        Cat cat = new Cat();
        cat.setWeight(1);
        System.out.println(cat.getWeight());

        BlackDog dog = new BlackDog();
        dog.sound();

//        i = 2;
        System.out.println(i);

        final Cat cat1 = new Cat();
//        cat1 = new Cat(); // due to final reference variable
        cat1.setWeight(5);
        System.out.println(cat1.getWeight());

    }

}
