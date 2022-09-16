package Array;

import java.util.Scanner;

public class getarray {
	
	@SuppressWarnings("resource")
	public static void main(String[] args){
		
		
		
		Scanner xyz = new Scanner(System.in);

	    // declaring and creating array objects
	    int[] arr = new int[5];

	    // displaying default values
	    System.out.println("Default values of array:");
	    for (int i=0; i < arr.length; i++) {
	      System.out.print(arr[i]+"\t");
	    }

	    // initializing array
	    System.out.println("\n***Initializing Array***");
	    System.out.println("Enter 5 integer values:");

	    for(int i=0; i < arr.length; i++) {
	      // read input
	      arr[i] = xyz.nextInt();
	    }
	    System.out.println("\n***Initialization completed***");

	    //displaying initialized values
	    System.out.println("Array elements are:");
	    for (int i=0; i < arr.length; i++) {
	      System.out.print(arr[i]+"\t");
	    }

	  }
	}


