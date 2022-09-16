package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArratList {

	public static void main(String[] args) {
		//ArrayList, LinkedList and Vector is the class of List collection
		
		ArrayList<String> AL=new ArrayList<String>();
		
		AL.add("East");
		AL.add("West");
		AL.add("North");
		AL.add("South");
		System.out.println(AL);
		/*System.out.println(AL.isEmpty());
		AL.remove("North");
		System.out.println(AL);
		System.out.println(AL.get(2));
		AL.set(2, "North");
		System.out.println(AL);
		System.out.println(AL.get(2));*/
		
		//Iterator in Java is used to traverse each and every element in the collection.
		
		Iterator<String> I=AL.iterator();
		System.out.println(I.next());
		System.out.println(I.next());
		System.out.println(I.next());
		/*while(I.hasNext()){
			System.out.println(I.next());		
		}*/
		

	

}
}
