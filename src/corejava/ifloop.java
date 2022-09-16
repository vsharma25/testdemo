package corejava;

import java.util.ArrayList;
import java.util.Arrays;

public class ifloop {

	public static void main(String[] args) {
		
		/*for loop: The for loop is used to iterate a part of the program several times.if the number of iteration is fixed, 
		it is recommended to use for loop.
		
		Iterate : Run or to be performed again.
		
		Syntax:
		for(initialization; condition; increment/decrement){    
		}
		
		*/
		
System.out.println("for loop  :");
	
for(int i=0;i<=10;i++){
			
			System.out.println(i);
		}

/* Java Nested for Loop
If we have a for loop inside the another loop, it is known as nested for loop. 
The inner loop executes completely whenever outer loop executes. */
	
System.out.println("Nested for loop  :");

  

for(int i=1;i<=5;i++){  
for(int j=1;j<=i;j++){  
System.out.print("* ");  
}  
System.out.println();
}  

for(int i=1;i<=5;i++){  
for(int j=5;j>=i;j--){  
System.out.print("*  ");  
}  
System.out.println();
}  
		

ArrayList<String> Stuname=new ArrayList<String>(Arrays.asList("VARUN", "MONA" ,"Vivaan", "DIksha"));
Stuname.stream().filter(s->s.startsWith("M")).forEach(s->System.out.println(s));

/*for(String S: Stuname){
	System.out.println(Stuname);
}*/
	}
}


