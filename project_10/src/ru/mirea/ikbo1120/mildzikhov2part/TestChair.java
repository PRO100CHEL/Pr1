package ru.mirea.ikbo1120.mildzikhov2part;

public class TestChair {
    public static void main(String[] args)
    {
        ChairFactory chairFactory1 = new ChairFactory();
        MagicianChair chair = chairFactory1.createMagicianChair();
        chair.doMagic();
        FunctionalChair chair1 = chairFactory1.createFunctionalChair();
        System.out.println(chair1.sum(5,1));
        VictorianChair chair2 = chairFactory1.createVictorianChair();
        System.out.println(chair2.getAge());
        chair.sit();
        chair1.sit();
        chair2.sit();
    }
}
