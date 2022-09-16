package corejava;

public class nestedloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
pyramid();

pyramid2();
	}
	
	public static void pyramid()
	{
	int k=0;
for(int i=0;i<=5;i++){
for(int j=1;j<=5-i;j++){
System.out.print(k );
System.out.print("\t");
k++;
	}
System.out.println();
		}
	}
	
	/*public static void pyramid1()
	{
	int k=0;
for(int i=0;i<=5;i++){
for(int j=5;j>=5-i;j--){
System.out.print(k);
System.out.print("\t");
k++;
	}
System.out.println();
		}

	
	}*/
	
public static void pyramid2(){
	
	for(int i=1;i<5;i++){
		for(int j=1;j>=i;j++){
			System.out.print(j);
			System.out.print("\t");
			
		}
		System.out.println("");
	}
}
}


