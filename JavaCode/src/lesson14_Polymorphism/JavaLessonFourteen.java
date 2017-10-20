package lesson14_Polymorphism;

public class JavaLessonFourteen {
	
	public static void main(String[] args) {
		Animals genericAnimal = new Animals();
		
		System.out.println(genericAnimal.getName()); // Animal - private
		System.out.println(genericAnimal.favFood); // Food - public
		System.out.println(genericAnimal.color); // random - protected
		
		Cat morris = new Cat("Morris", "Tuna", "Rubber Mouse", "Blue");
		
		System.out.println();
		
		System.out.println(morris.getName()); // Morris
		System.out.println(morris.favFood); // Tuna
		System.out.println(morris.favToy); // Rubber Mouse
		System.out.println(morris.color); // Blue
		
		// Polymorphism
		// Every Cat Is an Animal
		// Because every method & field in 'Animals' is in the class 'Cat'
		Animals tabby = new Cat("Tabby", "Salmon", "Ball", "Black");
		
		acceptAnimal(tabby);
	}
	
	public static void acceptAnimal(Animals randAnimal) {
		System.out.println();
		System.out.println(randAnimal.getName()); // Tabby
		System.out.println(randAnimal.favFood); // Salmon
		System.out.println();
		
		randAnimal.walkAround(); // Tabby stalks around. Java knows ranAnimal is Cat
		
		// Unresolved compilation problem: 
		// favToy cannot be resolved or is not a field
		// Because 'favToy' does not exist in 'Animals' class
		// System.out.println(randAnimal.favToy);
		
		// Add cast to 'Cat' and realize 'favToy'
		Cat tempCat = (Cat) randAnimal;
		System.out.println(tempCat.favToy); // Ball
		
		// Or
		System.out.println(((Cat)randAnimal).favToy); // Ball
		
		// If you want check an object is an instance of
		// or has the ability to access the methods and fields inside of a certain class
		if (randAnimal instanceof Cat) { // or Animals
			System.out.println(randAnimal.getName() + " is a Cat");
		}
	}

}
