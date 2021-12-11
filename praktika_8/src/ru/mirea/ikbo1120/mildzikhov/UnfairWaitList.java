package ru.mirea.ikbo1120.mildzikhov;

public class UnfairWaitList <E> extends WaitList{
    /**
     * Конструктор класса UnfairWaitList
     */
    public UnfairWaitList(){}

    /**
     * Метод удаляет элемент
     * @param element элемент для удаления
     */
    public void Remove(E element) {content.remove(element);}

    /**
     * Метод переносит элемент в конец списка если он в нем находится
     * @param element элемент для переноса
     */
    public void MoveToBack(E element)
    {
        if(content.contains(element)){
            content.add(element);
            content.remove(element);
        }
    }
}
