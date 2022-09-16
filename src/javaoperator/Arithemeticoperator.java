package javaoperator;

public class Arithemeticoperator {
	
	/*
	+	Addition
	-	Subtraction
	*	Multiplication
	/	Division
	%	Modulo Operation (Remainder after division)*/
	
	public static void main (String[]args){
		
		Arithemeticoperator AO=new Arithemeticoperator();
			
		AO.addData();
		AO.SubData();
		AO.RemData();
		AO.divData();
		AO.mulData();
	
	
}
	int a=15,b=10;
	public void addData(){
		//Addition
		System.out.println("addition of a+b: " +" "+(a+b));
		
	}
public void SubData(){
	//Subtraction
		System.out.println("Subtraction of a-b: " +" "+(a-b));
		
	}
public void mulData(){
	//Multiplication
		System.out.println("Multliplication of a*b: " +" "+(a*b));
		
	}
public void divData(){
	//Division
		System.out.println("Division of a/b: " +" "+(a/b));
		
	}
public void RemData(){
	//Remainder after division
		System.out.println("a % b = " + (a % b));
		
	}
}

