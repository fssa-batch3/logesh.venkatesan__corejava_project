package day01.practice;

public class Cat {
    // Attributes
    private int Age;
    private String color;
private String Speak;

    // Getters and setters


    public void setAge(int age) {
    	Age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public String getSpeak() {
        return Speak;
    }

    public void setSpeak(String Speak) {
        this.Speak = Speak;
    }

    // Main method to create Dog objects
    public static void main(String[] args) {
        // Create two Dog objects
    	Cat cat1 = new Cat();
    	cat1.setColor("purple");
    	cat1.setAge(12);
    	cat1.setSpeak("Meow");
        Cat cat2 = new Cat();
        cat1.setColor("blue");
        cat1.setAge(10);
        cat1.setSpeak("Mew");

        // Print the attributes of each Dog
        System.out.println("Cat 1:");
        System.out.println("Age: " + cat1.setAge());
        System.out.println("Color: " + cat1.getColor());
        System.out.println("Speaks: " + cat1.setSpeak());

        System.out.println("Cat 2:");
        System.out.println("Has Dots: " + cat2.setAge());
        System.out.println("Color: " + cat2.getColor());
        System.out.println("Speaks: " + cat1.setSpeak());
    }
}
//Cat 1:
//Age: 4
//Color: White
//Speaks: Meow!
//Cat 2:
//Age: 3
//Color: Black
//Speaks: Meow!


