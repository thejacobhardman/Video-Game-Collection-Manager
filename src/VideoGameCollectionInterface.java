/**********************************************************************
*           Assignment 8 -- Video Game Collection Interface           *
*                                                                     *
* PROGRAMMER:        Jacob Hardman - hard7293@bears.unco.edu          *
* CLASS:             CS200 – Object Oriented Programming              *
* INSTRUCTOR:        Dean Zeller                                      *
* TERM:              Spring 2021                                      *
* SUBMISSION DATE:   4/9/2021		                                  *
*                                                                     *
* DESCRIPTION:                                                        *
* This is a text-based interface meant to allow the user to interact  *
* and manage a VideoGameCollection object, and the VideoGame objects  *
* stored inside.                                                      *
*                                                                     *
* ATTRIBUTES:                                                         *
* 	validSelections -- The list of valid inputs that the user can     *
* 					   can select from the menu.                      *
* 	selection -- The user's input stored as a String.		          *
*   input -- The scanner property that will be used to accept         *
*            input from the user.                                     *
*   collection -- The VideoGameCollection object that interface       *
*   			  interacts with and manages.                         *
*   isRunning -- Tracks whether the interface is still running.       *
*                                                                     *
* COPYRIGHT:                                                          *
* This program is copyright (c)2020 Jacob Hardman and Dean Zeller.    *
* Based on a template written by Tom Jensen and Dean Zeller.          *
* It is original work without use of outside sources.                 *
*                                                                     *
**********************************************************************/

import java.util.ArrayList;
import java.util.Scanner;

public class VideoGameCollectionInterface {
	
	private ArrayList<String> validSelections;    
	private String selection;    
	private Scanner input;
	private VideoGameCollection collection;
	private boolean isRunning;
	
	/************************************************************************
	 * Method:   Constructor (no parameters)                                *
	 * Purpose:  Create an instance of a new interface with default         *
	 * 	         parameters.                                                *
	 * Parameters: None                                                     *
	 * Return value: None                                                   *
	 ***********************************************************************/
	public VideoGameCollectionInterface() {
		this.input = new Scanner(System.in);
		this.validSelections = new ArrayList<String>();
		validSelections.add("A");
		validSelections.add("D");
		validSelections.add("P");
		validSelections.add("S");
		validSelections.add("Q");
		this.selection = "x";
		this.collection = new VideoGameCollection("My Favorite Games");
		VideoGame game1 = new VideoGame("Halo: Combat Evolved",
										2001,
										"First Person Shooter",
										"Bungie",
										"Microsoft",
										59.99,
										false,
										1);
		VideoGame game2 = new VideoGame("Age Of Empires 2",
										1999,
										"Real Time Strategy",
										"Forgotten Empires",
										29.99,
										false,
										1);
		VideoGame game3 = new VideoGame("DOOM",
										2016,
										"First Person Shooter",
										"Id Software",
										"Bethesda Gameworks",
										59.99,
										false,
										1);
		VideoGame game4 = new VideoGame("Rust",
										2012,
										"Survival",
										"Indie",
										19.99,
										true,
										1);
		VideoGame game5 = new VideoGame("Battlefield 1942",
										2001,
										"First Person Shooter",
										"DICE",
										"Electronic Arts",
										59.99,
										false,
										1);
		this.collection.addGame(game1);
		this.collection.addGame(game2);
		this.collection.addGame(game3);
		this.collection.addGame(game4);
		this.collection.addGame(game5);
		this.isRunning = true;
	}
	
	/************************************************************************
	 * Method: DisplayMenu                                                  *
	 * Purpose:  Displays the menu UI.                                      *
	 * Parameters: None                                                     *
	 * Return value: None                                                   *
	 ***********************************************************************/
	public void DisplayMenu() {
		System.out.println("Welcome To The Video Game Collection Interface Program!");
		System.out.println("You are currently managing the collection: " + this.collection.getName() + ".");
		System.out.println("Please make a valid selection from the list of options below: ");
		System.out.println("\n-----------------------------------------\n");
		System.out.println("'A' - Add new game to collection.");
		System.out.println("'D' - Delete a game from the collection.");
		System.out.println("'P' - View a table of all games in the collection.");
		System.out.println("'S' - Search the collection for a specific game.");
		System.out.println("'Q' - Quit the program.");
	}
	
	/************************************************************************
	 * Method: AcceptUserInput                                              *
	 * Purpose:  Handles accepting and validating user input from the       *
	 *           console.                                                   *
	 * Parameters: None                                                     *
	 * Return value: None                                                   *
	 ***********************************************************************/
	public void AcceptUserInput() {
		boolean validInput = false;
		while (!validInput) {
			System.out.print("\nSelection: ");
			String userInput = this.input.nextLine();
			
			if (this.validSelections.contains(userInput.toUpperCase())) {
				this.selection = userInput;
				validInput = true;
			} else {
				System.out.println("Please enter a valid selection.");
			}
		}
	}
	
	/************************************************************************
	 * Method: ProcessUserInput                                             *
	 * Purpose:  Logic that runs different functions based on the user      *
	 * 			 input collected in AcceptUserInput.                        *
	 * Parameters: None                                                     *
	 * Return value: None                                                   *
	 ***********************************************************************/
	public void ProcessUserInput() {
		switch (this.selection.toUpperCase()) {
		case "A":
			AddGame();
			break;
		case "D":
			DeleteGame();
			break;
		case "P":
			PrintCollection();
			break;
		case "S":
			SearchCollection();
			break;
		case "Q":
			this.isRunning = false;
			break;
		default:
			System.out.println("*FATAL ERROR WHILE PROCESSING USER INPUT*");
			break;
		}
	}
	
	/************************************************************************
	 * Method: AddGame                                                      *
	 * Purpose: Allows the user to add a new game to the collection,        *
	 * 			prompts collect the user's input to fill in the VideoGame   *
	 * 			object's parameters.                                        *
	 * Parameters: None                                                     *
	 * Return value: None                                                   *
	 ***********************************************************************/
	public void AddGame() {
		System.out.println("\n-----\n\nAdding a new game to the collection:");
		
		//title
		System.out.print("\nEnter the new game's title: ");
		String title = input.nextLine();
		
		//release year
		int releaseYear = 0;
		boolean validYear = false;
		while (!validYear) {
			System.out.print("\nEnter the new game's release year: ");
			String yearString = input.nextLine();
			
			try {
				releaseYear = Integer.parseInt(yearString);
				
				if (releaseYear > 0) {
					validYear = true;
				} else {
					System.out.println("Please enter a valid year.");
				}
			} catch (Exception e) {
				System.out.println("Please enter a valid year.");
			}
		}
		
		//genre
		System.out.print("\nPlease enter the new game's genre: ");
		String genre = input.nextLine();
		
		//developer
		System.out.print("\nPlease enter the new game's developer: ");
		String developer = input.nextLine();
		
		//publisher
		String publisher = "";
		boolean validInput = false;
		while (!validInput) {
			System.out.print("\nWas the new game self published? (Y/N): ");
			String answer = input.nextLine();
			
			if (answer.toUpperCase().equals("Y")) {
				publisher = developer;
				validInput = true;
			} else if (answer.toUpperCase().equals("N")) {
				System.out.print("\nPlease enter the game's puiblisher: ");
				publisher = input.nextLine();
				validInput = true;
			} else {
				System.out.println("Please enter a valid input.");
			}
		}
		
		//releasePrice
		double releasePrice = 0.0;
		boolean validPrice = false;
		while (!validPrice) {
			System.out.print("\nEnter the new game's price at release: ");
			String priceString = input.nextLine();
			
			try {
				releasePrice = Double.parseDouble(priceString);
				
				if (releasePrice > 0) {
					validPrice = true;
				}
			} catch (Exception e) {
				System.out.println("Please enter a valid price as a double. ($ is not required)");
			}
		}
		
		//isEarlyAccess
		boolean isEarlyAccess = false;
		validInput = false;
		while (!validInput) {
			System.out.print("\nIs the new game currently in a state of early access? (Y/N): ");
			String answer = input.nextLine();
			
			if (answer.toUpperCase().equals("Y")) {
				isEarlyAccess = true;
				validInput = true;
			} else if (answer.toUpperCase().equals("N")) {
				validInput = true;
			} else {
				System.out.println("Please enter a valid input.");
			}
		}
		
		VideoGame newGame = new VideoGame(title,
									      releaseYear,
									      genre,
									      developer,
									      publisher,
									      releasePrice,
									      isEarlyAccess,
									      1);
		
		collection.addGame(newGame);
		
		System.out.println("\n'" + newGame.getTitle() + "' has been added to the collection.\n\n-----\n");
	}
	
	/************************************************************************
	 * Method: DeleteGame                                                   *
	 * Purpose: Allows the user to remove a game from the collection.       *
	 * Parameters: None                                                     *
	 * Return value: None                                                   *
	 ***********************************************************************/
	public void DeleteGame() {
		ArrayList<VideoGame> gamesToDisplay = new ArrayList<VideoGame>();
		for (int i = 0; i < this.collection.getSize(); i++) {
			gamesToDisplay.add(this.collection.getGame(i));
		}
		PrintCollectionList(gamesToDisplay);
		
		int gameToDelete = 0;
		boolean validInput = false;
		while (!validInput) {
			System.out.print("Please select the index value of the game that you would like to remove: ");
			String index = input.nextLine();
			
			try {
				gameToDelete = Integer.parseInt(index);
				
				if (gameToDelete > 0 && gameToDelete < this.collection.getSize()) {
					validInput = true;
				} else {
					System.out.println("Please select a valid index value.");
				}
			} catch (Exception e) {
				System.out.println("Please enter a valid input.");
			}
		}
		
		gameToDelete--;
		
		System.out.println("\n'" + this.collection.getGame(gameToDelete).getTitle() + "' has been removed from the collection.");
		this.collection.DeleteGame(gameToDelete);
		System.out.println("\n-----\n");
	}
	
	/************************************************************************
	 * Method: PrintCollection                                              *
	 * Purpose:  Logic that allows the user to determine which style        *
	 * 			 they would like their collection printed out in.           *
	 * Parameters: None                                                     *
	 * Return value: None                                                   *
	 ***********************************************************************/
	public void PrintCollection() {
		System.out.println("\n-----\n");
		ArrayList<VideoGame> gamesToDisplay = new ArrayList<VideoGame>();
		for (int i = 0; i < this.collection.getSize(); i++) {
			gamesToDisplay.add(this.collection.getGame(i));
		}
		boolean validInput = false;
		while (!validInput) {
			System.out.print("Would you like to view the collection as a table or a list? (T/L): ");
			String answer = input.nextLine();
			
			if (answer.toUpperCase().equals("T")) {
				validInput = true;
				PrintCollectionTable();
			} else if (answer.toUpperCase().equals("L")) {
				validInput = true;
				PrintCollectionList(gamesToDisplay);
			} else {
				System.out.println("Please enter a valid selection.");
			}
		}
	}
	
	/************************************************************************
	 * Method: PrintCollectionTable                                         *
	 * Purpose: Prints out every game in the collection in a detailed       *
	 * 			manner with all VideoGame parameters included.              *
	 * Parameters: None                                                     *
	 * Return value: None                                                   *
	 ***********************************************************************/
	public void PrintCollectionTable() {
		System.out.println("\n-----\n");
		System.out.printf("%-25s%-25s%-25s%-25s%-25s%-25s%-25s%n", 
				          "Title:", "Release Year:", "Genre:", "Developer:",
				          "Publisher:", "Release Price:", "Early Access:");
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		for (int i = 0; i < this.collection.getSize(); i++) {
			VideoGame game = this.collection.getGame(i);
			System.out.printf("%-25s%-25d%-25s%-25s%-25s%-25s%-25s%n", 
			          game.getTitle(), game.getReleaseYear(), game.getGenre(), 
			          game.getDeveloper(), game.getPublisher(),
			          ("$" + game.getReleasePrice()).toString(), game.getIsEarlyAccess());
		}
		System.out.println("\n-----\n");
	}
	
	/************************************************************************
	 * Method: PrintCollectionTable                                         *
	 * Purpose: A concise way to print out the games in the collection      *
	 * 			with only the game's title and an index value included.     *
	 * Parameters: None                                                     *
	 * Return value: None                                                   *
	 ***********************************************************************/
	public void PrintCollectionList(ArrayList<VideoGame> gamesToDisplay) {
		System.out.println("\n-----\n");
		System.out.printf("%-10s%-10s%n", "Index:", "Title:");
		for (int i = 0; i < gamesToDisplay.size(); i++) {
			VideoGame game = gamesToDisplay.get(i);
			System.out.printf("%-10s%-10s%n", (" " + (i + 1) + ")").toString(), game.getTitle());
		}
		System.out.println("\n-----\n");
	}
	
	public void SearchCollection() {
		System.out.println("\n-----\n");
		System.out.print("Please enter the term that you would like to search your collection of games for: ");
		String searchParam = input.nextLine();
		
		ArrayList<VideoGame> gamesFound = this.collection.SearchGames(searchParam);
		
	    System.out.println("There were " + gamesFound.size() + " games found that match your search parameters.");
	    System.out.println("\n--------------------------------------------\n");
	    for (int i = 0; i < gamesFound.size(); i++)
	    {
	    	System.out.println((i+1)+": " + gamesFound.get(i).toString());
	    }
	    System.out.println("--------------------------------------------");
	    
	    System.out.println("\n-----\n");
	}
	
	/************************************************************************
	 * Method: RunUntilClose                                                *
	 * Purpose: Continues to run the interface (accept user input and       *
	 * 			display output) until the user decides to close the program.*
	 * Parameters: None                                                     *
	 * Return value: None                                                   *
	 ***********************************************************************/
	public void RunUntilClose() {
		this.selection = "x";
		while (this.isRunning) {
			this.DisplayMenu();
			this.AcceptUserInput();
			this.ProcessUserInput();
		}
		System.out.println("\nThank you for using the program.");
		System.out.println("\nExiting now...");
	}
	
}
