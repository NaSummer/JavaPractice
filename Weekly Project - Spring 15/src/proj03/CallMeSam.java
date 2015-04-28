package proj03;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CallMeSam {
	
	private String goodWordsPath;
	private String badWordsPath;
	private BufferedReader br = null;
	
	public CallMeSam() {
		this.goodWordsPath = "data/weekly/03/goodwords.txt";
		this.badWordsPath = "data/weekly/03/badwords.txt";
	}

	private String BufferedReader(String path) throws IOException {
		File file = new File(path);
		if (!file.exists() || file.isDirectory()) {
			throw new FileNotFoundException();
		}
		BufferedReader br = new BufferedReader(new FileReader(file));
		String temp = br.readLine();;
		StringBuffer sb = new StringBuffer();
		while (temp != null) {
			sb.append(temp + " ");
			temp = br.readLine();
		}
		return sb.toString();
	}

}
