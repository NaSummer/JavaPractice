import java.text.DecimalFormat;
import javax.swing.JOptionPane;//This code is designed by Clerk(Xu Nuo), and our team members include Clerk(Xu Nuo),Li Zekun,Lou Jiahong,Sun Hao,Xuyang Haochen 
public class presentation3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df=new java.text.DecimalFormat(".#"); 
		JOptionPane.showMessageDialog(null,
				 "\n                                                                                         /|"
				+"\n                                                                                      /   |"
				+"\n                                                                                   /      |"
				+"\n                                                                                /         |"
				+"\n                                                                             /            |"
				+"\n                                                                          /______ |"
				+ "\nThis a math game which called triangle. You can choose how many questions you want to test. \nThere are 100 grades in total. \nThe game will show you the grades and your testing time.");
		String input0=JOptionPane.showInputDialog(null,"Enter the number of questions you want to test.","triangle math game",JOptionPane.QUESTION_MESSAGE);
		int data0=Integer.parseInt(input0);
		final int NUMBER_OF_QUESTIONS=data0;
		int question=1;
		int currect=0;
		int count=0;
		long startTime=System.currentTimeMillis();
		while(count<NUMBER_OF_QUESTIONS){
		int a=(int)(Math.random()*10+1);
		int b=(int)(Math.random()*10+1);
		int c=(int)(Math.random()*10+1);
		
		int f=(int)(Math.random()*10);
		if(f<3){
		String input1=JOptionPane.showInputDialog(null,"question "+question+" : if a = "+a+", "+"b = "+b+", c = "+c+",\nEnter the area of the triangle: \nEnter 0 if this question doesn't have an answer.","triangle math game",JOptionPane.QUESTION_MESSAGE);
	double p=(a+b+c)/2;
	double d=p*(p-a)*(p-b)*(p-c);
	double e=Math.pow(d, 0.5);
	double data1=Double.parseDouble(input1);
	if((a+b>c)&&(a-b<c)&&(b-a<c)){
	double cha=Math.abs(data1-e);
		if(cha<=0.1){
		JOptionPane.showMessageDialog(null,"That's currect!");currect++;}
	else
		JOptionPane.showMessageDialog(null,"That's wrong! The currect answer is: "+df.format(e));
	}
	else{
		if (data1==0){
		JOptionPane.showMessageDialog(null,"Yes,this question doesn't has an answer.");currect++;}
		else
			JOptionPane.showMessageDialog(null,"Sorry,this question doesn't has an answer.");
	}
	}
		
		else {
			int angle=(int)(Math.random()*13);
			double area1=0.5*a*b*0.5;
			double area2=0.5*a*b*0.85;
			double area3=0.5*a*b*0.85;
			double area4=0.5*a*b*0.6;
			double area5=0.5*a*b*0.5;
			double area6=0.5*a*b*0.95;
			double area7=0.5*a*b*0.7;
			double area8=0.5*a*b*0.25;
			double area9=0.5*a*b*0.6;
			double area10=0.5*a*b*0.85;
			double area11=0.5*a*b*0.6;
			double area12=0.5*a*b*0.7;
			double area13=0.5*a*b*0.7;
			switch(angle){
			case 0:
			String input2=JOptionPane.showInputDialog(null,"question "+question+" : if a = "+a+", "+"b = "+b+", C = 30"+",\nEnter the area of the triangle: ","triangle math game",JOptionPane.QUESTION_MESSAGE);double data2=Double.parseDouble(input2);
			double cha0=Math.abs(data2-area1);
			if(cha0<=0.1){
				JOptionPane.showMessageDialog(null,"That's currect!");currect++;}
			else
				JOptionPane.showMessageDialog(null,"That's wrong! The currect answer is: "+df.format(area1));break;
			case 1:
			String input3=JOptionPane.showInputDialog(null,"question "+question+" : if a = "+a+", "+"b = "+b+", C = 120"+",\nEnter the area of the triangle: ","triangle math game",JOptionPane.QUESTION_MESSAGE);double data3=Double.parseDouble(input3);
			double cha1=Math.abs(data3-area2);
			if(cha1<=0.1){
				JOptionPane.showMessageDialog(null,"That's currect!");currect++;}
			else
				JOptionPane.showMessageDialog(null,"That's wrong! The currect answer is: "+df.format(area2));break;
			case 2:
			String input4=JOptionPane.showInputDialog(null,"question "+question+" : if a = "+a+", "+"b = "+b+", C = 60"+",\nEnter the area of the triangle: ","triangle math game",JOptionPane.QUESTION_MESSAGE);double data4=Double.parseDouble(input4);
			double cha2=Math.abs(data4-area3);
			if(cha2<=0.1){
				JOptionPane.showMessageDialog(null,"That's currect!");currect++;}
			else
				JOptionPane.showMessageDialog(null,"That's wrong! The currect answer is: "+df.format(area3));break;
			case 3:
			String input5=JOptionPane.showInputDialog(null,"question "+question+" : if a = "+a+", "+"b = "+b+", C = 37"+",\nEnter the area of the triangle: ","triangle math game",JOptionPane.QUESTION_MESSAGE);double data5=Double.parseDouble(input5);
			double cha3=Math.abs(data5-area4);
			if(cha3<0.1){
				JOptionPane.showMessageDialog(null,"That's currect!");currect++;}
			else
				JOptionPane.showMessageDialog(null,"That's wrong! The currect answer is: "+df.format(area4));break;
			case 4:
			String input6=JOptionPane.showInputDialog(null,"question "+question+" : if a = "+a+", "+"b = "+b+", C = 150"+",\nEnter the area of the triangle: ","triangle math game",JOptionPane.QUESTION_MESSAGE);double data6=Double.parseDouble(input6);
			double cha4=Math.abs(data6-area5);
			if(cha4<=0.1){
				JOptionPane.showMessageDialog(null,"That's currect!");currect++;}
			else
				JOptionPane.showMessageDialog(null,"That's wrong! The currect answer is: "+df.format(area5));break;
			case 5:
		    String input7=JOptionPane.showInputDialog(null,"question "+question+" : if a = "+a+", "+"b = "+b+", C = 75"+",\nEnter the area of the triangle: ","triangle math game",JOptionPane.QUESTION_MESSAGE);double data7=Double.parseDouble(input7);
		    double cha5=Math.abs(data7-area6);
		    if(cha5<=0.1){
				JOptionPane.showMessageDialog(null,"That's currect!");currect++;}
			else
				JOptionPane.showMessageDialog(null,"That's wrong! The currect answer is: "+df.format(area6));break;
			case 6:
			String input8=JOptionPane.showInputDialog(null,"question "+question+" : if a = "+a+", "+"b = "+b+", C = 135"+",\nEnter the area of the triangle: ","triangle math game",JOptionPane.QUESTION_MESSAGE);double data8=Double.parseDouble(input8);
			double cha6=Math.abs(data8-area7);
			if(cha6<=0.1){
				JOptionPane.showMessageDialog(null,"That's currect!");currect++;}
			else
				JOptionPane.showMessageDialog(null,"That's wrong! The currect answer is: "+df.format(area7));break;
			case 7:
			String input9=JOptionPane.showInputDialog(null,"question "+question+" : if a = "+a+", "+"b = "+b+", C = 15"+",\nEnter the area of the triangle: ","triangle math game",JOptionPane.QUESTION_MESSAGE);double data9=Double.parseDouble(input9);
			double cha7=Math.abs(data9-area8);
			if(cha7<=0.1){
				JOptionPane.showMessageDialog(null,"That's currect!");currect++;}
			else
				JOptionPane.showMessageDialog(null,"That's wrong! The currect answer is: "+df.format(area8));break;
			case 8:
			String input10=JOptionPane.showInputDialog(null,"question "+question+" : if a = "+a+", "+"b = "+b+", cosC = 0.8"+",\nEnter the area of the triangle: ","triangle math game",JOptionPane.QUESTION_MESSAGE);double data10=Double.parseDouble(input10);
			double cha8=Math.abs(data10-area9);
			if(cha8<=0.1){
				JOptionPane.showMessageDialog(null,"That's currect!");currect++;}
			else
				JOptionPane.showMessageDialog(null,"That's wrong! The currect answer is: "+df.format(area9));break;
			case 9:
			String input11=JOptionPane.showInputDialog(null,"question "+question+" : if a = "+a+", "+"b = "+b+", cosC = 0.5"+",\nEnter the area of the triangle: ","triangle math game",JOptionPane.QUESTION_MESSAGE);double data11=Double.parseDouble(input11);
			double cha9=Math.abs(data11-area10);
			if(cha9<=0.1){
				JOptionPane.showMessageDialog(null,"That's currect!");currect++;}
			else
				JOptionPane.showMessageDialog(null,"That's wrong! The currect answer is: "+df.format(area10));break;
			case 10:
			String input12=JOptionPane.showInputDialog(null,"question "+question+" : if a = "+a+", "+"b = "+b+", tanC = 0.75"+",\nEnter the area of the triangle: ","triangle math game",JOptionPane.QUESTION_MESSAGE);double data12=Double.parseDouble(input12);
			double cha10=Math.abs(data12-area11);
			if(cha10<=0.1){
				JOptionPane.showMessageDialog(null,"That's currect!");currect++;}
			else
				JOptionPane.showMessageDialog(null,"That's wrong! The currect answer is: "+df.format(area11));break;
			case 11:
			String input13=JOptionPane.showInputDialog(null,"question "+question+" : if a = "+a+", "+"b = "+b+", tanC = 1"+",\nEnter the area of the triangle: ","triangle math game",JOptionPane.QUESTION_MESSAGE);double data13=Double.parseDouble(input13);
			double cha11=Math.abs(data13-area12);
			if(cha11<=0.1){
				JOptionPane.showMessageDialog(null,"That's currect!");currect++;}
			else
				JOptionPane.showMessageDialog(null,"That's wrong! The currect answer is: "+df.format(area12));break;
			case 12:
			String input14=JOptionPane.showInputDialog(null,"question "+question+" : if a = "+a+", "+"b = "+b+", cotC = 1"+",\nEnter the area of the triangle: ","triangle math game",JOptionPane.QUESTION_MESSAGE);double data14=Double.parseDouble(input14);
			double cha12=Math.abs(data14-area13);
			if(cha12<=0.1){
				JOptionPane.showMessageDialog(null,"That's currect!");currect++;}
			else
				JOptionPane.showMessageDialog(null,"That's wrong! The currect answer is: "+df.format(area13));break;
			
			}
		}
		count++;
		question++;
		
	}
		long endTime=System.currentTimeMillis();
		long testTime=endTime-startTime;
		JOptionPane.showMessageDialog(null, "The test time is "+(int)testTime/1000/60+" minute(s) "+testTime/1000%60+" second(s)"+"\nYou answer each question for "+testTime/1000/data0+" seconds"+"\nYou get "+currect*100/data0+" grades");
		JOptionPane.showMessageDialog(null,  
				 "\n                           /|"
				+"\n                        /   |"
				+"\n                     /      |"
				+"\n                  /         |"
				+"\n               /            |"
				+"\n            /______ |"
				+"\nThanks for playing!");
	}
}