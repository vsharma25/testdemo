package corejava;

public class chileIndianTrafficrepo implements IndianTrafficrepo {

	public static void main(String[] args) {

		chileIndianTrafficrepo ITR=new chileIndianTrafficrepo();
		ITR.redStop();
		ITR.greenGO();
		ITR.yellowWait();

	}

	@Override
	public void greenGO() {
		System.out.println("Green Signal for GO");
		
	}

	@Override
	public void redStop() {
		System.out.println("Red Signal for STOP");
		
	}

	@Override
	public void yellowWait() {
		System.out.println("YELLOW Signal for WAIT");
		
	}

}
