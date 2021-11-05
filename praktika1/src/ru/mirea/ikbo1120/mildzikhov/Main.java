package ru.mirea.ikbo1120.mildzikhov;
import java.io.*;
import ru.mirea.ikbo1120.mildzikhov.ball;
import ru.mirea.ikbo1120.mildzikhov.Books;
import ru.mirea.ikbo1120.mildzikhov.Dogs;

public class Main {
    public static void main(String[] args)
    {

        System.out.println("Testing Doge objects:");
        Dogs x1 = new Dogs("Sharik", 5);
        Dogs x2 = new Dogs("Kusya");
        x2.setAge(10);
        x1.setName("Volodya");
        System.out.println(x1);
        System.out.println(x2);
        x1.intoHumanAge();
        x2.intoHumanAge();
        System.out.println();

        System.out.println("Testing Ball objects:");
        ball y1 = new ball("Spartak", 95.4F);
        ball y2 = new ball();
        y2.setClub("Zenit");
        y2.pumpTheBall(67.15F);
        y1.pumpOutTheBall(11);
        System.out.println(y1);
        System.out.println(y2);
        y1.kickStrength(62);
        y2.kickStrength(57);
        System.out.println();

        System.out.println("Testing Book objects:");
        Books z1 = new Books("We", 224, 192);
        Books z2 = new Books("Crime and punishment", 331);
        z2.setBookmark(64);
        System.out.println(z1);
        System.out.println(z2);
        z1.symbolsCount(14);
        z2.symbolsCount(16);

    }
}