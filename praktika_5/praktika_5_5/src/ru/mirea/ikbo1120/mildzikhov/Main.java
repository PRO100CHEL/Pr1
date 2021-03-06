package ru.mirea.ikbo1120.mildzikhov;
 /*
        5. Сумма цифр числа
        Дано натуральное число N. Вычислите сумму его цифр.
        При решении этой задачи нельзя использовать строки, списки, массивы (ну
        и циклы, разумеется).
 */
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        countSum(n);
    }
    public static void countSum(int n) {countSum(n, 0);}
    public static void countSum(int n, int sum)
    {
        if (n == 0) System.out.println(sum);
        else
        {
            sum += n%10;
            countSum(n/10, sum);
        }
    }
}
