package Array;

public class MaxnuminArray {

	public static void main(String[] args) {
		printmaxnum();		
		int ARR[][]={{8,5,3},{10,18,20},{30,50,1000}};
		int max=ARR[0][0];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(ARR[i][j]>max){
					max=ARR[i][j];
				}
			}
		}
		System.out.println("The mximum number in defined array is:" +max);

	}
public static void printmaxnum(){
	int a[]={4,10,24,34,75};
	int max=0;
	
	for(int i=0;i<5;i++){
		if(a[i]>max){
			max=a[i];
		}
	}
	System.out.println("The maximun num in single dimensional array is:"+max);
}
}
