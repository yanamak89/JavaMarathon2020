package day6;

import java.awt.desktop.ScreenSleepEvent;
import java.util.Scanner;

public class Car {
    private int year;
    private String color;
    private String model;

    public Car(int year, String color, String model) {
        this.year = year;
        this.color = color;
        this.model = model;
    }

    public Car() {
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void info() {
        System.out.println("Это автомобиль");
    }

    public int yearDifference(int inputtedYear) {
        return Math.abs(inputtedYear - year);
    }
}

