

	// Lab12avst.java     This is the student starting version.
	// This assignment pertains to some of the "Magpie" AP Lab Materials
	//***************************************************************************
	// The "Magpie" AP Lab is created for the College Board APCS
	// curriculum by Laurie White.
	// Leon Schram has altered some of the "Magpie" files to focus on 
	// specific CS topics as the "Magpie" Lab is integrated into the curriculum.

	 
	import java.util.ArrayList;
import java.util.Scanner;

	public class Lab12avst
	{
	   public static void main(String[] args)
	   {
	      MagpieLab12a maggie = new MagpieLab12a();

	      System.out.println (maggie.getGreeting());
	      Scanner in = new Scanner (System.in);
	      String statement = in.nextLine();

	      while (!statement.equals("Bye"))
	      {
	         System.out.println (maggie.getResponse(statement));
	         statement = in.nextLine();
	      }
	   }
	}


	class MagpieLab12a
	{
	   public String getGreeting()
	   {
	      return "Hello, let's talk.";
	   }

	   
	   public String getResponse(String statement)
	   {
	      String response = "";
	      if (statement.indexOf("no") >= 0)
	      {
	         response = "Why so negative?";
	      }
	      else if (statement.indexOf("mother") >= 0
	            || statement.indexOf("father") >= 0
	            || statement.indexOf("sister") >= 0
	            || statement.indexOf("brother") >= 0)
	      {
	        response = "Tell me more about your family.";
	      }
	      else
	      {
	         response = getRandomResponse();
	      }
	      return response;
	   }
	   
	   private String getRandomResponse()
	   {
	      final int NUMBER_OF_RESPONSES = 10;
	      double r = Math.random();
	      int k = (int)(r * NUMBER_OF_RESPONSES);
	      
	      String[] RandomResponse = new String[10];
	      RandomResponse[0]="I do not understand.";
	      RandomResponse[1]="Where are you from?";
	      RandomResponse[2]="What was that?";
	      RandomResponse[3]="How old are you?";
	      RandomResponse[4]="What  is your middle name?";
	      RandomResponse[5]="I like chocolate.";
	      RandomResponse[6]="42";
	      RandomResponse[7]="I do not like it in this box";
	      RandomResponse[8]="The voices are talking again...";
	      RandomResponse[9]="Look behind you ;)";
	      return RandomResponse[k];
	   }
	}


