import java.util.Scanner;
public class Chickenandrabbit {

	private static Scanner input;
    public static void main(String[] args) {
	    input = new Scanner(System.in);
		// TODO Auto-generated method stub
	    System.out.print("Heads = "); 
	    int heads = (int) input.nextInt();
	    System.out.print("Feet = "); 
	    int feet = (int) input.nextInt();
	    if ( heads * 4 >= feet && heads * 2 <= feet && feet % 2 == 0)  // judge
	    {int a = feet - heads * 2;
		 int rabbits = a / 2;
		 int chickens = heads - rabbits;
		 System.out.println("the number of chicken is " + chickens);
		 System.out.println("the number of rabbits is " + rabbits);
	    }
		 else { System.out.println("error");
	}
	}
}
