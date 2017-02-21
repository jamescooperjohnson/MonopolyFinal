public class non extends Board{
	int location;
	String name;
	int price;
	String color;
	int rent;
	String Purchased;
	int num;
	public non(int l, String n, int p, String c, int r, String pu, int nu)
	{
		location=l;
		name=n;
		price=p;
		color=c;
		rent=r;
		Purchased=pu;
		num=nu;
		
		
	}
	
	public String getPurchased() {
		return Purchased;
	}
	public void setPurchased(String purchased) {
		Purchased = purchased;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getLocation() {
		return location;
	}
	public void setLocation(int location) {
		this.location = location;
	}
	public int getRent() {
		return rent;
	}
	public void setRent(int rent) {
		this.rent = rent;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String toString()
	{
		return name;
		
	}
	
}