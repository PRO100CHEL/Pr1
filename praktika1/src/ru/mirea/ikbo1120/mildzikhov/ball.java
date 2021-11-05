package ru.mirea.ikbo1120.mildzikhov;
import java.lang.*;

public class ball
{
    private String club;
    private float pumping;
    public ball(String n, float p)
    {
        club = n;
        pumping = p;
        if (pumping > 100) {pumping = 100;}
        if (pumping < 0) {pumping = 0;}
    }
    public ball(String n)
    {
        club = n;
        pumping = 0;
    }
    public ball()
    {
        club = "Nameless";
        pumping = 0;
    }
    public void setClub(String n) {this.club = n;}
    public void pumpTheBall(float p)
    {
        this.pumping += p;
        if (this.pumping > 100) {pumping = 100;}
    }
    public void pumpOutTheBall(float p)
    {
        this.pumping -= p;
        if (this.pumping < 0) {pumping = 0;}
    }
    public String getClub() {return this.club;}
    public float getPumping() {return this.pumping;}
    public String toString() {return ("This is a ball from " + this.club + " club, pumped by " + this.pumping + "%");}
    public void kickStrength(float kick)
    {
        float kickStrength = this.pumping * kick;
        System.out.println("This ball from " + this.club + " club were flew away by the kick with " + kickStrength +
                " strength");
    }
}
