package Topjavaprograme;

import java.util.Scanner;

public class reverseString {
	
	public static void main(String[] args){
		
		//Using String Inbuilt Function//
		
		String S= "Welcome To Automation";
		
		StringBuilder SB= new StringBuilder();
		SB.append(S);
		SB=SB.reverse();
		System.out.println(SB);
		
		//Without Using Inbuilt Function//
		
		/*String s= "VARUN";		
		char[]C=s.toCharArray(); //converting that string into a character array with the toCharArray() function.
		for(int i=C.length-1;i>=0;i--){
		System.out.println(C[i]);
		}
		
		//Using scanner class//
		
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the String Value:");
		String A=in.nextLine();
		String[] B=A.split("");
		for(int i=B.length-1;i>=0;i--){
			System.out.println(B[i]+"");
			
			
		}*/
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String Value:");
		String Text=sc.nextLine();
		
		for(int i=1;i<Text.length();i++){
			char C=Text.charAt(i);
		}*/
		
		
		
	}

}
