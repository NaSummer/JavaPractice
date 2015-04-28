package proj02.part1.mini;

import java.util.Scanner;

class ChampionGame {

	public static void main(String[] args) {

		/*
		 * Name: The Sam SAMA Health: 5555 Attack Damage: 40~60 (Randomly)
		 * Armor: 55 Defense: 80 ~120 (Randomly) Ability Name: Bear down with
		 * the weight of Mountain Taishan Ability Damage: 522 In the battle, The
		 * Sam SAMA may (0) use the special ability, (1) attack you, (2) defense
		 * him, and (3) do nothing but laugh randomly.
		 */
		Champion target = new Champion("Bad Guy", 1, 2, 10000, new double[] {
				180.0, 240.0 }, 130.0, new double[] { 200, 320 },
				new String[] { "Everyone Should Die" }, new double[] { 522 },
				new int[] { 1 });
		System.err.println("Target:");
		target.printChampionInfo();

		System.out
				.print("Enter the number of your champion(One of them will be The Sam SAMA):");
		int NumOfChampion = enterNumOfChampion();

		Champion[] player = new Champion[NumOfChampion];
		
		player[0] = new Champion(
				"The Sam SAMA",
				1,
				1,
				5555,
				new double[] { 40.0, 60.0 },
				55.0,
				new double[] { 80, 120 },
				new String[] { "Bear down with the weight of Mountain Taishan" },
				new double[] { 522 }, new int[] { 1 });
		System.err.println("Champion 1");
		player[0].printChampionInfo();
		
		for (int i = 1; i < player.length; i++) {
			player[i] = new Champion();
			System.err.println("Champion " + (i+1));
			readNewInfo(player[i]);
		}
		
		System.err.println("Game Starts!");
		play(player, target);
		System.err.println("Game finished!");

	}

	public static int enterNumOfChampion() {
		Scanner scanner = new Scanner(System.in);
		int numOfChampion = scanner.nextInt();
		while (numOfChampion < 1) {
			System.err
					.println("The number of Champion must greater than 0. If you enter 1, it means you only have one champion, The Sam SAMA!");
			System.out.print("Please enter again:");
			numOfChampion = scanner.nextInt();
		}
		return numOfChampion;
	}

	public static void readNewInfo(Champion player) {
		Scanner scanner = new Scanner(System.in);

		System.err
				.println("If you don't set your own champion, the champion will be set as default. The following is the infomation of the default champion.");
		player.printChampionInfo();

		System.out.print("Do you want to create your new champion(Y/N): ");
		String IsCreateNewChampion = scanner.nextLine();

		if (IsCreateNewChampion.indexOf('Y') != -1
				|| IsCreateNewChampion.indexOf('y') != -1) {
			System.out
					.println("Please input the infomation of your new champion.");

			System.out.print("Name: ");
			player.setName(scanner.nextLine());
			
			System.out.print("Chatacter: 1.Attacker 2.Defender 3.Healer(Doctor):");
			player.setCharcater(scanner.nextInt());
			
			player.setArmy(1);
			
			System.out.print("Health: ");
			player.setHealth(scanner.nextDouble());

			System.out.print("Attack Damage(Minimun): ");
			double tmpAttackDamage = scanner.nextDouble();
			System.out.print("Attack Damage(Maximum): ");
			player.setAttackDamage(new double[] { tmpAttackDamage,
					scanner.nextDouble() });

			System.out.print("Armor: ");
			player.setArmor(scanner.nextDouble());

			System.out.print("Defense(Minimun): ");
			double tmpDefense = scanner.nextDouble();
			System.out.print("Defense(Maximum): ");
			player.setDefense(new double[] { tmpDefense, scanner.nextDouble() });
			
			
			System.out.print("Ability: ");
			player.showAbilityOverview();

			System.out.print("Please set your ability name: ");
			String tmpAbilityName = scanner.next();
			player.setAbilityName(new String[] { tmpAbilityName });

			System.out.print("Please set your ability data: ");
			double tmpAbilityData = scanner.nextDouble();
			player.setAbilityData(new double[] { tmpAbilityData });
			

			System.out
					.println("You have create your new champion successfully.");
			System.out.println("Here is the infomation of your new champion:");
			player.printChampionInfo();

		}

	}

	public static void play(Champion[] player, Champion target) {
		Scanner scanner = new Scanner(System.in);
		do {
			for (int i = 0; i < player.length; i++) {
				if (player[i].getHealth()>0) {
					player[i].showChampionStatus();
					target.showChampionStatus();
					System.out.println("Please choose your action("+player[i].getName()+"):");
					System.out.println("1. Attack the target, " + target.getName());
					System.out.println("2. Defense");
					System.out.println("3. Use ability");
					System.out.println("4. Do nothing but laugh");
					int action = scanner.nextInt();
					switch (action) {
					case 1:
						player[i].activity(target, 2);
						break;
					case 2:
						player[i].activity(target, 3);
						break;
					case 3:
						if (player[i].getCharcater()==3) {
							showArmyChampionInfo(player);
							System.out.println("Please choose which champion you want to add health point: ");
							int championNum = scanner.nextInt();
							while (!(((championNum)<=player.length)&&(championNum>0))) {
								System.err.print("Your choose is wrong, please choose again:");
								championNum = scanner.nextInt();
							}
							player[i].activity(player[championNum-1], 9);
						}else {
							player[i].activity(target, 4);
						}
						break;
					case 4:
						player[i].activity(target, 1);
						break;
					default:
						System.err
						.println("Your input is wrong. You will do nothing but laugh this turn.");
						player[i].activity(target, 1);
						break;
					}
					
				}
				
				if (target.getHealth() <= 0) {
					break;
				}
				
			}

		} while (target.getHealth() >= 0);

		if (isWin(player, target)) {
			System.err.println("You win!");
		} else {
			System.err.println("You lose.");
		}

	}
	
	public static boolean isWin(Champion[] player, Champion target) {
		if (target.getHealth() <= 0) {
			for (int i = 0; i < player.length; i++) {
				if (player[i].getHealth() > 0) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static void showArmyChampionInfo(Champion[] player) {
		for (int i = 0; i < player.length; i++) {
			System.out.println((i+1)+". "+player[i].getName());
		}
	}

}
