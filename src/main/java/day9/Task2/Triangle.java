package day9.Task2;

public class Triangle extends Figure {
    private double a, b, c;


    public Triangle(String color, double a, double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // произведение сторон
    //формула Герона
    @Override
    public double area() {
        double halfP = perimeter() / 2;
        return Math.sqrt(halfP * (halfP - a) * (halfP - b) * (halfP - c));
    }

    //Сумма всех сторон
    @Override
    public double perimeter() {
        return a + b + c;
    }
}
