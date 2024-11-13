package shopping.entity;

public class Customer {
	private int Cid;
	private String Cname;
	private String City;
	private String Product;
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
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getProduct() {
		return Product;
	}
	public void setProduct(String product) {
		Product = product;
	}
	@Override
	public String toString() {
		return "Customer [Cid=" + Cid + ", Cname=" + Cname + ", City=" + City + ", Product=" + Product + "]";
	}
}
	