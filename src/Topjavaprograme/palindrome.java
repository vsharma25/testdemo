package Topjavaprograme;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {

String A;
Scanner in=new Scanner(System.in);

System.out.println("Enter the value of string");
A=in.nextLine();
char []X=A.toCharArray();
for(int i=X.length-1;i>=0;i--){System.out.println(X[i]);

}
if(X.equals(A))
	System.out.println("Eneterd String is palindrome");
else
	System.out.println("Eneterd String is not palindrome");
	



	}

}
