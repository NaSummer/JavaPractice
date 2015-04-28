//import java.util.Scanner;

import javax.swing.JOptionPane;

public class homework {

	//private static Scanner input;
    
	public static void main(String[] args) {
	    
		//input = new Scanner(System.in);
	    
		//System.out.print("Heads = "); 
	    //int heads = (int) input.nextInt();
    	//System.out.print("Feet = "); 
	    //int feet = (int) input.nextInt();
	    
	    String head = JOptionPane.showInputDialog("Please input the number of Heads");
    	int heads=Integer.parseInt(head);
    	String foot = JOptionPane.showInputDialog("Please input the number of Feet");
    	int feet=Integer.parseInt(foot);  	
        
    	int rabbits = 0;
    	int chickens = 0;
    	
    	if ( heads * 4 >= feet && heads * 2 <= feet && feet % 2 == 0) {
			int a = feet - heads * 2;
			rabbits = a / 2;
			chickens = heads - rabbits;
		}
		else {
			;
		}
    	
		//System.out.println("the number of chicken is " + chickens);
		//System.out.println("the number of rabbits is " + rabbits);    	
    	
    	JOptionPane.showMessageDialog(null,"The number of chicken is " + chickens + "\nThe number of rabbits is "+ rabbits);
    	
	}
}
