package proj01.part1;

class MiniChampion {

	/**
	 * the Champions name health attack damage armor abilityName1 abilityDamage1
	 * 
	 * A Class Name Two constructors Five get***() methods Five set***() methods
	 */

	private String name;
	private double health;
	private double[] attackDamage;
	private double armor;
	private double[] defense;
	// private int numOfAbility;
	private String[] abilityName;
	private double[] abilityData;
	private int[] abilityType;

	// abilityType
	// 1: attack damage directly
	// 2: next attack damage add percentage attack damage
	// 3: next defense add percentage
	// 4: add next attack damage
	// 5: add next defense
	// 6: recover the health
	//
	// 7: do nothing but laugh
	// 8: do not use ability and attack directly
	// 9: do not use ability and defense

	public MiniChampion() {
		setName("Garen");
		setHealth(4000);
		setAttackDamage(new double[] { 100, 500 });
		setArmor(90);
		setDefense(new double[] { 22.1, 42.1 });
		setAbilityName(new String[] { "Decisive Strike" });
		setAbilityData(new double[] { 900 });
		setAbilityType(new int[] { 1 });
	}

	public MiniChampion(String name, double health, double[] attackDamage,
			double armor, double[] defense, String[] abilityName,
			double[] abilityData, int[] abilityType) {
		// this.abilityDamage = abilityDamage;
		// this.abilityName = abilityName;
		// this.armor = armor;
		// this.attackDamage = attackDamage;
		// this.defense = defense;
		// this.health = health;
		// this.name = name;
		setName(name);
		setHealth(health);
		setAttackDamage(attackDamage);
		setArmor(armor);
		setDefense(defense);
		setAbilityName(abilityName);
		setAbilityData(abilityData);
		setAbilityType(abilityType);
	}

	public void printChampionInfo() {
		System.out.println("Name: " + this.name);
		// System.err.println(this.name);
		System.out.println("Health: " + this.health);
		// System.err.println(this.health);
		System.out.println("Attack Damage: " + this.attackDamage[0] + "~"
				+ this.attackDamage[1]);
		// System.err.println(this.attackDamage[0] + "~" +
		// this.attackDamage[1]);
		System.out.println("Armor: " + this.armor);
		// System.err.println(this.armor);
		System.out.println("Defense: " + this.defense[0] + "~"
				+ this.defense[1]);
		// System.err.println(this.defense[0] + "~" + this.defense[1]);
		for (int i = 0; i < this.abilityData.length; i++) {
			System.out.print("Ability");
			if (this.abilityData.length > 1) {
				System.out.print(i + 1);
			}
			System.out.println();

			System.out.print("\tName: ");
			System.out.println(this.abilityName[i]);
			System.out.print("\tDescribe: ");
			if (this.abilityType[i] == 1) {
				System.out.println("Attack the target directly with "
						+ this.abilityData[i] + " damage.");
			} else if (this.abilityType[i] == 2) {
				System.out.println("Next attack will create "
						+ ((int) this.abilityData[i] * 100)
						+ "% damage to the target.");
			} else if (this.abilityType[i] == 3) {
				System.out.println("Next defense will be "
						+ ((int) this.abilityData[i] * 100) + "%.");
			} else if (this.abilityType[i] == 4) {
				System.out.println("Next attack will add "
						+ this.abilityData[i] + " damage.");
			} else if (this.abilityType[i] == 5) {
				System.out.print("Next defense will add " + this.abilityData[i]
						+ " point");

				if ((int) this.abilityData[i] > 1) {
					System.out.println(".");
				} else {
					System.out.println("s.");
				}
			} else if (this.abilityType[i] == 6) {
				System.out.print("Recover own health "
						+ ((int) this.abilityData[i]) + " point");

				if ((int) this.abilityData[i] > 1) {
					System.out.println(".");
				} else {
					System.out.println("s.");
				}
			}
		}

	}

	public void showChampionStatus() {
		// System.out.print(this.name + " ");
		System.err.println(this.name + "'s Health: " + this.health);
		// System.err.println(this.health);
		// TODO

	}

	public void showAbilityOverview() {
		// System.out.println("1. Add your attack damage;");
		System.out.println("1. Attack the target with ability damage.");
		System.out.println("2. Recover your champion's health.");
	}

	// ========following is getter and setter===========
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHealth() {
		return health;
	}

	public void setHealth(double health) {
		this.health = health;
	}

	public double[] getAttackDamage() {
		return attackDamage;
	}

	public void setAttackDamage(double[] attackDamage) {
		this.attackDamage = attackDamage;
	}

	public double getArmor() {
		return armor;
	}

	public void setArmor(double armor) {
		this.armor = armor;
	}

	public double[] getDefense() {
		return defense;
	}

	public void setDefense(double[] defense) {
		this.defense = defense;
	}

	public String[] getAbilityName() {
		return abilityName;
	}

	public void setAbilityName(String[] abilityName) {
		this.abilityName = abilityName;
	}

	public double[] getAbilityData() {
		return abilityData;
	}

	public void setAbilityData(double[] abilityData) {
		this.abilityData = abilityData;
	}

	public int[] getAbilityType() {
		return abilityType;
	}

	public void setAbilityType(int[] abilityType) {
		this.abilityType = abilityType;
	}

}
