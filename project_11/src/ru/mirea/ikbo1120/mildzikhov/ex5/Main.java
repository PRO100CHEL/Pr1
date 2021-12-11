package ru.mirea.ikbo1120.mildzikhov.ex5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws IOException
    {
//        System.out.println("Введите абсолютный путь к файлу:");
//        Scanner scanner = new Scanner(System.in);
//        String file = scanner.nextLine();
        String file = "B:\\Java programs\\project_11\\src\\ru\\mirea\\ikbo1120\\mildzikhov\\ex5";
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String input = reader.readLine();
        StringBuilder result = getLine(input.split(" "));
        System.out.println(result);
    }

    static StringBuilder getLine(String... input)
    {
        StringBuilder result = new StringBuilder();
        result.append(input[0]);
        for (int i = 1; i < input.length; i++)
        {
            int j = 0;
            while (!(input[j].charAt(0) == (result.charAt(result.length()-1)))) j++;
            result.append(" " + input[j]);
            input[j] = " ";
        }
        return result;
    }
}