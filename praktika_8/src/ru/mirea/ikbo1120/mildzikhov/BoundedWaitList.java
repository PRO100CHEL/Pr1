package ru.mirea.ikbo1120.mildzikhov;

public class BoundedWaitList <E> extends WaitList {
    /**
     * Возможное количество элементов
     */
    private int capacity;

    /**
     * Конструктор класса BoundedWaitList
     * @param capacity - возможное количество элементов
     */
    public BoundedWaitList(int capacity){this.capacity = capacity;}

    /**
     * Гетер возможного количества элементов
     * @return возможное количество элементов
     */
    public int GetCapacity() {return capacity;}
    @Override
    public void Add(Object element) {
        if(content.size() < capacity)
            super.Add(element);
    }
    @Override
    public String toString() {
        return "BoundedWaitList{" +
                "capacity=" + capacity +
                ", content=" + content +
                '}';
    }
}
