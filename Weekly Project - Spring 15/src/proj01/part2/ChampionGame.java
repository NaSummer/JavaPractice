package proj01.part2;

import java.util.Scanner;

class ChampionGame {

	public static void main(String[] args) {
		/*
		 * Name: The Sam SAMA
		 * Health: 5555
		 * Attack Damage: 40~60 (Randomly)
		 * Armor: 55
		 * Defense: 80 ~120 (Randomly)
		 * Ability Name: Bear down with the weight of Mountain Taishan
		 * Ability Damage: 522
		 * In the battle, The Sam SAMA may (0) use the special ability, (1) attack you, (2) defense him, and (3) do nothing but laugh randomly. 
		 */
		Champion sam = new Champion("The Sam SAMA", 
									5555, 
									new double[]{40.0, 60.0}, 
									55.0, 
									new double[]{80, 120}, 
									new String[]{"Bear down with the weight of Mountain Taishan"}, 
									new double[]{522}, 
									new int[]{1});
		
		sam.printChampionInfo();
		
		Champion player = new Champion();
		readNewInfo(player);
		System.err.println("Game Starts!");
		play(player,sam);
		System.err.println("Game finished!");
		
	}
	
	public static void readNewInfo(Champion player) {
		Scanner scanner = new Scanner(System.in);
		
		System.err.println("If you don't set your own champion, the champion will be set as default. The following is the infomation of the default champion.");
		player.printChampionInfo();
		
		System.out.print("Do you want to create your new champion(Y/N): ");
		String IsCreateNewChampion = scanner.nextLine();
		
		if (IsCreateNewChampion.indexOf('Y')!=-1||IsCreateNewChampion.indexOf('y')!=-1) {
			System.out.println("Please input the infomation of your new champion.");
			
			System.out.print("Name: ");
			player.setName(scanner.nextLine());
			
			System.out.print("Health: ");
			player.setHealth(scanner.nextDouble());
			
			System.out.print("Attack Damage(Minimun): ");
			double tmpAttackDamage = scanner.nextDouble();
			System.out.print("Attack Damage(Maximum): ");
			player.setAttackDamage(new double[] {tmpAttackDamage,scanner.nextDouble()});
			
			System.out.print("Armor: ");
			player.setArmor(scanner.nextDouble());
			
			System.out.print("Defense(Minimun): ");
			double tmpDefense = scanner.nextDouble();
			System.out.print("Defense(Maximum): ");
			player.setDefense(new double[] {tmpDefense,scanner.nextDouble()});
			
			player.showAbilityOverview();
			System.out.print("Which ability do you want to use? ");
			int abilityType = scanner.nextInt();
			if (abilityType == 1) {
				player.setAbilityType(new int[] {1});
			} else {
				player.setAbilityType(new int[] {6});
			}
			
			System.out.print("Please set your ability name: ");
			String tmpAbilityName = scanner.next();
			player.setAbilityName(new String[] {tmpAbilityName});
			
			System.out.print("Please set your ability data: ");
			double tmpAbilityData = scanner.nextDouble();
			player.setAbilityData(new double[] {tmpAbilityData});
			
//			switch (player.getAbilityType()[0]) {
//			case value:
//				
//				break;
//
//			default:
//				System.out.println("Please input the ability data:");
//				break;
//			}
			
			System.out.println("You have create your new champion successfully.");
			System.out.println("Here is the infomation of your new champion:");
			player.printChampionInfo();
			
		} 

	}
	
	public static void play(Champion player, Champion target) {
		Scanner scanner = new Scanner(System.in);
		do {
			player.showChampionStatus();
			target.showChampionStatus();
			System.out.println("Please choose your action:");
			System.out.println("1. Attack the target, "+target.getName());
			System.out.println("2. Defense");
			System.out.println("3. Use ability");
			System.out.println("4. Do nothing but laugh");
			int action = scanner.nextInt();
			switch (action) {
			case 1:
				player.activity(target, 2);
				break;
			case 2:
				player.activity(target, 3);
				break;
			case 3:
				switch (player.getAbilityType()[0]) {
				case 1:
					player.activity(target, 4);
					break;
				case 6:
					player.activity(target, 9);
					break;
				default:
					System.out.println("There is something wrong with your champion's ability, you will do nothing but laugh this turn");
					player.activity(target, 1);
					break;
				}
				break;
			case 4:
				player.activity(target, 1);
				break;
			default:
				System.err.println("Your input is wrong. You will do nothing but laugh this turn.");
				player.activity(target, 1);
				break;
			}
			

		} while (player.getHealth()>0&&target.getHealth()>=0);
		
		if (player.getHealth()>0&&target.getHealth()<=0) {
			System.err.println("You win!");
		} else if (player.getHealth()<=0&&target.getHealth()>0){
			System.err.println("You lose.");
		}
		
		
	}
	
}
