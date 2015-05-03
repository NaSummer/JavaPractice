package assignment4;

import java.util.Scanner;

public class FindPet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Pet[] pet = new Pet[10];
		pet[0] = new Pet("Boby", "Dog", "Samoyed", "Female", new String[] {"White" }, new String[] {"Active", "Funny" });
		pet[1] = new Pet("Ann", "Dog", "Samoyed", "Male", new String[] {"Brown" }, new String[] {"Funny" });
		pet[2] = new Pet("Happy", "Dog", "Poodle", "Female", new String[] {"White" }, new String[] {"Elegant" });
		pet[3] = new Pet("Lucy", "Cat", "Siamese", "Female", new String[] {"Black", "White" }, new String[] {"Kingly", "Lazy" });
		pet[4] = new Pet("Suger", "Cat", "Persian", "Female", new String[] {"White" }, new String[] {"Lazy" });
		pet[5] = new Pet("Hash", "Cat", "Persian", "Male", new String[] {"Brown" }, new String[] {"Lazy" });
		pet[6] = new Pet("Standchi", "Cat", "Bombay", "Female", new String[] {"Black" }, new String[] {"Gentle" });
		pet[7] = new Pet("Jack", "Rabbit", "Dwarf", "Male", new String[] {"Black" }, new String[] {"Active", "Funny" });
		pet[8] = new Pet("Luck", "Rabbit", "Lop", "Female", new String[] {"Black", "White" }, new String[] {"Lazy", "Funny" });
		pet[9] = new Pet("Cookie", "Rabbit", "Hotot", "Female", new String[] {"Black", "White" }, new String[] {"Active", "Interesting" });
		
		boolean[] checklist = new boolean[10];
		for (int i = 0; i < checklist.length; i++) {
			checklist[i] = true;
		}
		
		// ask species
		if (isNoPet(checklist)) {
			System.out.println("Sorry, here is no pet you want.");
		} else {
			StringBuffer sb = new StringBuffer();
			System.out.println("Hello, do you want a dog, a cat or a rabbit?");
			sb.append(sc.nextLine());
			for (int i = 0; i < pet.length; i++) {
				if (!pet[i].getSpecies().equalsIgnoreCase(sb.toString())) {
					checklist[i] = false;
				}
			}
		}
		
		// ask breed
		if (isNoPet(checklist)) {
			System.out.println("Sorry, here is no pet you want.");
			return;
		} else {
			StringBuffer sb = new StringBuffer();
			System.out.println("Which breed do you prefer?");
			sb.append(sc.nextLine());
			for (int i = 0; i < pet.length; i++) {
				if (!pet[i].getBreed().equalsIgnoreCase(sb.toString())) {
					checklist[i] = false;
				}
			}
		}
		
		// ask gender
		if (isNoPet(checklist)) {
			System.out.println("Sorry, here is no pet you want.");
			return;
		} else {
			StringBuffer sb = new StringBuffer();
			System.out.println("Female or Male?");
			sb.append(sc.nextLine());
			if ( (sb.toString().equalsIgnoreCase("male")) || (sb.toString().equalsIgnoreCase("m")) ) {
				for (int i = 0; i < pet.length; i++) {
					if (!pet[i].getGender().equalsIgnoreCase("male")) {
						checklist[i] = false;
					}
				}
			} else if ( (sb.toString().equalsIgnoreCase("female")) || (sb.toString().equalsIgnoreCase("f")) ) {
				for (int i = 0; i < pet.length; i++) {
					if (!pet[i].getGender().equalsIgnoreCase("female")) {
						checklist[i] = false;
					}
				}
			}
		}
		
		// ask color
		if (isNoPet(checklist)) {
			System.out.println("Sorry, here is no pet you want.");
			return;
		} else {
			StringBuffer sb = new StringBuffer();
			System.out.println("Enter one color you like: ");
			sb.append(sc.nextLine());
			for (int i = 0; i < pet.length; i++) {
				if (!pet[i].isContainColor(sb.toString())) {
					checklist[i] = false;
				}
			}
		}
		
		// ask character
		if (isNoPet(checklist)) {
			System.out.println("Sorry, here is no pet you want.");
			return;
		} else {
			StringBuffer sb = new StringBuffer();
			System.out.println("Enter one character you like: ");
			sb.append(sc.nextLine());
			for (int i = 0; i < pet.length; i++) {
				if (!pet[i].isContainCharacter(sb.toString())) {
					checklist[i] = false;
				}
			}
		}
		
		// show the result
		if (isNoPet(checklist)) {
			System.out.println("Sorry, here is no pet you want.");
			return;
		} else {
			System.out.print("Here is ");
			int count = 0;
			for (int i = 0; i < checklist.length; i++) {
				if (checklist[i]) {
					count++;
					if (count==1) {
						System.out.print(pet[i].getName());						
					} else {
						System.out.print(", "+pet[i].getName());						
					}
				}
			}
			System.out.println("!");
		}
		
	}

	private static boolean isNoPet(boolean[] pet) {
		for (int i = 0; i < pet.length; i++) {
			if (pet[i]) {
				return false;
			}
		}
		return true;
	}
	
}
