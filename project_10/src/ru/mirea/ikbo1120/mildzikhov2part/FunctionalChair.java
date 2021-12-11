package ru.mirea.ikbo1120.mildzikhov2part;

public class FunctionalChair implements Chair {
    public int sum(int a, int b)
    {
        return a+b;
    }
    public void sit()
    {
        System.out.println("Functional Chair");
    }
}