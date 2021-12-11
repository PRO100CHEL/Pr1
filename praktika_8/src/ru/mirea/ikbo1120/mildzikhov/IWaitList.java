package ru.mirea.ikbo1120.mildzikhov;

import java.util.Collection;

public interface IWaitList <E>{
    /**
     * Метод добавления
     * @param element - добавляемый элемент
     */
    void Add(E element);

    /**
     * Метод удаления
     * @return удаленный элемент
     */
    E Remove();

    /**
     * Входит ли элемент в список
     * @param element - элемент для проверки
     * @return - true of false
     */
    boolean Contains(E element);

    /**
     * Содержит ли в себе все элементы другой коллекции
     * @param collection
     * @return - true of false
     */
    boolean ContainsAll(Collection<E> collection);

    /**
     * Пустой ли список
     * @return - true of false
     */
    boolean IsEmpty();
}
