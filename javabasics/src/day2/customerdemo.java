package day2;



public class customerdemo {
	public static void main (String[]args) {
		
		int m1=100;
		Customer c1=new Customer();
		Customer c2=new Customer();
		Customer c3=new Customer();
		
		c1.Cid=101;
		c1.Cname="vimal";
		c1.Caddress="neyveli";
		c1.City="Chennai";
		
		c2.Cid=102;
		c2.Cname="prakash";
		c2.Caddress="panruti";
		c2.City="pattukotai";
		
		c3.Cid=103;
		c3.Cname="prasanna";
		c3.Caddress="karaikudi";
		c3.City="kandamangalam";
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
	}

}


