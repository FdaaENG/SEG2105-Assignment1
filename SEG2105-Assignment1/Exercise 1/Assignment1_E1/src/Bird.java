
public class Bird extends Animal{
	static int numberOfBirds;
	
	
	public Bird() {
		super();
		numberOfBirds++;
		System.out.println("Bird Constructor called");
	}
	
	public Bird(String name) {
		super(name);
		numberOfBirds++;
		System.out.println("Bird Constructor with name called");
	}
	
	public void makeSound() {
		System.out.println("Bird Sound");
	}
	
	public String getAnimalType() {
		return "Bird";
	}
	
	public static int getNumberOfBirds() {
		return numberOfBirds;
	}

}
