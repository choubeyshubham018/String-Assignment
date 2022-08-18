package stringAssignment;
 import java.util.Arrays;
import java.util.Scanner;
// Ques6-WAP to sort a String Alphabetically.

 class SortingString {
 
	public String sortingMethod1(String s1) {
		char c1;
	//	s1=s1.toLowerCase();
		char arr[]=s1.toCharArray();
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
			if(arr[i]>arr[j]) {
				c1=arr[i];
				arr[i]=arr[j];
			    arr[j]=c1;
			}
		}}
		return new String(arr);
	}
	
	public String sortingMethod2(String s1){
		char arr[]=s1.toCharArray();
		Arrays.sort(arr);
		return new String(arr);
		}
	
}
	
	
	
	
	public class Ques6 {
	
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Write the String to be sorted");
    String s1=sc.nextLine();
    SortingString a=new SortingString();
    String s2=a.sortingMethod1(s1);
    System.out.println("By Method 1");
     System.out.println(s2);
     String s3=a.sortingMethod2(s1);
     System.out.println("By Method 2");
     System.out.println(s3);
     sc.close();
	}

}
