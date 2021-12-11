package ru.mirea.ikbo1120.mildzikhov.ex4;

public class Main
{
    public static void main(String[] args)
    {
        String str = "89011844496";
        System.out.println(myString.normalize(str));

        String str1 = "+79011844496";
        System.out.println(myString.normalize(str1));

        String str2 = "9011844496";
        System.out.println(myString.normalize(str2));
    }
}
class myString
{
    public static String normalize(String str)
    {
        if (str.length()>12 || str.length()<11 || (!str.startsWith("+") && !str.startsWith("8"))) return "incorrect input";
        StringBuffer temp = new StringBuffer(str);
        if (str.startsWith("8")) temp.replace(0,1,"+7");
        temp.insert(5, "-");
        temp.insert(9, "-");
        return temp.toString();
    }
}