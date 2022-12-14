import java.util.Scanner;

/**
 * A simple class to run the Magpie class.
 * @author Laurie White
 * @version April 2012
 */
public class MagpieRunner4
{

	/**
	 * Create a Magpie, give it user input, and print its replies.
	 */
  
	public static void main(String[] args)
	{
		Magpie4 maggie = new Magpie4();
		
		System.out.println (maggie.getGreeting());
		Scanner in = new Scanner (System.in);
		String state = in.nextLine().toLowerCase();
		int currentState= maggie.parseInput(state);
    // when you get the user input number, change Currstate to that number and then this switch statement should theoretically work
    switch (currentState) {
      case 1: 
       System.out.println(maggie.casualIntro(state));
      case 2: 
        System.out.println(maggie.leadHuman(state));
      case 3: 
        System.out.println(maggie.Clarification(state));
    }
		while (!state.equals("bye"))
		{
			System.out.println (maggie.getResponse(state));
			state = in.nextLine();
		}

    System.out.println("It was a pleasure talking to you. I'll miss you 'pig' time! Bye!");
	}

}
