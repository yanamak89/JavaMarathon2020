package day6;

import java.util.Scanner;

class Motorbike {
    private int year;
    private String color;
    private String model;

    public Motorbike(int year, String color, String model) {
        this.year = year;
        this.color = color;
        this.model = model;
    }

    public Motorbike() {
    }

    public int getYear(int i) {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public String getColor(String black) {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel(String honda) {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void info() {
        System.out.println("Это мотоцикл");
    }

    int yearDifference() {
        Scanner scanner = new Scanner(System.in);
        int inputtedYear = scanner.nextInt();
        int difference = inputtedYear - year;
        return difference;
    }
}





