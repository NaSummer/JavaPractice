package labexam01;

/*
Method Must Use:
insert, replace, delete, indexOf

Original materials: 		(5 Strings)
¡°  It is a hard time for me to miss you, but it is even harder not to do so.   ¡±
¡°Every day I miss you, do you know?¡±
¡°In such a contrary mood, I miss you deeply!¡±
¡°Happy Fool's Day to you!¡±
¡°The Sam sama¡±

Final sentences: 		(1 String with 4 lines)
¡°Everyday and every class I see you, The Sam SAMA.
It is a hard time for me to see you, but it is even harder not to do so.
In such a contrary mood, why I could see you every day?
A happy Labour Day to you!¡±

 */

public class StringAndStringBuilder {

	public static void main(String[] args) {
		String str1 = "  It is a hard time for me to miss you, but it is even harder not to do so.   ";
		String str2 = "Every day I miss you, do you know?";
		String str3 = "In such a contrary mood, I miss you deeply!";
		String str4 = "Happy Fool's Day to you!";
		String str5 = "The Sam sama";
		StringBuilder sb = new StringBuilder();
		StringBuilder tmpsb = new StringBuilder();
		int index = 0;
		
		//First line of final sentences
		String[] tmpstr = str2.split(" ");
		sb.append(tmpstr[0]+tmpstr[1]+" and "+tmpstr[0].toLowerCase()+" class I see you, "+str5+".\n");
		index = sb.indexOf("sama");
		sb.replace(index, index+4, "SAMA");
		
		//Second line of final sentences
		if (tmpsb.length()>0) {
			tmpsb.delete(0, tmpsb.length());
		}
		tmpsb.append(str1);
		for (int i = 0; i < tmpsb.length(); i++) { //delete the spaces
			if (tmpsb.charAt(i)!=' ') {
				tmpsb.delete(0, i);
				break;
			}
		}
		for (int i = tmpsb.length()-1; i >= 0; i--) {
			if (tmpsb.charAt(i)!=' ') {
				tmpsb.delete(i+1, tmpsb.length()-1);
				break;
			}
		}
		index = tmpsb.indexOf("miss"); //replace the miss to see
		tmpsb.replace(index, index+4, "see");
		sb.append(tmpsb+"\n");
		
		//Third line of final sentences
		if (tmpsb.length()>0) {
			tmpsb.delete(0, tmpsb.length());
		}
		tmpsb.append(str3);
		index = tmpsb.indexOf("I miss you deeply!");
		tmpsb.delete(index, tmpsb.length());
		tmpsb.append("why I could see you every day?");
		sb.append(tmpsb+"\n");
		
		//Fourth line of final sentences
		if (tmpsb.length()>0) {
			tmpsb.delete(0, tmpsb.length());
		}
		tmpsb.append(str4);
		tmpsb.delete(0, 1);
		tmpsb.insert(0, "A h");
		index = tmpsb.indexOf("Fool's");
		tmpsb.replace(index, index+6, "Labour");
		sb.append(tmpsb+"\n");
		
		System.out.println(sb.toString());
	}

}
