package Array;

public class minnummetrix {

	public static void main(String[] args) {
		
		//print the min number in defined array metrix:
		
		int a[][]={{2,3,7},{1,5,9},{4,6,0}};
		
		int min=a[0][0];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(a[i][j]<min){
					min=a[i][j];
				}
			}
		}
System.out.println("Minmum Number in define Array metrix is:" +min);
	}


}
