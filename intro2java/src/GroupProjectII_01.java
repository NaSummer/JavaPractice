//import java.util.Random;

public class GroupProjectII_01 {

	public static void main(String[] args) {
		
		int actorSubjectTotalNumber = 7;
		int actionVerbTotalNumber = 6;
		int actorObjectTotalNumber = 7;
		
		Word actorSubject[];
		actorSubject = new Word[actorSubjectTotalNumber];
		actorSubject[0] = new Word("Dog",true);
		actorSubject[1] = new Word("Cat",true);
		actorSubject[2] = new Word("Fish",true);
		actorSubject[3] = new Word("Worm",true);
		actorSubject[4] = new Word("You",false);
		actorSubject[5] = new Word("He",true);
		actorSubject[6] = new Word("She",true);
		
		Word actionVerb[];
		actionVerb = new Word[actionVerbTotalNumber];
		actionVerb[0] = new Word("likes",true);
		actionVerb[1] = new Word("like",false);
		actionVerb[2] = new Word("does not like",true);
		actionVerb[3] = new Word("do not like",false);
		actionVerb[4] = new Word("hits",true);
		actionVerb[5] = new Word("hit",false);
		
		Word actorObject[];
		actorObject = new Word[actorObjectTotalNumber];
		actorObject[0] = new Word("dog",true);
		actorObject[1] = new Word("cat",true);
		actorObject[2] = new Word("fish",true);
		actorObject[3] = new Word("worm",true);
		actorObject[4] = new Word("you",false);
		actorObject[5] = new Word("him",true);
		actorObject[6] = new Word("her",true);
		
	//int j = 0;	
	//for (int i = 0; i<101; i++){	
		
		int actorSubjectNumber = -1;
		int actionVerbNumber = -1;
		int actorObjectNumber = -1;
		Boolean illegal = true;
		do{
			actorSubjectNumber = (int) (Math.random() * actorSubjectTotalNumber);
			actionVerbNumber = (int) (Math.random() * actionVerbTotalNumber);
			if ( (actorSubject[actorSubjectNumber].singular == actionVerb[actionVerbNumber].singular) && (actorSubjectNumber + actionVerbNumber * 10 != 43) ){
				actorObjectNumber = (int) (Math.random() * actorObjectTotalNumber);
				if ((actorSubjectNumber * actorObjectNumber != 16 )){
					illegal = false;
					System.out.println(actorSubject[actorSubjectNumber].content + " " + actionVerb[actionVerbNumber].content + " " + actorObject[actorObjectNumber].content + ".");
				
				//j++;
				}
			}
		} while (illegal);
	//}
	
	
	//System.out.println(j);
	
		/*
		 * Enumeration, for judging whether the sentence is right.
		 * This part can be comment after enumeration and judging.
		 */
		/*
		for (int actorSubjectNumber = 0; actorSubjectNumber < actorSubjectTotalNumber; actorSubjectNumber++){
			for (int actionVerbNumber = 0; actionVerbNumber < actionVerbTotalNumber; actionVerbNumber++){
				if (actorSubject[actorSubjectNumber].singular = actionVerb[actionVerbNumber].singular){
					for (int actorObjectNumber = 0; actorObjectNumber < actorObjectTotalNumber; actorObjectNumber++){
						System.out.println(actorSubject[actorSubjectNumber].content + " " + actionVerb[actionVerbNumber].content + " " + actorObject[actorObjectNumber].content + ".");
					}
				}
			}
		}
		System.out.println();
		*/
		
	}
}
/*
 * For store the word and its singular state.
 */
class Word{
	String content;
	Boolean singular;
	Word(String content, Boolean singular){
		this.content = content;
		this.singular = singular;
	}
}
