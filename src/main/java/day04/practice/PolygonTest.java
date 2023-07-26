package day04.practice;

public class PolygonTest {

	    public static void main(String[] args) {
	        Rectangle rectangle = new Rectangle(4, 5);
	        System.out.println("Rectangle Area: " + rectangle.getArea());
	        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());
	        System.out.println("Rectangle Circumference: " + rectangle.getCircumference());

	        RightAngledTriangle triangle = new RightAngledTriangle(3, 4);
	        System.out.println("Triangle Area: " + triangle.getArea());
	        System.out.println("Triangle Perimeter: " + triangle.getPerimeter());
	        System.out.println("Triangle Circumference: " + triangle.getCircumference());
	    }


}


