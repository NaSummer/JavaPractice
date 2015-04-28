import java.util.List;
import java.util.ArrayList;
//import java.awt.List;
import javax.swing.JOptionPane;

public class homework_levelup_script {
	
	public static void main(String[] args) {
		
		String head = JOptionPane.showInputDialog("Please input the number of Heads");
		int heads=Integer.parseInt(head);
		String foot = JOptionPane.showInputDialog("Please input the number of Feet");
		int feet=Integer.parseInt(foot);
		
		//int rabbits = 0;
		// chickens = 0;
		
		List<Integer> results = new ArrayList<Integer>();
		//results.add(rabbits);
		//results.add(chickens);
		
		results = canculate(heads,feet);
		
		/*
		if ( heads * 4 >= feet && heads * 2 <= feet && feet % 2 == 0) {
			
			int a = feet - heads * 2;
			int rabbit = a / 2;
			int chicken = heads - rabbit;
			rabbits = String.valueOf(rabbit);
			chickens = String.valueOf(chicken);
			
		}
		else {
			;
		}
		*/
		
		//int test1 = (int) results.get(1);
		//int test2 = (int) results.get(0);
		
		JOptionPane.showMessageDialog(null,"The number of chicken is " + (int) results.get(1) + "\nThe number of rabbits is "+ (int) results.get(0));
		
	}
	
	public static List<Integer> canculate (int heads, int feet){
		
		List<Integer> answers = new ArrayList<Integer>();
		int rabbits = 0;
		int chickens = 0;
		
		if ( heads * 4 >= feet && heads * 2 <= feet && feet % 2 == 0) {
			
			int a = feet - heads * 2;
			rabbits = a / 2;
			chickens = heads - rabbits;
				
			answers.add(rabbits);
			answers.add(chickens);
			answers.add(0);
			
		}
		else {
			boolean IfYNRight = false;
			
			do {
				//String YorN=null;
				
				//if (IfYNRight){
					
				//}else{
				String YorN = JOptionPane.showInputDialog(null,"Your input is wrong.\nDo you want to try again?(Y/N):");
				//}
				IfYNRight = false;
				if ((YorN == "y")||(YorN == "Y")) {
					answers.add(1);
				}
				else {
					
					boolean test1 = (YorN == "n");
					boolean test2 = (YorN == "N");
					test2 = test2 || test1;
					
					if ((YorN == "n")||(YorN == "N")){
						System.exit(0);
					}
					else {
						
						IfYNRight = true;
					}
				}
			}while (IfYNRight);
		}
		
		return answers;
		
	}
	
	
}