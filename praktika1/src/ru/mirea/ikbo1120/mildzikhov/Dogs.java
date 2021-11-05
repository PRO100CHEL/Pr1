package ru.mirea.ikbo1120.mildzikhov;

public class Dogs {
    private String name;
    private int age;
    public Dogs(String n, int a)
    {
        name = n;
        age = a;
    }
    public Dogs(String n)
    {
        name = n;
        age = 0;
    }
    public Dogs()
    {
        name = "Pup";
        age = 0;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(String name){
        return name;
    }
    public int getAge() {
        return age;
    }
    public String toString(){
        return this.name+", age "+this.age;
    }
    public void intoHumanAge(){
        System.out.println(name+"'s age in human years is "+age*7+" years");
    }
}
