package practice04;

/*
 * Given the following words:
 * adj = {"tall", "young", "old", "thin", "fat", "pretty", "rude"}
 * noun = {"man", "lady", "girl", "boy"}
 * verb = {"pushes", "walks", "likes", "watches"}
 * conj = {"and", "but"}
 * article = {"a", "an", "the"}
 * Write a java program that can randomly and correctly generate 10 phrases 
 * 
 * such as "a young girl walks and an old lady watches the girl".
 */

class GenerateSentence {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(generateSentence());
		}
	}

	private static String generateSentence() {

		String[] adj = { "tall", "young", "old", "thin", "fat", "pretty",
				"rude" };
		String[] noun = { "man", "lady", "girl", "boy", "superman" };
		String[] verb = { "pushes", "walks", "likes", "watches" };
		String[] conj = { "and", "but" };
		String[] article = { "a", "an", "the" };
		StringBuilder sentence = new StringBuilder();

		// Choose two people
		// "Superman Version
		int person1;
		int person2;
		do {
			person1 = (int) (Math.random() * noun.length);
			person2 = (int) (Math.random() * noun.length);
			while (person1 == person2) {
				person2 = (int) (Math.random() * noun.length);
			}
		} while ( (person1 != 4) && (person2 != 4) );
		
		// Choose two people
		// Normal Version
//		int person1 = (int) (Math.random() * noun.length);
//		int person2 = (int) (Math.random() * noun.length);
//		while (person1 == person2) {
//			person2 = (int) (Math.random() * noun.length);
//		}

		// Choose two adj
		int adj1 = (int) (Math.random() * adj.length);
		int adj2 = (int) (Math.random() * adj.length);
		while (adj1 == adj2) {
			adj2 = (int) (Math.random() * adj.length);
		}

		// Choose article
		int article1 = chooseArticle(adj[adj1]);
		int article2 = chooseArticle(adj[adj2]);
		
		// Choose conj
		int conj1 = (int) (Math.random() * conj.length);
		
		// Choose verb
		int verb1 = 1;
		int verb2 = (int) (Math.random() * verb.length);
		while (verb2 == 1) {
			verb2 = (int) (Math.random() * verb.length);
			
		}
		
		// Change frist letter
		String firstWord = upperFirstLetter(article[article1]);
		
		// Generate Sentence
		// "a young girl walks and an old lady watches the girl"
		sentence.append(firstWord + " ");
		sentence.append(adj[adj1] + " ");
		sentence.append(noun[person1] + " ");
		sentence.append(verb[verb1] + " ");
		
		sentence.append(conj[conj1] + " ");
		
		sentence.append(article[article2] + " ");
		sentence.append(adj[adj2] + " ");
		sentence.append(noun[person2] + " ");
		sentence.append(verb[verb2] + " ");
		sentence.append(article[2] + " ");
		sentence.append(noun[person1] + ".");
		
		
		return sentence.toString();
	}

	private static int chooseArticle(String word) {
		word.toLowerCase();
		if ( (word.startsWith("a")) || 
				(word.startsWith("i")) || 
				(word.startsWith("u")) || 
				(word.startsWith("e")) || 
				(word.startsWith("o")) ) {
			return 1;
		} else {
			return 0;
		}
	}
	
	private static String upperFirstLetter(String str) {
		StringBuilder sb = new StringBuilder();
		sb.append( (char)(str.charAt(0) - 32) + str.substring(1, str.length()));
		
		return sb.toString();
	}
}
