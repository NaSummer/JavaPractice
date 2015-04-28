package practice03;

class Title {

	String title;
	
	public Title() {
		
	}
	
	public Title(String str) {
		title = "";
		int begin = 0;
		int end = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)==' ') {
				if (i>0) {
					end = i;
				}
//				String tmpStr = str.substring(begin, begin+1).toUpperCase() + str.substring(begin+1, end);
				title = title + str.substring(begin, begin+1).toUpperCase() + str.substring(begin+1, end) + " ";
				begin = i + 1;
			}
		}
		title = title + str.substring(begin, begin+1).toUpperCase() + str.substring(begin+1, str.length()) + " ";
		
		str = title;
	}
	
}
