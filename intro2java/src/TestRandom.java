
public class TestRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[];
		a = new int[10];
		for (int i = 1 ; i < 100 ; i++){
			int tmp = (int) (Math.random()*7);
			a[tmp]++;
		}
		for (int i = 0; i<11; i++){
			System.out.println( i + " " + a[i] );
		}

	}

}
