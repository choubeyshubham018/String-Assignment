package stringAssignment;

import java.util.Scanner;

// Ques 7->WAP to count the number of Vowels and Consonants of a String value.
public class Ques7 {

	public void counting(String s1) {
		int a=0;
	    String s2="aeiou";
	    s1=s1.toLowerCase();
	    s1=s1.replaceAll(" ","");
		for(int i=0;i<s1.length();i++) {
			for(int j=0;j<s2.length();j++) {
		if(s1.charAt(i)==s2.charAt(j)) {
			a=a+1;
		}
			}
		}
		System.out.println("The number of Vowels in the String are-->"+" "+ a);
		System.out.println("The number of consonants in the given String are-->"+(s1.length()-a));
		}
	
	
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String ");
		String s1=sc.nextLine();
        Ques7 obj=new Ques7();
        obj.counting(s1);
        sc.close();

	}

}
