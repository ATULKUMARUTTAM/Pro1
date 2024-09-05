package org.atuluttam;

public class Student {
private int roll;
private String name;
private Laptop lap;





    public Student(Laptop lap) {
        this.lap = lap;
    }

    public Student() {
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }

    public void doAssignment()
    {
        lap.code();
    }
}
