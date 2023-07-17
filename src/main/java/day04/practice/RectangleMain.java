package day04.practice;
class Rectangle {
    protected double length;
    protected double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public double calculateArea() {
        return length * breadth;
    }
}

class Square extends Rectangle {
    public Square(double sideLength) {
        super(sideLength, sideLength);
    }
}

public class RectangleMain {
    public static void main(String[] args) {
        Square square = new Square(5);

        // Accessing the getLength method using the Square object
        double length = square.getLength();
        System.out.println("Length of the square: " + length);

        // Accessing the calculateArea method using the Square object
        double area = square.calculateArea();
        System.out.println("Area of the square: " + area);
    }
}
