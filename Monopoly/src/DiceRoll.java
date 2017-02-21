import java.util.Scanner;
public class DiceRoll 
{
	public static int roll()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hit Enter to roll");
		String Uroll=scanner.nextLine();
		int dice=(int) (Math.random()*10)+2;
		return dice;
	}

}
