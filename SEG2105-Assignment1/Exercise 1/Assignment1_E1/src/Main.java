
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Animal> animals = new ArrayList<>();
		ArrayList<Mammal> mammals = new ArrayList<>();
		ArrayList<Bird> birds = new ArrayList<>();
		ArrayList<Dog> dogs = new ArrayList<>();
		ArrayList<Parrot> parrots = new ArrayList<>();
		
		
		

		mammals.add(new Mammal());
		mammals.add(new Mammal());
		mammals.add(new Mammal("m1"));
		mammals.add(new Mammal("m2"));
		
		
		

		birds.add(new Bird());
		birds.add(new Bird());
		birds.add(new Bird("b1"));
		birds.add(new Bird("b2"));
		

		dogs.add(new Dog());
		dogs.add(new Dog());
		dogs.add(new Dog("d1"));
		dogs.add(new Dog("d2"));
		
		
		parrots.add(new Parrot());
		parrots.add(new Parrot());
		parrots.add(new Parrot("p1"));
		parrots.add(new Parrot("p2"));
		System.out.println();
		
		
		System.out.println("Mammals making sounds:");	
		for(Mammal mammal :mammals) {
			mammal.makeSound();
		}
		System.out.println();
		

		System.out.println("Birds making sounds:");	
		for(Bird bird :birds) {
			bird.makeSound();
		}
		System.out.println();
		
		System.out.println("Dogs making sounds:");	
		for(Dog dog :dogs) {
			dog.makeSound();
		}
		System.out.println();
		
		System.out.println("Parrot making sounds:");	
		for(Parrot parrot :parrots) {
			parrot.makeSound();
		}
		System.out.println();
		
		System.out.println("Total number of animals: "+Animal.getNumberOfAnimals());
		System.out.println("Total number of mammals: "+Mammal.getNumberOfMammals());
		System.out.println("Total number of birds: "+Bird.getNumberOfBirds());
		
	}

}
