package stringAssignment;

import java.util.Scanner;

// Ques 4 -WAP to check if the String is a Pangram or not.

 class ToCheckPangram{
	 public void checking(String a) {
		 boolean b=false;
		 a=a.toLowerCase();
		 a=a.replaceAll(" ","");
		 for(char i=97;i<=122;i++){
		 for(int j=0;j<a.length();j++) {
			 if(i==a.charAt(j)) {
				 b=true;
				 break;
			 }
			  else {
				 b=false;
				 }
			 }
		 if(b==false) {
			 System.out.println("The Sentence is not Pangram");
			 break;
		 }
		 }
		 if(b) {
		 System.out.println("The Sentence is Pangram");
	 }
		 }
	
 }



public class Ques4 {

	public static void main(String[] args) {
		Scanner s1 =new Scanner(System.in);
		System.out.println("Kindly Enter the sentence you want to check");
		String a=s1.nextLine();
     ToCheckPangram c=new ToCheckPangram();
	c.checking(a);
	s1.close();
	}

}
