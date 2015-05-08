package assignment4;

class TestPet {

	public static void main(String[] args) {

		Pet pet1 = new Pet("Boby", "Dog", "Samoyed", "Female", new String[] {
				"Black", "White" }, new String[] { "Active", "Funny" });
		
		System.out.println("Name: " + pet1.getName());
		System.out.println("Species: " + pet1.getSpecies());
		System.out.println("Breed: "+pet1.getBreed());
		System.out.println("Genger: " + pet1.getGender());
		
		System.out.print("Color: ");
		for (int i = 0; i < pet1.getColor().length-1; i++) {
			System.out.print(pet1.getColor()[i] + ", ");
		}
		System.out.println(pet1.getColor()[pet1.getColor().length-1]);
		
		System.out.print("Character: ");
		for (int i = 0; i < pet1.getCharacter().length-1; i++) {
			System.out.print(pet1.getCharacter()[i] + ", ");
		}
		System.out.println(pet1.getCharacter()[pet1.getCharacter().length-1]);
		
		System.out.println("Is Dog: " + pet1.isDog());
		
		System.out.println("Is Male: " + pet1.isMale());
		System.out.println("Is Female: " + !pet1.isMale());
		
		System.out.println("Is Contain Red Color: " + pet1.isContainColor("Red"));
		System.out.println("Is Contain White Color: " + pet1.isContainColor("White"));
		
		System.out.println("Is Modest: " + pet1.isContainCharacter("Modest"));
		System.out.println("Is Active: " + pet1.isContainCharacter("Active"));
		
	}

}
