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
	}
	
	public void DisplayMenu() {
		System.out.println("Welcome To The VideoGameCollection Interface Program!");
		System.out.println("You are currently managing the collection: " + this.collection.getName() + ".");
		System.out.println("Please make a valid selection from the list of options below: ");
		System.out.println("\n-----------------------------------------\n");
		System.out.println("'A' - Add new game to collection.");
		System.out.println("'D' - Delete a game from the collection.");
		System.out.println("'P' - View a table of all games in the collection.");
		System.out.println("'S' - Search the collection for a specific game.");
		System.out.println("'Q' - Quit the program.");
	}
	
	public void AcceptUserInput() {
		boolean validInput = false;
		while (!validInput) {
			System.out.print("Selection: ");
			String userInput = this.input.nextLine();
			
			if (this.validSelections.contains(userInput.toUpperCase())) {
				this.selection = userInput;
				validInput = true;
			} else {
				System.out.println("Please enter a valid selection.");
			}
		}
	}
	
	public void ProcessUserInput() {
		switch (this.selection) {
		case "A":
			//add a game method
			break;
		case "D":
			//delete a game
			break;
		case "P":
			//print table of games
			break;
		case "S":
			//search for a game
			break;
		case "Q":
			//quit game
			break;
		default:
			System.out.println("*FATAL ERROR WHILE PROCESSING USER INPUT*");
			break;
		}
	}
	
	public void RunUntilClose() {
		this.selection = "x";
		while (!this.selection.equals("Q")) {
			this.DisplayMenu();
			this.AcceptUserInput();
			this.ProcessUserInput();
		}
		System.out.println("\nThank you for using the program.");
		System.out.println("\nExiting now...");
	}
	
}
