package day04.solved;





public class Lion extends Animal {

	public Lion(String name) {
		super(name);		// Calling the constructor of Animal class
		System.out.println("Calling Child Constructor");
	}

	private void roar() {
		System.out.println("The " + getAge() + " year old " + getName() + " says: Roar!");
	}

	public static void main(String[] args) {
		Lion simba = new Lion("Simba");
		simba.setAge(10); // setAge() method was not defined in Lion; it is inherited from Animal
		simba.roar();
	}
}