package proj02.part1;

import java.util.Scanner;

import javax.lang.model.type.PrimitiveType;

public class Champion {
	
	/**
	 * the Champions name health attack damage armor abilityName1
	 * abilityDamage1
	 * 
	 * A Class Name Two constructors Five get***() methods Five set***() methods
	 */
	
	Scanner scanner = new Scanner(System.in);

	private String name;
	private int charcater; //1.Attacker 2.Defender 3.Healer 
	private int army; 
	private double health;
	private double[] attackDamage;
	private double armor;
	private double[] defense;
	private double probabilityOfPassiveDefense;
	private String[] abilityName;
	private double[] abilityData;
	private int[] abilityType;
	private boolean[] isUseAbility;

	// abilityType
	//  1: attack damage directly
	//   2: next attack damage add percentage attack damage
	//   3: next defense add percentage
	//   4: add next attack damage
	//   5: add next defense
	//  6: recover the health


	public Champion() {
		
		
		//set the default data of champion
		setDefaultChampion(1);
		
		//ask user whether show the default data
		if (isShowDefaultChampion()) {
			printChampionInfo();
		}
		
		//ask user whether set own champion
		if (isSetOwnChampion()) {
			if (isSetNewName()) {
				setName();				
			}
			if (isSetNewHealth()) {
				setHealth();
			}
			if (isSetNewAttackDamage()) {
				setAttackDamage();
			}
			if (isSetNewArmor()) {
				setArmor();
			}
			if (isSetNewDefense()) {
				setDefense();
			}
			if (isSetNewAbility()) {
				setAbilityName();
				setAbilityData();
				setAbilityType();
			}
		}
		
	}

/*
	public Champion(String name, int character,int army, double health, double[] attackDamage,
			double armor, double[] defense, String[] abilityName,
			double[] abilityData, int[] abilityType) {
		
		this.name = name;
		this.charcater = character;
		this.army = army;
		this.health = health;
		this.attackDamage = attackDamage;
		this.armor = armor;
		this.defense = defense;
		this.abilityName = abilityName;
		this.abilityData = abilityData;
		this.abilityType = abilityType;
				
	}
*/	


	private void setDefaultChampion(int army) {
		//set the default data of champion
		this.name = "Garen";
		this.charcater = 1;
		this.army = army;
		this.health = 4000;
		this.attackDamage = new double[] {100, 500};
		this.armor = 4000;
		this.defense = new double[] {22.1, 42.1};
		this.probabilityOfPassiveDefense = 0.4;
		this.abilityName = new String[] { "Decisive Strike" };
		this.abilityData = new double[] { 900 };
		this.abilityType = new int[] { 1 };
	}
	
	private boolean isShowDefaultChampion() {
		//TODO
		return false;
	}
	
	private boolean isSetOwnChampion() {
		//TODO
		return false;
	}
	
	private boolean isYes() {
		//TODO
		return false;
	}
	
	private boolean isSetNewName() {
		//TODO
		return false;
	}
	
	private boolean isSetNewHealth() {
		//TODO
		return false;
	}	
	
	private boolean isSetNewAttackDamage() {
		//TODO
		return false;
	}
	
	private boolean isSetNewArmor() {
		//TODO
		return false;
	}
	
	private boolean isSetNewDefense() {
		//TODO
		return false;
	}
	
	private boolean isSetNewAbility() {
		//TODO
		return false;
	}
	
	
	public void printChampionInfo() {
		System.out.println("Name: " + this.name);
		switch (this.charcater) {
		case 1:
			System.out.println("Character: " + "Attacker");			
			break;
		case 2:
			System.out.println("Character: " + "Defender");			
			break;
		case 3:
			System.out.println("Character: " + "Healer(Doctor)");			
			break;
		default:
			break;
		}
		System.out.println("Army: " + this.army);
		System.out.println("Health: " + this.health);
		System.out.println("Attack Damage: " + this.attackDamage[0] + "~" + this.attackDamage[1]);
		System.out.println("Armor: " + this.armor);
		System.out.println("Defense: " + this.defense[0] + "~" + this.defense[1]);
		System.out.println("Probability Of Using Passive Defense: " + this.probabilityOfPassiveDefense*100 + "%");
		
		for (int i = 0; i < this.abilityData.length; i++) {
			System.out.print("Ability ");
			if (this.abilityData.length > 1) {
				System.out.print(i + 1);
			}
			System.out.println();

			System.out.println("    Name: " + this.abilityName[i]);
			
			switch (this.abilityType[i]) {
			case 1:
				System.out.println("    Describe: Attack the target directly with "	+ this.abilityData[i] + " damage.");
				break;
			case 2:
				System.out.println("    Describe: Next attack will create " + ((int) this.abilityData[i] * 100) + "% damage to the target.");
				break;
			case 3:
				System.out.println("    Describe: Next defense will be " + ((int) this.abilityData[i] * 100) + "%.");
				break;
			case 4:
				System.out.println("    Describe: Next attack will add " + this.abilityData[i] + " damage.");
				break;
			case 5:
				System.out.print("    Describe: Next defense will add " + this.abilityData[i] + " point");
				if ((int) this.abilityData[i] > 1) {
					System.out.println(".");
				} else {
					System.out.println("s.");
				}
				break;
			case 6:
				System.out.print("    Describe: Recover own health " + ((int) this.abilityData[i]) + " point");
				if ((int) this.abilityData[i] > 1) {
					System.out.println(".");
				} else {
					System.out.println("s.");
				}
				break;

			default:
				break;
			}
		
		}

	}

	public void showChampionStatus() {
		System.err.println(this.name+"'s Health: "+this.health);
		
		for (int i = 0; i < isUseAbility.length; i++) {
			if (isUseAbility[i]) {
				switch (abilityType[i]) {
				case 2:
					System.err
							.println("If you defend the target this turn, your attack damage will be "
									+ ((int) (this.defense[0] * this.abilityData[i] * 100))
									+ " ~ "
									+ ((int) (this.defense[1] * this.abilityData[i] * 100)) + " points.");
					break;
				case 3:
					System.err
							.println("If you defend the target this turn, your defense will be "
									+ ((int) (this.defense[0] * this.abilityData[i] * 100))
									+ " ~ "
									+ ((int) (this.defense[1] * this.abilityData[i] * 100)) + " points.");
					break;
				case 4:
					System.err
							.println("If you attack the target this turn, your attack damage will add " + this.abilityData[i] + " and be "
									+ ((int) (this.attackDamage[0] + this.abilityData[i]))
									+ " ~ "
									+ ((int) (this.attackDamage[1] + this.abilityData[i])) + " points.");
					break;
				case 5:
					System.err
							.println("If you attack the target this turn, your defense will add " + this.abilityData[i] + " and be "
									+ ((int) (this.attackDamage[0] + this.abilityData[i]))
									+ " ~ "
									+ ((int) (this.attackDamage[1] + this.abilityData[i])) + " points.");
					break;

				default:
					break;
				}
			}
		}

	}
	
	public void showAbilityOverview() {
		//TODO
//		System.out.println("1. Add your attack damage;");
		System.out.println("1. Attack the target with ability damage.");
		System.out.println("2. Recover your champion's health.");
	}
	
	public void activity(Champion target, int activityType) {
		// old activityType
		// 1: do nothing but laugh
		// 2: do not use ability and attack directly
		// 3: do not use ability and defense
		//
		// 4: attack damage directly using ability
		//
		// 5: next attack damage add percentage attack damage
		// 6: next defense add percentage
		// 7: add next attack damage
		// 8: add next defense
		// 9: recover the health
		
		
		// activityType
		// 1: do nothing but laugh
		// 2: do not use ability and attack directly
		// 3: use ability


		//===========Whether target passive defended===============
		double targetDefense = targetTmpDefense(target, this.probabilityOfPassiveDefense);
		
		//TODO 
		double targetAttack = 0;//This line should be delete, writing here for no error notification. Forgive my obsession...
		
		double myAttack = 0;
		double tmpDamage = 0;
		double myDamaged = 0; //对方对我最终造成的伤害
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

	
	public boolean isHealer() {
		if (this.charcater == 3) {
			return true;
		} else {
			return false;
		}
	}
	
	//use probability of passive defense to generate the defense date with whether use passive defense
	private double targetTmpDefense(Champion target, double probabilityOfPassiveDefense) {
		if (Math.random()*100 < probabilityOfPassiveDefense*100) {
			return Math.random()*(target.getDefense()[1]-target.getDefense()[0])+target.getDefense()[0]+target.getArmor();
		} else {
			return target.getArmor();
		}
	}
	//===========Accesser==============

	
//===========Safe Setter=============
	public void setName() {
		//TODO
	}
	
	public void setCharcater() {
		//TODO
	}
	
	public void setArmy() {
		//TODO
	}

	public void setHealth() {
		//TODO
	}

	public void setAttackDamage() {
		//TODO
	}

	public void setArmor() {
		//TODO
	}

	public void setDefense() {
		//TODO
	}

	public void setAbilityName() {
		//TODO
	}

	public void setAbilityData() {
		//TODO
	}

	public void setAbilityType() {
		//TODO
	}
	
	public void setIsUseAbility() {
		//TODO
	}

	public void setProbabilityOfPassiveDefense() {
		//TODO
	}
	
//=============Unsafe Setter============May Unable========
	public void setName(String name) {
		this.name = name;
	}

	public void setCharcater(int charcater) {
		this.charcater = charcater;
	}

	public void setArmy(int army) {
		this.army = army;
	}

	public void setHealth(double health) {
		this.health = health;
	}

	public void setAttackDamage(double[] attackDamage) {
		this.attackDamage = attackDamage;
	}

	public void setArmor(double armor) {
		this.armor = armor;
	}

	public void setDefense(double[] defense) {
		this.defense = defense;
	}

	public void setProbabilityOfPassiveDefense(double probabilityOfPassiveDefense) {
		this.probabilityOfPassiveDefense = probabilityOfPassiveDefense;
	}

	public void setAbilityName(String[] abilityName) {
		this.abilityName = abilityName;
	}

	public void setAbilityData(double[] abilityData) {
		this.abilityData = abilityData;
	}

	public void setAbilityType(int[] abilityType) {
		this.abilityType = abilityType;
	}

	public void setIsUseAbility(boolean[] isUseAbility) {
		this.isUseAbility = isUseAbility;
	}


//=======Getter============	
	public String getName() {
		return name;
	}
	
	public int getCharcater() {
		return charcater;
	}
	
	public int getArmy() {
		return army;
	}
	
	public double getHealth() {
		return health;
	}
	
	public double[] getAttackDamage() {
		return attackDamage;
	}
	
	public double getArmor() {
		return armor;
	}
	
	public double[] getDefense() {
		return defense;
	}
	
	public String[] getAbilityName() {
		return abilityName;
	}
	
	public double[] getAbilityData() {
		return abilityData;
	}
	
	public int[] getAbilityType() {
		return abilityType;
	}
	
	public boolean[] getIsUseAbility() {
		return isUseAbility;
	}

	public double getProbabilityOfPassiveDefense() {
		return probabilityOfPassiveDefense;
	}
	
}
