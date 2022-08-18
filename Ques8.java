package stringAssignment;
import java.util.Scanner;

//  Ques--> WAP to count number of special characters.


public class Ques8 {
public static void countingSpecialCharacters(String s1) {
	int a=0;
	String s2="!@#$%^&*|?/<>-+=";
	for(int i=0;i<s1.length();i++) {
	for(int j=0;j<s2.length();j++){
		if(s1.charAt(i)==s2.charAt(j)) {
			a++;
	} }	}
	System.out.println("The num of special Charecters in the given String are-->  "+a);	
}
	
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Kindly Enter the String whose Special Characters you have to count");
    String s1=sc.nextLine();
    countingSpecialCharacters(s1);
    sc.close();
	}
}
