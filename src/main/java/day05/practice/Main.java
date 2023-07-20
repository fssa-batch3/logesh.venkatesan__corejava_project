package day05.practice;



//Abstract Polygon class
abstract class Polygon {
 abstract double area();
 abstract double perimeter();
 abstract double circumference();
}

//Rectangle class extending Polygon
class Rectangle extends Polygon {
 private double length;
 private double width;

 public Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }

 @Override
 double area() {
     return length * width;
 }

 @Override
 double perimeter() {
     return 2 * (length + width);
 }

 @Override
 double circumference() {
     return 2 * (length + width);
 }
}

//RightAngledTriangle class extending Polygon
class RightAngledTriangle extends Polygon {
 private double base;
 private double height;

 public RightAngledTriangle(double base, double height) {
     this.base = base;
     this.height = height;
 }

 @Override
 double area() {
     return (base * height) / 2;
 }

 @Override
 double perimeter() {
     double hypotenuse = Math.sqrt(base * base + height * height);
     return base + height + hypotenuse;
 }

 @Override
 double circumference() {
     return base + height + Math.sqrt(base * base + height * height);
 }
}

//Example usage
public class Main {
 public static void main(String[] args) {
     Rectangle rectangle = new Rectangle(4, 6);
     System.out.println("Rectangle:");
     System.out.println("Area: " + rectangle.area());
     System.out.println("Perimeter: " + rectangle.perimeter());
     System.out.println("Circumference: " + rectangle.circumference());

     System.out.println();

     RightAngledTriangle triangle = new RightAngledTriangle(3, 4);
     System.out.println("Right-Angled Triangle:");
     System.out.println("Area: " + triangle.area());
     System.out.println("Perimeter: " + triangle.perimeter());
     System.out.println("Circumference: " + triangle.circumference());
 }
}
