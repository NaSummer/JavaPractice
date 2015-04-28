package proj01.part2;

class Champion {

	/**
	 * the Champions name health attack damage armor abilityName1
	 * abilityDamage1
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
	private int abilityNum;
	private boolean isAddNextAttackDamageByPercentage;
	private boolean isAddNextAttackDamageDirectly;
	private boolean isAddNextDefenseByPercentage;
	private boolean isAddNextDefenseDirectly;

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

	public Champion() {
		setName("Garen");
		setHealth(4000);
		setAttackDamage(new double[] { 100, 500 });
		setArmor(90);
		setDefense(new double[] { 22.1, 42.1 });
		setAbilityName(new String[] { "Decisive Strike" });
		setAbilityData(new double[] { 900 });
		setAbilityType(new int[] { 1 });
		setIsAddNextAttackDamageByPercentage(false);
		setIsAddNextAttackDamageDirectly(false);
		setIsAddNextDefenseByPercentage(false);
		setIsAddNextDefenseDirectly(false);
	}

	public Champion(String name, double health, double[] attackDamage,
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
		setIsAddNextAttackDamageByPercentage(false);
		setIsAddNextAttackDamageDirectly(false);
		setIsAddNextDefenseByPercentage(false);
		setIsAddNextDefenseDirectly(false);
	}

	public void printChampionInfo() {
		System.out.println("Name: "+this.name);
//		System.err.println(this.name);
		System.out.println("Health: "+this.health);
//		System.err.println(this.health);
		System.out.println("Attack Damage: "+this.attackDamage[0] + "~" + this.attackDamage[1]);
//		System.err.println(this.attackDamage[0] + "~" + this.attackDamage[1]);
		System.out.println("Armor: "+this.armor);
//		System.err.println(this.armor);
		System.out.println("Defense: "+this.defense[0] + "~" + this.defense[1]);
//		System.err.println(this.defense[0] + "~" + this.defense[1]);
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
				System.out.print("Next defense will add "
						+ this.abilityData[i] + " point");

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
//		System.out.print(this.name + " ");
		System.err.println(this.name+"'s Health: "+this.health);
//		System.err.println(this.health);
		if (this.isAddNextAttackDamageByPercentage) {
			System.err
					.println("If you attrack the target this turn, your attact damage will be from "
							+ ((int) (attackDamage[0] * 100))
							+ " to "
							+ ((int) (attackDamage[1] * 100)) + " points.");
		}
		//TODO 

	}
	
	public void showAbilityOverview() {
//		System.out.println("1. Add your attack damage;");
		System.out.println("1. Attack the target with ability damage.");
		System.out.println("2. Recover your champion's health.");
	}
	
	public void activity(Champion target, int activityType) {
		// activityType
		// 1: do nothing but laugh
		// 2: do not use ability and attack directly
		// 3: do not use ability and defense
		///
		// 4: attack damage directly using ability
		//
		// 5: next attack damage add percentage attack damage
		// 6: next defense add percentage
		// 7: add next attack damage
		// 8: add next defense
		// 9: recover the health
		
		double targetDefense = 0;
		double targetAttack = 0;
		int targetActivity = (int) (Math.random()*4+1);
		switch (targetActivity) {
		case 1:
			System.err.println(target.getName() + " does nothing but laugh.");
			System.err.println("Hahahahahahaha!!!!~~~~");
			break;
		case 2:
			targetAttack = Math.round((Math.random()*(target.getAttackDamage()[1]-target.getAttackDamage()[0])+target.getAttackDamage()[0])*10)/10;
			targetDefense = target.getArmor();
			break;
		case 3:
			targetDefense = Math.random()*(target.getDefense()[1]-target.getDefense()[0])+target.getDefense()[0]+target.getArmor();
			break;
		case 4:
			System.err.println(target.getName()+" uses ability, "+getAbilityName()[0]);
			targetAttack = Math.round((Math.random()*(target.getAttackDamage()[1]-target.getAttackDamage()[0])+target.getAttackDamage()[0])*10+target.getAbilityData()[0])/10;
			break;
		}
		
		//TODO
		double myAttack = 0;
		double tmpDamage = 0;
		double myDamaged = 0;
		switch (activityType) {
		case 1:
			System.err.println(this.name + " does nothing but laugh.");
			System.err.println("Hahahahahahaha!!!!~~~~");
			break;
		case 2:
			myAttack = Math.random()*(this.attackDamage[1]-this.attackDamage[0])+this.attackDamage[0];
			tmpDamage = Math.round((myAttack-targetDefense)*10)/10;
			if (tmpDamage>0) {
				System.err.println(this.name+" attacked "+target.getName()+" and create "+tmpDamage+" point damage.");
//				System.err.print(tmpDamage);
//				System.out.println(" point damage.");
				target.setHealth(target.getHealth()-tmpDamage);
			} else {
				System.err.println(this.name+" did not create the damage to "+target.getName());
			}
			myDamaged = Math.round((targetAttack - this.armor)*10)/10;
			if (myDamaged>0) {
				System.err.println(this.name+" was attacked by "+target.getName()+" and create "+myDamaged+" point damage.");
//				System.err.print(myDamaged);
//				System.out.println(" point damage.");
				this.health = this.health-myDamaged;
			} else {
				System.err.println(this.name+" did not be attacked by "+target.getName() + " successfully.");
			}
			break;
					case 3:
			myAttack = 0;
			tmpDamage = Math.round((myAttack-targetDefense)*10)/10;
			if (tmpDamage>0) {
				System.err.println(this.name+" attacked "+target.getName()+" and create "+ tmpDamage+" point damage.");
//				System.err.print(tmpDamage);
//				System.out.println(" point damage.");
				target.setHealth(target.getHealth()-tmpDamage);
			} else {
				System.err.println(this.name+" did not create the damage to "+target.getName());
			}
			myDamaged = Math.round((targetAttack - (this.armor+Math.random()*(this.defense[1]-this.defense[0])+this.defense[0]))*10)/10;
			if (myDamaged>0) {
				System.err.println(this.name+" was attacked by "+target.getName()+" and create "+myDamaged+" point damage.");
//				System.err.print(myDamaged);
//				System.out.println(" point damage.");
				this.health = this.health-myDamaged;
			} else {
				System.err.println(this.name+" did not be attacked by "+target.getName() + " successfully.");
			}
			break;
		case 4:
			myAttack = this.abilityData[0];
			tmpDamage = Math.round((myAttack-targetDefense)*10)/10;
			if (tmpDamage>0) {
				System.err.println(this.name+" attacked "+target.getName()+" using ability, " + this.abilityName[0] + " and create "+tmpDamage+" point damage.");
//				System.err.print(tmpDamage);
//				System.out.println(" point damage.");
				target.setHealth(target.getHealth()-tmpDamage);
			} else {
				System.err.println(this.name+" did not create the damage to "+target.getName());
			}
			myDamaged = Math.round((targetAttack - this.armor)*10)/10;
			if (myDamaged>0) {
				System.err.println(this.name+" was attacked by "+target.getName()+" and create "+myDamaged+" point damage.");
//				System.err.print(myDamaged);
//				System.out.println(" point damage.");
				this.health = this.health-myDamaged;
			} else {
				System.err.println(this.name+" did not be attacked by "+target.getName() + " successfully.");
			}
			
			break;
		case 5:
			
			break;
		case 6:
			
			break;
		case 7:
			
			break;
		case 8:
			
			break;
		case 9:
			myAttack = 0;
			tmpDamage = Math.round((myAttack-targetDefense)*10)/10;
			if (tmpDamage>0) {
				System.err.println(this.name+" attacked "+target.getName()+" and create "+tmpDamage+" point damage.");
//				System.err.print(tmpDamage);
//				System.out.println(" point damage.");
				target.setHealth(target.getHealth()-tmpDamage);
			} else {
				System.err.println(this.name+" did not create the damage to "+target.getName());
			}
			myDamaged = Math.round((targetAttack - this.armor)*10)/10;
			if (myDamaged>0) {
				System.err.println(this.name+" was attacked by "+target.getName()+" and create "+myDamaged+" point damage.");
//				System.err.print(myDamaged);
//				System.out.println(" point damage.");
				this.health = this.health-myDamaged;
			} else {
				System.err.println(this.name+" did not be attacked by "+target.getName() + " successfully.");
			}
			double addHealth = this.abilityData[0];
			System.err.println(this.name + " uses " + this.abilityName[0] + " adding "+ addHealth +" point health");
			break;
		default:
			System.err.println("Your activity type is no exist./nYou will do nothing this turn.");
			break;
		}
		
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
	public boolean getIsAddNextAttackDamageByPercentage() {
		return isAddNextAttackDamageByPercentage;
	}
	public void setIsAddNextAttackDamageByPercentage(
			boolean isAddNextAttackDamageByPercentage) {
		this.isAddNextAttackDamageByPercentage = isAddNextAttackDamageByPercentage;
	}
	public boolean getIsAddNextAttackDamageDirectly() {
		return isAddNextAttackDamageDirectly;
	}
	public void setIsAddNextAttackDamageDirectly(
			boolean isAddNextAttackDamageDirectly) {
		this.isAddNextAttackDamageDirectly = isAddNextAttackDamageDirectly;
	}
	public boolean getIsAddNextDefenseByPercentage() {
		return isAddNextDefenseByPercentage;
	}
	public void setIsAddNextDefenseByPercentage(
			boolean isAddNextDefenseByPercentage) {
		this.isAddNextDefenseByPercentage = isAddNextDefenseByPercentage;
	}
	public boolean getIsAddNextDefenseDirectly() {
		return isAddNextDefenseDirectly;
	}
	public void setIsAddNextDefenseDirectly(boolean isAddNextDefenseDirectly) {
		this.isAddNextDefenseByPercentage = isAddNextDefenseDirectly;
	}

	public int getAbilityNum() {
		return abilityNum;
	}

	public void setAbilityNum(int abilityNum) {
		this.abilityNum = abilityNum;
	}

	public void setAddNextAttackDamageByPercentage(
			boolean isAddNextAttackDamageByPercentage) {
		this.isAddNextAttackDamageByPercentage = isAddNextAttackDamageByPercentage;
	}

	public void setAddNextAttackDamageDirectly(boolean isAddNextAttackDamageDirectly) {
		this.isAddNextAttackDamageDirectly = isAddNextAttackDamageDirectly;
	}

	public void setAddNextDefenseByPercentage(boolean isAddNextDefenseByPercentage) {
		this.isAddNextDefenseByPercentage = isAddNextDefenseByPercentage;
	}

	public void setAddNextDefenseDirectly(boolean isAddNextDefenseDirectly) {
		this.isAddNextDefenseDirectly = isAddNextDefenseDirectly;
	}

}
