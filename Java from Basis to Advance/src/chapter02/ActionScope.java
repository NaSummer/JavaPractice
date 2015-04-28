package chapter02;

public class ActionScope {

	public static void main(String[] args) {
		
		int i=10;
		{
			int k=20;
			System.out.println(i);
			System.out.println(k);
		}

	}

}
