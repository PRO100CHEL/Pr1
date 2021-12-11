package ru.mirea.ikbo1120.mildzikhov;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<E> implements IWaitList{
    /**
     * Очередь
     */
    ConcurrentLinkedQueue<E> content;

    /**
     * Конструктор класса WaitList
     */
    public WaitList(){content = new ConcurrentLinkedQueue<>();}

    /**
     * Конструктор класса WaitList
     * @param collection - коллекция для заполнения
     */
    public WaitList(Collection<E> collection){this.content = (ConcurrentLinkedQueue<E>) collection;}
    @Override
    public void Add(Object element) {content.add((E) element);}
    @Override
    public Object Remove() {return content.remove();}
    @Override
    public boolean Contains(Object element) {return content.contains(element);}
    @Override
    public boolean ContainsAll(Collection collection) {return content.containsAll(collection);}
    @Override
    public boolean IsEmpty() {return content.isEmpty();}
    @Override
    public String toString() {
        return "WaitList{" +
                "content=" + content +
                '}';
    }
}