package Topjavaprograme;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		
		int a,b,temp;
		Scanner in=new Scanner(System.in);
		System.out.println("Assign the value of a and b");
		a=in.nextInt();
		b=in.nextInt();
		System.out.println("The value of a and b before Swapping:"+" "+a+b);
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("The value of a and b after Swapping:"+" "+a+b);
		
				

	}

}
