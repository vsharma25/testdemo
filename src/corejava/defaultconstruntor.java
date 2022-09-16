package corejava;

public class defaultconstruntor {
	
	String name;
	int id;
	String address;

	public static void main(String[] args) {
		defaultconstruntor DC=new defaultconstruntor("VARUN",32,"GOVINDPURAM");
		DC.nondefaultconstruntor();

	}
	
	defaultconstruntor(String name, int id, String address){
		
		this.name=name;
		this.id=id;
		this.address=address;
		System.out.println(name+" "+id+" "+address);
	}
	
	void nondefaultconstruntor(){
		String name = null;
		int id = 0;
		System.out.println(name+" "+id);
	}

}
