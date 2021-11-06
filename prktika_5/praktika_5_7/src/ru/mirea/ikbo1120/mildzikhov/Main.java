package ru.mirea.ikbo1120.mildzikhov;
    /*
        7. Разложение на множители
        Дано натуральное число n>1. Выведите все простые множители этого
        числа в порядке не убывания с учетом кратности. Алгоритм должен иметь
        сложность O(logn)
     */
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        System.out.print(n+" = 1");
        try {decompose(n);}
        catch (RuntimeException ignored){ }
    }
    private static void decompose(long n) {decompose(n, 2);}
    private static void decompose(long n, int d)
    {
        if (n <= 1)
        {
            System.out.println();
            throw new RuntimeException();
        }
        if (n%d == 0)
        {
            System.out.print("*" + d);
            decompose(n/d, d);
        }
        else {decompose(n, d+1);}
    }
}
