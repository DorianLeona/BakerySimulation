import java.util.*;
import java.io.*;

public class UI
{
	int users;
	List<Account> accounts;
	List<String> emails;
	List<String> phones;
	


	//Null Constructor//
	public UI()
	{
		this.users = 0;
		this.refreshAccountList();
	};


	//Main//
	public static void main(String[] Args)
	{
		UI bakery = new UI;
		bakery.identifyUser();



	};


	//Obtain a username/clockID and verify that it exists in the system//
	public String[] identifyUser()
	{	
		boolean keepTrying = true;
		int fails = 0;
		String nextStep;
		String[] loginStats = new String[2];


		System.out.println("\n --- Bella's Blue-Ribbon Bakery ---\n\n");

		while(keepTrying == true && fails < 5)
		{
			//Login will be in 1 of 3 acceptable formats: email, phone, or clockNum//
			System.out.println("Enter your email address, phone number, or clockID: \n");
			System.out.println("Enter x to exit the program.\n\n");
			
			Scanner input = new Scanner(System.in);
			String loginString = input.nextLine();
			
			//Path A: user input was exit code x//
			if(loginString == "x")
			{
				keepTrying = false;
				userStats[0] = "none";
				userStats[1] = "none";
			}

			//Path B: user input was NOT exit code x//		
			else
			{
				String loginStats = this.formatLoginForSeach(loginString);

				//Make sure the login is an acceptable form//
				if(loginStats[0] == "none")
				{
					fails++;
					triesLeft = 5 - fails;

					System.out.println("Invalid login format. The acceptable formats are the following: \n");
					System.out.println("	- Email 	(ex. JaneDoe@gmail.com)\n");
					System.out.println("	- Phone 	(ex. 000-000-0000)\n");
					System.out.println("	- clockID\n\n");

					System.out.printf("You have %d tries left.\nPlease try again.\n", triesLeft);
				}
				else
				{
					nextStep = tryLogin(loginStats);

					//Follow next steps//
					if(nextStep == "try again")
					{
						//Password error message was given in tryLogin() already//
						//Send the user through the login loop again//
						fails++;
					}
					else if(nextStep == "allow entrance")
					{
						userStats = loginStats;
					}
					else
					{
						System.out.println("Something has gone terribly terribly wrong somewhere in the password verification method of UI...\n\n");
					}
				}
					
				return userStats;
	};


	//Ensure the given login is formatted in a searchable way, and determine the user's role//
	public String[] formatLoginForSearch(String loginString)
	{
		char currentChar;
		String format;
		String searchableLogin = loginString;
		String[] loginStats = new String[2];

		int index;
		int position;
		int[] digits = new int[10];
                
		//Initialize int digits[10] to an array of -1//
                Arrays.fill(digits, 0);
                
		
		if(loginString.contains("@") == true)
                        {
                                format = "email";
                        }
		else
		{
			for(int position = 0; position < loginString.size(); position++)
			{
				currentChar = loginString.charAt(position);

				if(currentChar > 47 && currentChar < 48)
				{
					digitCount++
					digts[index] = currentChar;
					index++;
				}
			}

			if(digitCount == 10)
			{
				format = "phone";
				searchableLogin = String.valueOf(digits);
			}
			else if(digitCount == 3);
			{
				format = "clock";
			}
			else
			{
				format = "none";
			}
		}

		
		loginStats[0] = format;
		loginStats[1] = searchableLogin;

		return loginStats;
	};



	




}
//End class//
