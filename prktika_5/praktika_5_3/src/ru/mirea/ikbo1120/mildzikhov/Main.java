package ru.mirea.ikbo1120.mildzikhov;

import java.util.Scanner;

public class Main
{
    public static void main(int a, int b, boolean flag)
    {
        if (a==b) System.out.print(a);
        else
        {
            System.out.println(a);
            main(flag ? a+1 : a-1, b, flag);
        }
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        main(a, b, a < b);
    }
}
