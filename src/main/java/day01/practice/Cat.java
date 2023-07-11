package day01.practice;


public class Cat {
    // Attributes
    private boolean hasStripes;
    private String color;

    // Getters and setters
    public boolean hasStripes() {
        return hasStripes;
    }

    public void setHasStripes(boolean hasStripes) {
        this.hasStripes = hasStripes;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Main method to create Cat objects
    public static void main(String[] args) {
        // Create two Cat objects
        Cat cat1 = new Cat();
        cat1.setColor("orange");
        cat1.setHasStripes(true);
        Cat cat2 = new Cat();
        cat2.setColor("black");
        cat2.setHasStripes(false);

        // Print the attributes of each Cat
        System.out.println("Cat 1:");
        System.out.println("Has Stripes: " + cat1.hasStripes());
        System.out.println("Color: " + cat1.getColor());

        System.out.println("Cat 2:");
        System.out.println("Has Stripes: " + cat2.hasStripes());
        System.out.println("Color: " + cat2.getColor());
    }
}
