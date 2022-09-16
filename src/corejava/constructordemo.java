package corejava;

public class constructordemo {

	public static void main(String[] args) {
    new constructordemo(10,20);
    new constructordemo("Varun","Sharma");

	}
	
	public constructordemo(int a, int b){
		int c=a+b;
		System.out.println(c);
	}
	
	public constructordemo(String a, String b){
		String finalString= a+ " "+b;
		
		System.out.println(finalString);
	}

	

}
