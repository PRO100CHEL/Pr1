package ru.mirea.ikbo1120.mildzikhov;

import java.util.Stack;
import java.lang.String;

public class myStack
{
    private static myStack<Integer> firstDeck = new myStack<>(),
            secondDeck = new Stack<>();

    myStack(String[] first, String[] second)
    {
        for (int i = 4; i >= 0; i--)
        {
            firstDeck.add(Integer.parseInt(first[i]));
            secondDeck.add(Integer.parseInt(second[i]));
        }
    }
    public static String play(String[] first, String[] second)
    {
        new myStack(first, second);
        for (int i = 0; i < 106; i++)
        {
            if (firstDeck.size() == 0) return "second "+i;
            else if (secondDeck.size()== 0) return "first "+i;
            else
            {
                Integer a = firstDeck.pop();
                Integer b = secondDeck.pop();
                if (a == 0 && b == 9)
                {
                    firstDeck.add(0, a);
                    firstDeck.add(0, b);
                }
                else if (b == 0 && a == 9)
                {
                    secondDeck.add(0, a);
                    secondDeck.add(0, b);
                }
                else if(a > b)
                {
                    firstDeck.add(0, a);
                    firstDeck.add(0, b);
                }
                else
                {
                    secondDeck.add(0, a);
                    secondDeck.add(0, b);
                }
            }
        }
        return "bolda";
    }
}