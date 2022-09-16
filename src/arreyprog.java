
public class arreyprog {

	public static void main(String[] args) {
		
	int [] arr = new int [10];
		
		arr[0]= 2;
		arr[1]=4;
		arr[2]=6;
		arr[3]=8;
		arr[4]=10;
		arr[5]=12;
		
	System.out.println(arr.length);
	System.out.println(arr[5]);
	
	int[] rollnum= {10,80,70,60,50,40};
	String [] name= {"VARUN", "Mohini", "Diksha", "VIvaan"};
	
	System.out.println(name[2]);
	
	for (int i = 0; i< rollnum.length; i++){
		System.out.println(rollnum[i]);
	}
	for (int j=0; j<name.length; j++)
	{
		
		System.out.println(name[j]);
	}
	
	for(String s: name){
		System.out.println(s);
	}
	
	
	

	}
}