package shopping.inpl_ordering;
import shopping.interface_sample.order;

public class Mobiletools implements order {
	private static Mobiletools mobiletools=new Mobiletools();

	public static Mobiletools getMobiletools() {
		return mobiletools;
	}

	public static void setMobiletools(Mobiletools mobiletools) {
		Mobiletools.mobiletools = mobiletools;
	}
	private Mobiletools() {
		
	}
	@override
	public void ordering()
	
	{
		System.out.printin("Im buying bluetooth headphone...");
	}
	

}
