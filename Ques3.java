package stringAssignment;

import java.util.Scanner;

//Ques- WAP to check if the two Strings is Anagram or not.


public class Ques3 {
	boolean a=false;
	public void checkingAnagram(String s1,String s2) {
		s1=s1.toLowerCase();s2=s2.toLowerCase();
		if(s1.length()!=s2.length()) {
		System.out.println("The Strings are not Anagram");}
		else {
			for(int i=0;i<s1.length();i++) {
				for(int j=0;j<s2.length();j++) {
					if(s1.charAt(i)==s2.charAt(j)) {
						a=true;
						break;
					}
					else {
						a=false;
					}
						}
				if(a==false) {
					System.out.println("The Strings are not Anagram");
                    System.exit(0);				
                    }
			}
			if(a) {
			System.out.println("The strings are Anagram");
		}}
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Kindly Enter the first String");
		String s1=sc.nextLine();

		System.out.println("Enter the Second String");
        String s2=sc.nextLine();
        Ques3 a=new Ques3();
        a.checkingAnagram(s1,s2);
        sc.close();
	}

}
