package stringAssignment;

import java.util.Scanner;

public class Ques5 {

	//  Ques--WAP to print repeatedly occurring characters in the given String.
public static void Checking(String s) {
	s=s.replaceAll(" ", "");
	s=s.toLowerCase();
	char a;
	boolean b=true;
	for(int i=0;i<s.length();i++) {
		for(int j=i;j<s.length();j++) {
			a=s.charAt(i);
			if(a==s.charAt(j) && i!=j) {
			b=false;
			System.out.print(a+" ");
			}
		}
	}
	if(b) {
		System.out.println("none");
	}
	
}
	

   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
   System.out.println("Enter the String to be Checked");
    String s=sc.nextLine();
    System.out.println("The repeatedly Occuring Characters in the String are-> ");
    Checking(s);
   	sc.close();
	}

}
