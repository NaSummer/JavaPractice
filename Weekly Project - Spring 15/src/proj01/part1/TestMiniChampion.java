package proj01.part1;

import java.util.Scanner;

class TestMiniChampion {

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
		MiniChampion sam = new MiniChampion("The Sam SAMA", 
									5555, 
									new double[]{40.0, 60.0}, 
									55.0, 
									new double[]{80, 120}, 
									new String[]{"Bear down with the weight of Mountain Taishan"}, 
									new double[]{522}, 
									new int[]{1});
		
		sam.printChampionInfo();
		
		MiniChampion player = new MiniChampion();
		readNewInfo(player);
		System.err.println("Test finished.");
	}
	
	public static void readNewInfo(MiniChampion player) {
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
	
	
}
