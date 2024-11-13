package shopping;

import shopping.entity.Customer;

public class ShoppingDemo {
	public static void main(string[] args) {
		Customer cl=new Customer();
		cl.setCid(101);
		cl.setCname("prakashkuamr");
		cl.setCity("villupuram");
		cl.setProduct("computertools");
		Order order;
		
		String choice=c1.getProduct();
		if(choice.equals("Mobiletools"))
		{
			order=MobileTools.getMobiletools();
			
		}
		else
		{
			order=ComputerTools.getComputertools();
		}
		order.ordering();
		
	}

}
