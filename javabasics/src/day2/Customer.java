package day2;

public class Customer {
	int Cid;
	String Cname;
	long Caddress;
	String City;
	public int getCid() {
		return Cid;
	}
	public void setCid(int cid) {
		Cid = cid;
	}
	public String getCname() {
		return Cname;
	}
	public void setCname(String cname) {
		Cname = cname;
	}
	public long getCaddress() {
		return Caddress;
	}
	public void setCaddress(long caddress) {
		Caddress = caddress;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	@Override
	public String toString() {
		return "Customer [Cid=" + Cid + ", Cname=" + Cname + ", Caddress=" + Caddress + ", City=" + City + "]";
	}
	
	
	

}