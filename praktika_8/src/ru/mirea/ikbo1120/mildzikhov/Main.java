package ru.mirea.ikbo1120.mildzikhov;

import java.util.Collection;

public class Main {

    public static void main(String[] args) {
        UnfairWaitList<Integer> unfairList  = new UnfairWaitList<>();
        BoundedWaitList<Integer> boundList = new BoundedWaitList<>(4);
        for(int i = 0; i < 6; i++){
            boundList.Add(i);
            unfairList.Add(i);
        }
        System.out.println("List contains ?" + boundList);
        System.out.println(boundList.Contains(2));
        System.out.println("Element that removed " + boundList.Remove());
        System.out.println(boundList);
        System.out.println(unfairList);
        unfairList.Remove(4);
        System.out.println(unfairList);
        unfairList.MoveToBack(3);
        System.out.println(unfairList);
    }
}