import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class homework_finished {
	
	public static void main(String[] args) {
		
		String head = JOptionPane.showInputDialog("Please input the number of Heads");
		int heads=Integer.parseInt(head);
		String foot = JOptionPane.showInputDialog("Please input the number of Feet");
		int feet=Integer.parseInt(foot);
		
		List<Integer> results = new ArrayList<Integer>();
		
		results = canculate(heads,feet);
		
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
			
		}
		else {
			
			JOptionPane.showMessageDialog(null,"Your input is wrong.");
			System.exit(0);
			
		}
		
		return answers;
		
	}
	
	
}