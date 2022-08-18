package stringAssignment;

import java.util.Scanner;

/*Ques--WAP to reverse a sentence while preserving the position.
Input : “Think Twice”
Output : “kniht eciwt”*/



public class ReverseSentence {
	
	
	
	public void reversing() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Kindly Enter the Statement  with Space Between It's words");
		String s1=sc.nextLine();
		String s2="";
		String s3="";

		for(int i=s1.length()-1;i>=0;i--) {
			s2=s2+s1.charAt(i);
		}
		String a[]=s2.split(" ");
		for(int i=a.length-1;i>=0;i--) {
			 s3=s3+a[i]+" ";
		}
		System.out.println(s3);
	}
	

	public static void main(String[] args) {
		ReverseSentence R=new ReverseSentence();
	R.reversing();
   
}}