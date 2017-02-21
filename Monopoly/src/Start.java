import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class Start
{



public static void GameStart() throws InterruptedException
{
	Scanner userInput = new Scanner (System.in);

	System.out.println("What is your name?");	

	String name = userInput.nextLine();

	System.out.println("Hello " + name + ".");
System.out.println();



	boolean stillGuessing = true;

	while(stillGuessing)

		{
			TimeUnit.MILLISECONDS.sleep((600));
			System.out.println("Would you like to play Monopoly?");

			Scanner userInput2 = new Scanner (System.in);

			String userGuess = userInput2.nextLine();

			if (userGuess.equals("yes") || userGuess.equals("yas") || userGuess.equals("yep") || userGuess.equals("Yes") || userGuess.equals("YES") || userGuess.equals("yeah"))
				{

					System.out.println("Welcome to Monopoly.");
					stillGuessing = false;
				}

			else if (userGuess.equals("no") || userGuess.equals("nah") || userGuess.equals("nope") || userGuess.equals("No") || userGuess.equals("NO"))
				{
					System.out.println("Goodbye.");
					stillGuessing = false;
					System.exit(0);
				}
			else
				{
					System.out.println("please enter yes or no.");
					stillGuessing = true;
				}
	TimeUnit.MILLISECONDS.sleep((600));
	System.out.println();
	System.out.println("What version of monopoly would you like to play? ");
	TimeUnit.MILLISECONDS.sleep((600));
	System.out.println();
	System.out.println("We have:");
	TimeUnit.MILLISECONDS.sleep((500));
	System.out.println("1) Original");
	TimeUnit.MILLISECONDS.sleep((500));
	System.out.println("2) Walking Dead");
	TimeUnit.MILLISECONDS.sleep((500));
	System.out.println("3) Custom");
	Scanner choice=new Scanner(System.in);
	String answer=choice.nextLine();
	if(answer.equals("1"))
	{
		Board.spotspace("1");
	}
	if(answer.equals("2"))
	{
		Board.spotspace("DEAD");
	}
	if(answer.equals("3"))
	{
		Board.spotspace("3");
		Custom.custom();
	}
	
	
}
}
}
