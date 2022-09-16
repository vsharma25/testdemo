package Array;

public class maxnumincolumn {

	public static void main(String[] args) {
		// Find the minimun number in array and than print the maximun number in that column
		
		int a[][]={{4,3,5,3,2},{7,4,3,2,1},{5,7,3,0,2},{1,4,7,9,4}};
		int min=a[0][0];
		int mincol=0;
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<5;j++){
				//System.out.println(a[i][j]);
				
				if(a[i][j]<min){
					min=a[i][j];
					mincol=j;
				}
			}
		}
		int max=a[0][mincol];
		int k=0;
		while(k<4){
			if(a[k][mincol]>max){
				max=a[k][mincol];
			}
		}
		
		System.out.println("The min number in array is:" +min);
		System.out.println("The max number in mincol is:" +max);
	}

}
