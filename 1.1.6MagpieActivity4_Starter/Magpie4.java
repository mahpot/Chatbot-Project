/**
 * A program to carry on conversations with a human user.
 * This version:
 *<ul><li>
 * 		Uses advanced search for keywords 
 *</li><li>
 * 		Will transform statements as well as react to keywords
 *</li></ul>
 * @author Laurie White
 * @version April 2012
 *
 */
public class Magpie4
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */	
  //test
  int count = 1;
  public int parseInput(String userInput){
    int curr =0;
    if (findKeyword(userInput, "hello") >= 0|| findKeyword(userInput, "hey") >= 0|| findKeyword(userInput, "name") >= 0|| findKeyword(userInput, "hi") >= 0|| findKeyword(userInput, "how are you") >= 0){
      curr = 1;
    }
    else if(findKeyword(userInput, "bored") >= 0|| findKeyword(userInput, "pickup") >= 0|| findKeyword(userInput, "funny") >= 0|| findKeyword(userInput, "flirt") >= 0|| findKeyword(userInput, "sunny") >= 0|| findKeyword(userInput, "rainy") >= 0|| findKeyword(userInput, "windy") >= 0|| findKeyword(userInput, "cloudy") >= 0|| findKeyword(userInput, "hot") >= 0|| findKeyword(userInput, "cold") >= 0|| findKeyword(userInput, "mom") >= 0|| findKeyword(userInput, "dad") >= 0|| findKeyword(userInput, "cat") >= 0|| findKeyword(userInput, "dog") >= 0|| findKeyword(userInput, "hamster") >= 0|| findKeyword(userInput, "bunny") >= 0||findKeyword(userInput, "rabbit") >= 0|| findKeyword(userInput, "pet") >= 0 || findKeyword(userInput, "fish") >= 0|| findKeyword(userInput, "favorite") >= 0|| findKeyword(userInput, "no") >= 0|| findKeyword(userInput, "help me") >= 0|| findKeyword(userInput, "thank") >= 0|| findKeyword(userInput, "please") >= 0|| findKeyword(userInput, "love") >= 0|| findKeyword(userInput, "like") >= 0|| findKeyword(userInput, "stupid") >= 0|| findKeyword(userInput, "suck") >= 0|| findKeyword(userInput, "dumb") >= 0){
      curr = 2;
    }
    else{
      curr = 3;
    }
    return curr;
  }
	public String getGreeting()
	{
		return "Hello there! If you need help at any point, just say 'help me'. I look forward to our conversation! Type bye to exit.";
	}
  

  public String casualIntro(String statement){
    String response = "";
    if (findKeyword(statement, "hello") >= 0){
      response = "Hi there! I'm Beartha. What's your name? How are you?";
    }
    else if (findKeyword(statement, "hi") >= 0
				|| findKeyword(statement, "hey") >= 0){
      response = "Hello! I'm Beartha. Nice to meet you! What's your name?";
    }

    else if (findKeyword(statement, "name") >= 0){
      response = "Nice to meet you! I'm Beartha. How's the weather?";
    }

    else if (findKeyword(statement, "how are you") >= 0
				|| findKeyword(statement, "it going") >= 0){
      response = "I'm quite well. How's the weather today?";    
    }
    
    else if (findKeyword(statement, "bot") >= 0 || findKeyword(statement, "real ") >= 0){
			response = "I am a chatbot here to keep you company.";
		}

    else {
      randomConvo(statement);
    }
    
    return response;
    
  }

  public String leadHuman(String statement){
    String response = "";
    if (findKeyword(statement, "bored")>=0|| findKeyword(statement, "funny")>= 0 || findKeyword(statement, "joke")>=0) {
      response = getRandomjoke();
    }
    
  else if (findKeyword(statement, "pickup")>=0|| findKeyword(statement, "flirt") >= 0){
      response = getRandomLine();
    }

    else if (findKeyword(statement, "sunny") >= 0){
			response = "Nice! Did you know sunny weather is perfect for animals like Painted turtles, Garter snakes, Marine iguanas, Blackbirds, African penguins, Hippopotami, Sea lions, and Meerkats?";
		}

    else if (findKeyword(statement, "rainy") >= 0){
			response = "Wow! Did you know rainy weather is perfect for animals like frogs, toads, lizards, slugs, snails, snakes, water buffalos, leeches, turtles, and Philippine eagles?";
		}

    else if (findKeyword(statement, "windy") >= 0){
			response = "Nice! Birds love the wind too....until they get extreme that is. Life is about balance.";
		}

    else if (findKeyword(statement, "cloudy") >= 0){
			response = "Ooooooh! The clouds are home to microbes and bacteria... and occasionally even fish!";
		}

    else if (findKeyword(statement, "hot") >= 0){
			response = "Ooooooh! Animals like camel, meerkats, lizards, tortoises, dibokalis, Jerboas, and ostriches thrive in heat. ";
		}

    else if (findKeyword(statement, "cold") >= 0 || findKeyword(statement, "chilly") >= 0|| findKeyword(statement, "snowy") >= 0){
			response = "BRRRRRR! Did you know extreme cold weather is perfect for animals like caribou, Arctic hares, Arctic ground squirrels, snowy owls, puffins, tundra swan, snow geese, Steller's eiders and willow ptarmigan.";
		}

		else if (findKeyword(statement, "mom") >= 0
				|| findKeyword(statement, "dad") >= 0
				|| findKeyword(statement, "sister") >= 0
				|| findKeyword(statement, "brother") >= 0){
			response = "Oh, cool! Do you have any pets?";
		} 

    else if (findKeyword(statement, "cat") >= 0
				|| findKeyword(statement, "dog") >= 0
				|| findKeyword(statement, "hamster") >= 0
				|| findKeyword(statement, "bunny") >= 0
        || findKeyword(statement, "rabbit") >= 0
				|| findKeyword(statement, "pet") >= 0 
        || findKeyword(statement, "fish") >= 0){
			response = "How cute! Fun fact: dogs have unique nose prints. Cats don't meow at each other. Goldfish can grow to be 43 years old. Hamsters' cheeks are bigger than you would think. Very interesting, I'm sure.";
		}

    else if (findKeyword(statement, "favorite") >= 0){
			response = "That’s my favorite too! We have so much in common! I also like animals. What’s your favorite animal?";
		}
   
		else if (statement.length() == 0){
			response = "Say something, please.";
		}

		else if (findKeyword(statement, "no") >= 0){
			response = "Why so negative?";
		}

    else if (findKeyword(statement, "help me") >= 0){
			response = "No problem! Just say 'bye' to exit. I'll miss you!";
		}

    else if (findKeyword(statement, "thank") >= 0){
			response = "You are most welcome";
		}

    else if (findKeyword(statement, "please") >= 0){
			response = "You are so kind. If you need help type 'help me'.";
		}

    else if (findKeyword(statement, "!") >= 0){
			response = "Is that a good thing or bad?";
		}

    else if (findKeyword(statement, "love") >= 0 || findKeyword(statement, "like") >= 0){
			response = "Woah! Just like I love animals. Animals are ameowzing";
		}

    else if (findKeyword(statement, "hate") >= 0 || findKeyword(statement, "stupid") >= 0 || findKeyword(statement, "suck") >= 0 || findKeyword(statement, "dumb") >= 0){
			response = "Hatred is a very negative emotion. Unfortunately, animal hatred is getting increasingly common. Animal cruelty includes intentional, malicious acts of animal abuse and less clear-cut situations where the needs of an animal are neglected. Violence against animals has been linked to a higher likelihood of criminal violence and domestic abuse. We must fight to combat this issue.";
		}

    else {
      randomConvo(statement);
    }
    return response;
    
  }

  public String randomConvo(String statement){
    final int NUMBER_OF_RESPONSES = 8;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "I don’t know what you mean. Let’s talk about animals instead. Do you like land, sea, or aerial animals? ";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}
    else if (whichResponse == 5)
		{
			response = "I'm not quite sure I understand";
		}
    else if (whichResponse == 5)
		{
			response = "Cool!";
		}
    else if (whichResponse == 6)
		{
			response = "Oh, really?";
    }
    return response;
  }

  public String plainClarification(String statement){
    final int NUMBER_OF_RESPONSES = 2;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
    String response = "";
    
    if (whichResponse == 0)
		{
			response = "Can you clarify what you meant by '" + statement + "'";
		}
    else if (whichResponse == 1)
		{
      String resp = "What does '" + statement + "' mean?";
			response = resp;
		}

    else {
      randomConvo(statement);
    }
    
		return response;
  }

  public String rewriteClarification(String statement){
    final int NUMBER_OF_RESPONSES = 2;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
    String response = "";
    
    if (whichResponse == 0)
		{
			response = transformIWantToStatement(statement);
		}
    else if (whichResponse == 1)
		{
      response = transformYouMeStatement(statement);
		}

    else {
      randomConvo(statement);
    }
    
		return response;
  }


  public String Clarification(String statement){
    final int NUMBER_OF_RESPONSES = 2;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
    String response = "";

    if (whichResponse == 0){
      response = plainClarification(statement);
    }
    else if (whichResponse == 1) {
      response = rewriteClarification(statement);
    }
    else {
      response = randomConvo(statement);
    }
    return response;
  }


	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
  
		// Responses which require transformations
		if (findKeyword(statement, "I want to", 0) >= 0)
		{
			response = transformIWantToStatement(statement);
		}

		else
		{
			// Look for a two word (you <something> me)
			// pattern
			int psn = findKeyword(statement, "you", 0);

			if (psn >= 0
					&& findKeyword(statement, "me", psn) >= 0)
			{
				response = transformYouMeStatement(statement);
			}
			else
			{
				response = randomConvo(statement);
			}
		}
		return response;
	}
	
	/**
	 * Take a statement with "I want to <something>." and transform it into 
	 * "What would it mean to <something>?"
	 * @param statement the user statement, assumed to contain "I want to"
	 * @return the transformed statement
	 */
	private String transformIWantToStatement(String statement)
	{
		//  Remove the final period, if there is one
		statement = statement.trim();
		String lastChar = statement.substring(statement
				.length() - 1);
		if (lastChar.equals("."))
		{
			statement = statement.substring(0, statement
					.length() - 1);
		}
		int psn = findKeyword (statement, "I want to", 0);
		return "What would it mean to " + psn + "?";
	}

	
	
	/**
	 * Take a statement with "you <something> me" and transform it into 
	 * "What makes you think that I <something> you?"
	 * @param statement the user statement, assumed to contain "you" followed by "me"
	 * @return the transformed statement
	 */
	private String transformYouMeStatement(String statement)
	{
		//  Remove the final period, if there is one
		statement = statement.trim();
		String lastChar = statement.substring(statement
				.length() - 1);
		if (lastChar.equals("."))
		{
			statement = statement.substring(0, statement
					.length() - 1);
		}
		
		int psnOfYou = findKeyword (statement, "you", 0);
		int psnOfMe = findKeyword (statement, "me", psnOfYou + 3);
		
		String restOfStatement = statement.substring(psnOfYou + 3, psnOfMe).trim();
		return "What makes you think that I " + restOfStatement + " you?";
	}
	
	
  
	
	
	/**
	 * Search for one word in phrase.  The search is not case sensitive.
	 * This method will check that the given goal is not a substring of a longer string
	 * (so, for example, "I know" does not contain "no").  
	 * @param statement the string to search
	 * @param goal the string to search for
	 * @param startPos the character of the string to begin the search at
	 * @return the index of the first occurrence of goal in statement or -1 if it's not found
	 */
	private int findKeyword(String statement, String goal, int startPos)
	{
		String phrase = statement.trim();
		//  The only change to incorporate the startPos is in the line below
		int psn = phrase.toLowerCase().indexOf(goal.toLowerCase(), startPos);
		
		//  Refinement--make sure the goal isn't part of a word 
		while (psn >= 0) 
		{
			//  Find the string of length 1 before and after the word
			String before = " ", after = " "; 
			if (psn > 0)
			{
				before = phrase.substring (psn - 1, psn).toLowerCase();
			}
			if (psn + goal.length() < phrase.length())
			{
				after = phrase.substring(psn + goal.length(), psn + goal.length() + 1).toLowerCase();
			}
			
			//  If before and after aren't letters, we've found the word
			if (((before.compareTo ("a") < 0 ) || (before.compareTo("z") > 0))  //  before is not a letter
					&& ((after.compareTo ("a") < 0 ) || (after.compareTo("z") > 0)))
			{
				return psn;
			}
			
			//  The last position didn't work, so let's find the next, if there is one.
			psn = phrase.indexOf(goal.toLowerCase(), psn + 1);
			
		}
		
		return -1;
	}
	
	/**
	 * Search for one word in phrase.  The search is not case sensitive.
	 * This method will check that the given goal is not a substring of a longer string
	 * (so, for example, "I know" does not contain "no").  The search begins at the beginning of the string.  
	 * @param statement the string to search
	 * @param goal the string to search for
	 * @return the index of the first occurrence of goal in statement or -1 if it's not found
	 */
	private int findKeyword(String statement, String goal)
	{
		return findKeyword (statement, goal, 0);
	}
	

  private String getRandomjoke()
	{
		final int NUMBER_OF_RESPONSES = 7;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "What do you give a sick bird? A tweetment.";
		}
		else if (whichResponse == 1)
		{
			response = "What do cats have for breakfast? Mice Crispies!";
		}
		else if (whichResponse == 2)
		{
			response = "What do you get from a pampered cow? Spoiled milk!";
		}
		else if (whichResponse == 3)
		{
			response = "What did the buffalo say to his son when he left for college? Bison!";
		}
    else if (whichResponse == 5)
		{
			response = "How much money does a skunk have? One scent!";
		}
    else if (whichResponse == 5)
		{
			response = "What did the leopard say after finishing a delicious meal? That hit the spot!";
		}
    else if (whichResponse == 6)
		{
			response = "Where do polar bears vote? The North Poll.";
		}

		return response;
	}
	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
  
  private String getRandomLine()
	{
		final int NUMBER_OF_RESPONSES = 7;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Are you a cat because you’re purrfect.";
		}
		else if (whichResponse == 1)
		{
			response = "Are you a unicorn cause you are my fantasy.";
		}
		else if (whichResponse == 2)
		{
			response = "If I were a cat, I'd spend all 9 lives with you.";
		}
		else if (whichResponse == 3)
		{
			response = "Girl, if you were a dinosaur, you'd be a Gorgeousaurus.";
		}
    else if (whichResponse == 5)
		{
			response = "Aren't you tired? Because you've been galloping through my mind all evening.";
		}
    else if (whichResponse == 5)
		{
			response = "are you on the endangered species list? 'Cause you are one of a kind!";
		}
    else if (whichResponse == 6)
		{
			response = "Wanna go on a picnic? Alpaca lunch.";
		}

		return response;
	}

}


