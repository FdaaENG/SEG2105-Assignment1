
public abstract class  Animal implements SoundMaker{
	static int numberOfAnimals = 0;
	private String name;
	
	
	public Animal() {
		numberOfAnimals++;
		System.out.println("Animal Constructor called");
		this.name = "Unknown animal";
	}
	
	public Animal(String name) {
		numberOfAnimals++;
		System.out.println("Animal Constructor with name called");
		this.name = name;
		
	}
	public abstract String getAnimalType();
	
	public  static int getNumberOfAnimals() {
		return numberOfAnimals;
	}
	

}
