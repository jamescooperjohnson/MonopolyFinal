import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class MainGame 
{
	public static void play() throws InterruptedException
	{
		int space=0-1;
//		int house=0;
		boolean inJail =false;
		while(Player.p.getMoney()>0)
		{
			System.out.println();
			System.out.println("Your account balance is $"+Player.p.getMoney());
			TimeUnit.MILLISECONDS.sleep((400));
			int roll=DiceRoll.roll();
//System.out.println(roll);
//System.out.println(space);			
			
			if (inJail== false)
			{

				
				if(space+roll<40)
				{
					space=space+roll;
					System.out.println(Board.board.get(space));
					if(Board.board.get(space).getLocation()==30)
					{
						System.out.println("GO TO JAIL! You will now go backwards around the board until you hit GO. You must pay $100 in bail money.");
						TimeUnit.MILLISECONDS.sleep((400));
						space=9;
						
						System.out.println("You are now in Jail.");
						TimeUnit.MILLISECONDS.sleep((400));
						Player.p.setMoney(Player.p.getMoney()-100);
						
						System.out.println("Your account balance is now $" +Player.p.getMoney());
						inJail=true;
					}
//					if(space==39)
//					{
//						System.out.println("You have reached GO. Collect $200");
//						Player.p.setMoney(Player.p.getMoney()+200);
//
//					}
				}
				else 
				{
					space=((space-40)+roll);
					System.out.println(Board.board.get(space));
					TimeUnit.MILLISECONDS.sleep((400));
					System.out.println("You have reached GO. Collect $200");
					System.out.println();
					Player.p.setMoney(Player.p.getMoney()+200);
				}
				
			}
			else
			{
				if(space-roll>0)
				{
					space=space-roll;
					System.out.println(Board.board.get(space));
				}
				else
				{
					space=39-(roll-space);
					System.out.println(Board.board.get(space));
					TimeUnit.MILLISECONDS.sleep((400));
					System.out.println("Your sentence is done. Join the normal game again.");
					inJail=false;
				}
			}
			if ( Board.board.get(space).getPrice()!=0 && Board.board.get(space).getRent()==0 )
			{
				Player.p.setMoney(Player.p.getMoney()-Board.board.get(space).getPrice());
				TimeUnit.MILLISECONDS.sleep((400));
				System.out.println("Your new balance is $" + Player.p.getMoney());
			}

			if(Board.board.get(space).getPrice()>0 && Board.board.get(space).getRent()!=0 &&Board.board.get(space).getNum()==0 )
			{
				if(Player.p.getMoney()>=Board.board.get(space).getPrice())
				{
					TimeUnit.MILLISECONDS.sleep((400));
					System.out.println("Would you like to purchase this? y or n" );

					Scanner userInput = new Scanner (System.in);

					String userbuy = userInput.nextLine();

					if (userbuy.equals("y") || userbuy.equals("Y"))
					{
						TimeUnit.MILLISECONDS.sleep((400));
						System.out.println("You now own this.");
						TimeUnit.MILLISECONDS.sleep((400));
						Board.board.get(space).setPurchased("Yours");
						Board.board.get(space).setNum(1);
						System.out.println("New Purchase information: ");
						for(int i=0; i<=39; i++)
						{
							if(Board.board.get(i).getNum()==1)
							{
								TimeUnit.MILLISECONDS.sleep((200));
								System.out.println(Board.board.get(i).getName());
							}
						}
						System.out.println();
						TimeUnit.MILLISECONDS.sleep((400));
						Player.p.setMoney(Player.p.getMoney()-Board.board.get(space).getPrice());
					}
					else
					{
						
					}

				}
				else
				{
					System.out.println("You Don't have a high enough account balance.");
				}
			}
			if ( 	(((Board.board.get(0).getNum() == 1)) && (Board.board.get(0).getNum() == Board.board.get(2).getNum()) && (((Board.board.get(space).getLocation() == 3|| Board.board.get(space).getLocation() == 1) ))) ||
					(((Board.board.get(5).getNum() == 1)) && ((Board.board.get(5).getNum() == Board.board.get(7).getNum()) && Board.board.get(7).getNum() == Board.board.get(8).getNum()) && (((Board.board.get(space).getLocation() == 6|| Board.board.get(space).getLocation() == 8 || Board.board.get(space).getLocation() == 9) ))) ||
					(((Board.board.get(10).getNum() == 1)) && ((Board.board.get(10).getNum() == Board.board.get(12).getNum()) && Board.board.get(12).getNum() == Board.board.get(13).getNum()) && (((Board.board.get(space).getLocation() == 11|| Board.board.get(space).getLocation() == 13 || Board.board.get(space).getLocation() == 14) ))) ||
					(((Board.board.get(15).getNum() == 1)) && ((Board.board.get(15).getNum() == Board.board.get(17).getNum()) && Board.board.get(17).getNum() == Board.board.get(18).getNum()) && (((Board.board.get(space).getLocation() == 16|| Board.board.get(space).getLocation() == 18 || Board.board.get(space).getLocation() == 19) ))) ||
					(((Board.board.get(20).getNum() == 1)) && ((Board.board.get(20).getNum() == Board.board.get(22).getNum()) && Board.board.get(22).getNum() == Board.board.get(23).getNum()) && (((Board.board.get(space).getLocation() == 21|| Board.board.get(space).getLocation() == 23 || Board.board.get(space).getLocation() == 24) ))) ||
					(((Board.board.get(25).getNum() == 1)) && ((Board.board.get(25).getNum() == Board.board.get(27).getNum()) && Board.board.get(27).getNum() == Board.board.get(28).getNum()) && (((Board.board.get(space).getLocation() == 26|| Board.board.get(space).getLocation() == 28 || Board.board.get(space).getLocation() == 29) ))) ||
					(((Board.board.get(30).getNum() == 1)) && ((Board.board.get(30).getNum() == Board.board.get(31).getNum()) && Board.board.get(31).getNum() == Board.board.get(33).getNum()) && (((Board.board.get(space).getLocation() == 31|| Board.board.get(space).getLocation() == 32 || Board.board.get(space).getLocation() == 34) ))) ||
					(((Board.board.get(36).getNum() == 1)) && (Board.board.get(36).getNum() == Board.board.get(38).getNum()) && (((Board.board.get(space).getLocation() == 37|| Board.board.get(space).getLocation() == 39) ))))

			{
				TimeUnit.MILLISECONDS.sleep((400));
				System.out.println("You already own this.");
				TimeUnit.MILLISECONDS.sleep((400));
				System.out.println("Would you like to purchase this a house? y or n" );
				TimeUnit.MILLISECONDS.sleep((400));
				System.out.println("Its price is: $"+(Board.board.get(space).getPrice()/10));

				Scanner userInput = new Scanner (System.in);

				String userbuy = userInput.nextLine();

				if (userbuy.equals("y") || userbuy.equals("Y"))
				{
					Player.p.setMoney(Player.p.getMoney()-(Board.board.get(space).getPrice()/10));
					Board.board.get(space).setRent((Board.board.get(space).getRent()) + (Board.board.get(space).getRent()/2));
					TimeUnit.MILLISECONDS.sleep((400));
					System.out.println("You now own a house on this.");
					TimeUnit.MILLISECONDS.sleep((400));
					System.out.println("its rent is now: $" + Board.board.get(space).getRent());

					Board.board.get(space).setHouse(Board.board.get(space).getHouse()+1);
					TimeUnit.MILLISECONDS.sleep((400));
					System.out.println("New House information: ");}
				for(int i=0; i<=39; i++)
				{
					if(Board.board.get(i).getHouse()!=0)
					{
						System.out.println(Board.board.get(i).getHouse() + " houses on " + Board.board.get(i).getName());
						TimeUnit.MILLISECONDS.sleep((200));
					}
				}
				System.out.println();
				TimeUnit.MILLISECONDS.sleep((400));

			}
			else
			{
				
			}
		}
		System.out.println("Your account balance is 0, Thanks for playing.");
	}
}


























