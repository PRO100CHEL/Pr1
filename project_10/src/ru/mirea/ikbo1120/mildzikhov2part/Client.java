package ru.mirea.ikbo1120.mildzikhov2part;

public class Client{
    private Chair chair;
    public void sit() {
        chair.sit();
    }
    public void setChair(Chair chair)
    {
        this.chair=chair;
    }
}
