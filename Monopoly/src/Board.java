import java.util.ArrayList;

public class Board
{
	static ArrayList<prop>board=new ArrayList <prop>();
	
	public static void spotspace (String ss)
	{
		if (ss.equals("1"))
		{
			board.add(new prop(1,"Mediterranean Avenue", 60, "purple", 2, "none", 1, 0));
			board.add(new prop(2,"You inherit $100", -100, "none", 0, "none", 0, 0));			
			board.add(new prop(3,"Baltic Avenue", 60, "purple", 4, "none", 1, 0));
			board.add(new prop(4,"Income Tax", 25, "none", 0, "none", 0, 0));
			board.add(new prop(5,"Reading Railroad", 200, "none", 25, "none", 0, 0));
			board.add(new prop(6,"Oriental Avenue", 100, "baby blue", 6, "none", 1, 0));
			board.add(new prop(7,"Your Building and loan matures, collect $150", -150, "none", 0, "none", 0, 0));			
			board.add(new prop(8,"Vermont Avenue", 100, "baby blue", 6, "none", 1, 0));
			board.add(new prop(9,"Connecticut Avenue", 120, "baby blue", 8, "none", 1, 0));
			board.add(new prop(10,"In Jail", 0, "none", 0, "none", 0, 0));
			board.add(new prop(11,"St. Charles Place", 140, "pink", 10, "none", 1, 0));
			board.add(new prop(12,"Electric Company", 150, "none", 10, "none", 0, 0));
			board.add(new prop(13,"States Avenue", 140, "pink", 10, "none", 1, 0));
			board.add(new prop(14,"Virginia Avenue", 160, "pink", 12, "none", 1, 0));
			board.add(new prop(15,"Pennsylvania Road", 200, "none", 25, "none", 0, 0));
			board.add(new prop(16,"St. James Place", 180, "orange", 14, "none", 0, 0));
			board.add(new prop(17,"Pay school Tax of $150", 150, "none", 0, "none", 0, 0));			
			board.add(new prop(18,"Tennessee Avenue", 180, "orange", 14, "none", 0, 0));
			board.add(new prop(19,"New York Avenue", 200, "orange", 16, "none", 0, 0));
			board.add(new prop(20,"Free Parking", 0, "none", 0, "none", 0, 0));
			board.add(new prop(21,"Kentucky Avenue", 220, "red", 18, "none", 0, 0));
			board.add(new prop(22,"Pay poor tax of $15", 15, "none", 0, "none", 0, 0));			
			board.add(new prop(23,"Indiana Avenue", 220, "red", 18, "none", 0, 0));
			board.add(new prop(24,"Illinois Avenue", 240, "red", 20, "none", 0, 0));
			board.add(new prop(25,"B & O Railroad", 200, "none", 25, "none", 0, 0));
			board.add(new prop(26,"Atlantic Avenue", 260, "yellow", 22, "none", 0, 0));
			board.add(new prop(27,"Ventnor Avenue", 260, "yellow", 22, "none", 0, 0));
			board.add(new prop(28,"Water Works", 150, "none", 10, "none", 0, 0));
			board.add(new prop(29,"Marvin Gardens", 280, "yellow", 24, "none", 0, 0));
			board.add(new prop(30,"Go To Jail", 0, "none", 0, "none", 0, 0));
			board.add(new prop(31,"Pacific Avenue", 300, "green", 26, "none", 0, 0));		
			board.add(new prop(32,"North Carolina Avenue", 300, "green", 32, "none", 0, 0));
			board.add(new prop(33,"Life insurance Matures, collect $100", -100, "none", 0,"none", 0, 0));			
			board.add(new prop(34,"Pennsylvania Avenue", 320, "green", 28, "none", 0, 0));
			board.add(new prop(35,"Short Line", 200, "none", 25, "none", 0, 0));
			board.add(new prop(36,"Bank pays you a dividend of $50", -50, "none", 0, "none", 0, 0));			
			board.add(new prop(37,"Park Place", 350, "blue", 35, "none", 0, 0));
			board.add(new prop(38,"Luxury Tax", 100, "none", 0, "none", 0, 0));
			board.add(new prop(39,"Boardwalk", 400, "blue", 50, "none", 0, 0));
			board.add(new prop(40,"Collect $200", 0, "none", 0, "none", 0, 0));
			
		}
		if (ss.equals("DEAD"))

		{
			board.add(new prop(1,"Atlanta Survivors camp", 60, "purple", 2, "none", 0, 0));
			board.add(new prop(2,"Found a supply chest, collect the $100 woth of supplies", -100, "none", 0, "none", 0, 0));
			board.add(new prop(3,"Downtown Atlanta", 60, "purple", 4, "none", 0, 0));
			board.add(new prop(4,"Tax for Protection, must pay $25", 25, "none", 0, "none", 0, 0));
			board.add(new prop(5,"Horse", 200, "none", 25, "none", 0, 0));
			board.add(new prop(6,"Rick's Neighborhood", 100, "baby blue", 6, "none", 0, 0));
			board.add(new prop(7,"Scavenging gets you $150 worth of supplies", -150, "none", 0, "none", 0, 0));
			board.add(new prop(8,"Harrison Memorial Hospital", 100, "baby blue", 6, "none", 0, 0));
			board.add(new prop(9,"Cynthiana Police Department", 120, "baby blue", 8, "none", 0, 0));
			board.add(new prop(10,"In Jail", 0, "none", 0, "none", 0, 0));
			board.add(new prop(11,"Prison Courtyard", 140, "pink", 10, "none", 0, 0));
			board.add(new prop(12,"Battery", 150, "none", 10, "none", 0, 0));
			board.add(new prop(13,"Cell Block 'A'", 140, "pink", 10, "none", 0, 0));
			board.add(new prop(14,"Cell Block 'C", 160, "pink", 12, "none", 0, 0));
			board.add(new prop(15,"Motorcycle", 200, "none", 25, "none", 0, 0));
			board.add(new prop(16,"Wiltshire Estates", 180, "orange", 14, "none", 0, 0));
			board.add(new prop(17,"Your camp was robbed of $150", 150, "none", 0, "none", 0, 0));
			board.add(new prop(18,"Greene Family Barn", 180, "orange", 14, "none", 0, 0));
			board.add(new prop(19,"Greene Family Farmhouse", 200, "orange", 16, "none", 0, 0));
			board.add(new prop(20,"Free Parking", 0, "none", 0, "none", 0, 0));
			board.add(new prop(21,"Woodbury Hospital", 220, "red", 18, "none", 0, 0));
			board.add(new prop(22,"Scavenging found nothing, but lost $15 in gas", 15, "none", 0, "none", 0, 0));
			board.add(new prop(23,"Woodbury Fight Arena", 220, "red", 18, "none", 0, 0));
			board.add(new prop(24,"Downtown Woodbury", 240, "red", 20, "none", 0, 0));
			board.add(new prop(25,"R.V", 200, "none", 25, "none", 0, 0));
			board.add(new prop(26,"National Guard Station", 260, "yellow", 22, "none", 0, 0));
			board.add(new prop(27,"Father Gabriel's Church", 260, "yellow", 22, "none", 0, 0));
			board.add(new prop(28,"Water", 150, "none", 10, "none", 0, 0));
			board.add(new prop(29,"The Hunter's Base", 280, "yellow", 24, "none", 0, 0));
			board.add(new prop(30,"Go to Jail", 0, "none", 0, "none", 0, 0));
			board.add(new prop(31,"Downtown Washington D.C", 300, "green", 26, "none", 0, 0));		
			board.add(new prop(32,"Sanctuary", 300, "green", 32, "none", 0, 0));
			board.add(new prop(33,"Found a crate with $100 worth of guns", -100, "none", 0, "none", 0, 0));
			board.add(new prop(34,"The Kingdom", 320, "green", 28, "none", 0, 0));
			board.add(new prop(35,"Truck", 200, "none", 25, "none", 0, 0));
			board.add(new prop(36,"A nearby group gives you $50 in supplies", -50, "none", 0, "none", 0, 0));
			board.add(new prop(37,"The Hilltop Colony", 350, "blue", 35, "none", 0, 0));
			board.add(new prop(38,"Herd Attack destroys $100 worth of supplies", 100, "none", 0, "none", 0, 0));
			board.add(new prop(39,"Alexandria Safe Zone", 400, "blue", 50, "none", 0, 0));
			board.add(new prop(40,"Collect $200", 0, "none", 0, "none", 0, 0));
			
		}
		if (ss.equals("3"))
		{
			board.add(new prop(1,"", 60, "purple", 2, "none", 1, 0));
			board.add(new prop(2,"You inherit $100", -100, "none", 0, "none", 0, 0));
			board.add(new prop(3,"", 60, "purple", 4, "none", 1, 0));
			board.add(new prop(4,"Income Tax of $25", 25, "none", 0, "none", 0, 0));
			board.add(new prop(5,"", 200, "none", 25, "none", 0, 0));
			board.add(new prop(6,"", 100, "baby blue", 6, "none", 1, 0));
			board.add(new prop(7,"Your Building and loan matures, collect $150", -150, "none", 0, "none", 0, 0));
			board.add(new prop(8,"", 100, "baby blue", 6, "none", 1, 0));
			board.add(new prop(9,"", 120, "baby blue", 8, "none", 1, 0));
			board.add(new prop(10,"In Jail", 0, "none", 0, "none", 0, 0));
			board.add(new prop(11,"", 140, "pink", 10, "none", 1, 0));
			board.add(new prop(12,"", 150, "none", 10, "none", 0, 0));
			board.add(new prop(13,"", 140, "pink", 10, "none", 1, 0));
			board.add(new prop(14,"", 160, "pink", 12, "none", 1, 0));
			board.add(new prop(15,"", 200, "none", 25, "none", 0, 0));
			board.add(new prop(16," ", 180, "orange", 14, "none", 0, 0));
			board.add(new prop(17,"Pay school Tax of $150", 150, "none", 0, "none", 0, 0));
			board.add(new prop(18,"", 180, "orange", 14, "none", 0, 0));
			board.add(new prop(19,"", 200, "orange", 16, "none", 0, 0));
			board.add(new prop(20,"Free Parking", 0, "none", 0, "none", 0, 0));
			board.add(new prop(21,"", 220, "red", 18, "none", 0, 0));
			board.add(new prop(22,"Pay poor tax of $15", 15, "none", 0, "none", 0, 0));
			board.add(new prop(23,"", 220, "red", 18, "none", 0, 0));
			board.add(new prop(24,"", 240, "red", 20, "none", 0, 0));
			board.add(new prop(25,"", 200, "none", 25, "none", 0, 0));
			board.add(new prop(26,"", 260, "yellow", 22, "none", 0, 0));
			board.add(new prop(27,"", 260, "yellow", 22, "none", 0, 0));
			board.add(new prop(28,"", 150, "none", 10, "none", 0, 0));
			board.add(new prop(29,"", 280, "yellow", 24, "none", 0, 0));
			board.add(new prop(30,"Go to Jail", 0, "none", 0, "none", 0, 0));
			board.add(new prop(31,"", 300, "green", 26, "none", 0, 0));		
			board.add(new prop(32,"", 300, "green", 32, "none", 0, 0));
			board.add(new prop(33,"Life insurance Matures, collect $100", -100, "none", 0, "none", 0, 0));
			board.add(new prop(34,"", 320, "green", 28, "none", 0, 0));
			board.add(new prop(35,"", 200, "none", 25, "none", 0, 0));
			board.add(new prop(36,"Bank pays you a dividend of $50", -50, "none", 0, "none", 0, 0));
			board.add(new prop(37,"", 350, "blue", 35, "none", 0, 0));
			board.add(new prop(38,"Luxury Tax of $100", 100, "none", 0, "none", 0, 0));
			board.add(new prop(39,"", 400, "blue", 50, "none", 0, 0));
			board.add(new prop(40,"Collect $200", 0, "none", 0, "none", 0, 0));
		}
	}

	 
}