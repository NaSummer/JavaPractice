package assignment4;

class Pet {
	/* ALL STRING IS IN LOWERCASE */
	private String name;
	private String species;
	private String breed;
	private boolean isMale;
	private String[] color;
	private String[] character;

	// ============Constructor==================
	public Pet() {
		// Blank...
	}

	public Pet(String name, String species, String breed, String gender,
			String[] color, String[] character) {
		setName(name);
		setSpecies(species);
		setBreed(breed);
		setGender(gender);
		setColor(color);
		setCharacter(character);
	}

	// ============Required Methods=============
	public boolean isDog() {
		if (species.equalsIgnoreCase("dog")) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isMale() {
		return isMale;
	}

	public boolean isContainColor(String color) {
		for (int i = 0; i < this.color.length; i++) {
			if (this.color[i].equalsIgnoreCase(color)) {
				return true;
			}
		}
		return false;
	}

	public boolean isContainCharacter(String character) {
		for (int i = 0; i < this.character.length; i++) {
			if (this.character[i].equalsIgnoreCase(character)) {
				return true;
			}
		}
		return false;
	}

	// ============Setter and Getter============
	public String getName() {
		return UpperFirstLetter(this.name);
	}

	private void setName(String name) {
		this.name = name.toLowerCase();
	}

	public String getSpecies() {
		return UpperFirstLetter(this.species);
	}

	private void setSpecies(String species) {
		this.species = species.toLowerCase();
	}

	public String getBreed() {
		return UpperFirstLetter(this.breed);
	}

	private void setBreed(String breed) {
		this.breed = breed.toLowerCase();
	}

	public String getGender() {
		if (this.isMale) {
			return "Male";
		} else {
			return "Female";
		}
	}

	private void setGender(String gender) {
		if ( (gender.equalsIgnoreCase("male")) || (gender.equalsIgnoreCase("m")) ) {
			this.isMale = true;			
		} else if ( (gender.equalsIgnoreCase("female")) || (gender.equalsIgnoreCase("f")) ) {
			this.isMale = false;
		}
	}

	public String[] getColor() {
		String[] color = new String[this.color.length];
		for (int i = 0; i < this.color.length; i++) {
			color[i] = UpperFirstLetter(this.color[i]);
		}
		return color;
	}

	private void setColor(String[] color) {
		this.color = new String[color.length];
		for (int i = 0; i < color.length; i++) {
			this.color[i] = color[i].toLowerCase();
		}
	}

	public String[] getCharacter() {
		String[] character = new String[this.character.length];
		for (int i = 0; i < this.character.length; i++) {
			character[i] = UpperFirstLetter(this.character[i]);
		}
		return character;
	}

	private void setCharacter(String[] character) {
		this.character = new String[character.length];
		for (int i = 0; i < character.length; i++) {
			this.character[i] = character[i].toLowerCase();
		}
	}
	
	// ============Useful Tools=================
	private String UpperFirstLetter(String str) {
		StringBuilder sb = new StringBuilder();
		sb.append(str.toUpperCase().charAt(0));
		sb.append(str.substring(1, str.length()));
		return sb.toString();
	}

}
