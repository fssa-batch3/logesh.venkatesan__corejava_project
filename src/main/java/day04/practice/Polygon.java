

package day04.practice;

abstract class Polygon {
    abstract double getArea();

    abstract double getPerimeter();

    abstract double getCircumference();
}

class Rectangle extends Polygon {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double getArea() {
        return length * width;
    }

    @Override
    double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    double getCircumference() {
        return 2 * (length + width);
    }
}

class RightAngledTriangle extends Polygon {
    private double base;
    private double height;
    private Rectangle rectangle;

    public RightAngledTriangle(double base, double height) {
        this.base = base;
        this.height = height;
        this.rectangle = new Rectangle(base, height);
    }

    @Override
    double getArea() {
        return rectangle.getArea() / 2;
    }

    @Override
    double getPerimeter() {
        return base + height + Math.sqrt(base * base + height * height);
    }

    @Override
    double getCircumference() {
        return rectangle.getCircumference() + base + height;
    }
}








