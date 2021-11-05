package ru.mirea.ikbo1120.mildzikhov;

import java.util.concurrent.SynchronousQueue;
import ru.mirea.ikbo1120.mildzikhov.classes.*;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Testing class Author: ");
        Author a1 = new Author("Alexander Belyaev", "heroOfThePresent@gmail.com", 'M');
        Author a2 = new Author("Agatha Christie", "nihilistCritic1818@gmail.com", 'W');
        a1.setEmail("heroOfThePresent@gmail.com");
        System.out.println(a1);
        System.out.println(a2);
        System.out.println();
        System.out.println("Testing class Ball: ");
        Ball b1 = new Ball(112.589, 33.1);
        b1.setY(100.2);
        b1.move(-10.34, 40);
        System.out.println(b1);
    }
}
