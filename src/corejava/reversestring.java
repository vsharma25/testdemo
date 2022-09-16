package corejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class reversestring<interger> {

	public static void main(String[] args) {
		
		returnstring();
	}
	
	public static void returnstring(){
		ArrayList<String> Name=new ArrayList<String>(Arrays.asList("VARUN"));
		Name.stream().forEach(a->
		{
		
		String Result= "";
		for(int i=a.length()-1;i>=0;i--)
			Result +=a.charAt(i);
			System.out.println(Result );
			});
		
		
		
		
		
		
	}
	
	public void reverseinteger(){
		List<interger> num=(List<interger>) Arrays.asList(234,876,787);
		num.stream().forEach(a->
		{
			int result=0;
	
			
		}
				);
	}

}
