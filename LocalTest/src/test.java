
/**
 * @author Qiufan(Andy) Xu
 * @date CreateTime: Jun 15, 2016 2:17:17 PM
 * @version 1.0
 * @param
 */

public class test {
	static int sum = 0;
	/**
	 * 
	 * @param
	 * @return
	 */
	public static boolean check(String str, int newone) {
		if (str.length() == 0) {
			return true;
		} else {
			if (((int) Math.abs((str.charAt(str.length() - 1) - newone))) == 1) {
				return false;
			} else if (((int) Math.abs((str.charAt(str.length() - 1) - newone))) == 31) {
				return false;
			} else if (((int) Math.abs((str.charAt(str.length() - 1) - newone))) == 33) {
				return false;
			} else {
				return true;
			}

		}
		// TODO Auto-generated method stub
	}

	public static void search(String now) {
		if (now.length() < 8) {
			for (int i = 65; i <= 90; i++) {
				if (check(now, i)) {
					search(now+String.valueOf(i));
				}
			}
			for (int i = 97; i <= 122; i++) {
				if (check(now, i)) {
					search(now+String.valueOf(i));
				}
			}
		} else {
			sum++;
		}
		// TODO Auto-generated method stub
	}

	public static void main(String[] args) {
		String str = "";
		search(str);
		
		System.out.println(sum);
		// TODO Auto-generated method stub
	}

}
