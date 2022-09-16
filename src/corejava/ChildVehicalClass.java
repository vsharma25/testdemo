package corejava;

public class ChildVehicalClass extends ParentVehicalClass {

	public static void main(String[] args) {
		
		ChildVehicalClass cvc=new ChildVehicalClass();
		
		light();
		Gears();
		Body();
		Tyres();
		cvc.Engine();

	}

	@Override
	public void Engine() {
	System.out.println("Implements the Vehical New Engine Property");
		
	}

}
