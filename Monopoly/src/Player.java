
public class Player {
static int money= 1500;
static Player p=new Player(money);
public Player(int m){
	money=m;
	
}
public int getMoney() {
	return money;
}
public void setMoney(int money) {
	this.money = money;
}
public String toString()
{
	return "Balance: " + money;
}
}
