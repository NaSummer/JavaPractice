package chapter09.lab;

/**
public MyString1(char[] chars);
public char charAt(int index);
public int length();
public MyString1 substring(int begin, int end);
public MyString1 toLowerCase();
public boolean equals(MyString1 s);
public static MyString1 valueOf(int i);
 * @author Qiufan
 *
 */

public class Question09_16_ImplementTheStringClass {

	public static void main(String[] args) {
		MyString1 str = new MyString1(new char[]{'W','K','U','1','8','5','5'});
		
		System.out.print("My String is:");
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.getMyString()[i]);
		}
		System.out.println();
		
		System.out.println("Char at 3 is '" + str.charAt(2) + "'");
		
		System.out.println("The lenght of string is " + str.length());
		
		MyString1 substr = str.substring(0, 2);
		System.out.print("The substring of my string is:");
		for (int i = 0; i < substr.length(); i++) {
			System.out.print(substr.getMyString()[i]);
		}
		System.out.println();
		
		MyString1 lowerCase = str.toLowerCase();
		System.out.print("My String change to lower case is:");
		for (int i = 0; i < lowerCase.length(); i++) {
			System.out.print(lowerCase.getMyString()[i]);
		}
		System.out.println();
		
		MyString1 str1 = new MyString1(new char[]{'W','K','U','1','8','5','5'});
		System.out.print("Is My String equal to the string \"");
		for (int i = 0; i < str1.length(); i++) {
			System.out.print(str1.getMyString()[i]);
		}
		System.out.print("\":");
		System.out.println(str.equals(str1));
		
		MyString1 str2 = new MyString1(new char[]{'w','k','u','1','8','5','5'});
		System.out.print("Is My String equal to the string \"");
		for (int i = 0; i < str2.length(); i++) {
			System.out.print(str2.getMyString()[i]);
		}
		System.out.print("\":");
		System.out.println(str.equals(str2));
		
		MyString1 strValue1 = MyString1.valueOf(132476);
		System.out.print("Value " + (1326476) + ": ");
		for (int i = 0; i < strValue1.length(); i++) {
			System.out.print(strValue1.getMyString()[i]);
		}
		System.out.println();
		
		MyString1 strValue2 = MyString1.valueOf(-132476);
		System.out.print("Value " + (-1326476) + ": ");
		for (int i = 0; i < strValue2.length(); i++) {
			System.out.print(strValue2.getMyString()[i]);
		}
		System.out.println();
		
	}

}

class MyString1 {
	private char[] str;
	
	public MyString1(char[] chars) {
		this.str = chars;
	}
	
	public char charAt(int index) {
		return this.str[index];
	}
	
	public int length() {
		return this.str.length;
	}
	
	public MyString1 substring(int begin, int end) {
		char[] substr = new char[end - begin + 1];
		for (int i = begin; i <= end; i++) {
			substr[i-begin] = str[i];
		}
		return new MyString1(substr);
	}
	
	public MyString1 toLowerCase() {
		char[] lowerCase = new char[this.str.length];
		for (int i = 0; i < lowerCase.length; i++) {
			if ((this.str[i]<=90)&&(this.str[i]>=65)) {
				lowerCase[i] = (char)((int)(this.str[i]) + 32);
			} else {
				lowerCase[i] = this.str[i];
			}
		}
		return new MyString1(lowerCase);
	}
	
	public boolean equals(MyString1 s) {
		if (s.length() == this.length()) {
			for (int i = 0; i < s.length(); i++) {
				if (this.str[i]!=s.getMyString()[i]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}
	
	public static MyString1 valueOf(int i) {
		int length = (int) Math.log10(Math.abs(i)) + 1;
		char[] str = null;
		if (i >= 0) {
			str = new char[length];
			for (int j = str.length-1; j >= 0; j--) {
				str[j] = (char)(i % 10 + 48);
				i = i / 10;
			}
		} else {
			i = -i;
			str = new char[length+1];
			str[0] = '-';
			for (int j = str.length-1; j > 0; j--) {
				str[j] = (char)(i % 10 + 48);
				i = i / 10;
			}
		}
		return new MyString1(str);
	}
	
	public char[] getMyString() {
		return this.str;
	}
	
}