package day9.Task2;

public class Rectangle extends Figure {
    private double length, weight;

    public Rectangle(String color, double length, double weight) {
        super(color);
        this.length = length;
        this.weight = weight;
    }

    //Если пол, то паркет
    @Override
    public double area() {
        return length * weight;
    }

    //Если пол - Вдоль стен, плинтус
    @Override
    public double perimeter() {
        return 2 * (length + weight);

    }
}
