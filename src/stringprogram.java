
public class stringprogram {

	public static void main(String[] args) {
		
		String Name= "VARUN MONA DIKSHA VIVAAN";
		
		String[] SplittedString= Name.split(" "); // Split the string 
		System.out.println(SplittedString[0]);
		System.out.println(SplittedString[1]);
		System.out.println(SplittedString[2]);
		System.out.println(SplittedString[3]);
		
		
		System.out.println(Name);
		
		for(int i=0;i<Name.length();i++) // Print the whole letter of string
		{
			
		System.out.println(Name.charAt(i));
		}
		
		for(int i=Name.length()-1;i>=0;i--)
		{
			System.out.println(Name.charAt(i));
		}
		
		
		// TODO Auto-generated method stub

	}

}
