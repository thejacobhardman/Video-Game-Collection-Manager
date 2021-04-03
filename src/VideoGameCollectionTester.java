/**********************************************************************
*               Assignment 7 -- Video Game Collection Tester          *
*                                                                     *
* PROGRAMMER:        Jacob Hardman - hard7293@bears.unco.edu          *
* CLASS:             CS200 – Object Oriented Programming              *
* INSTRUCTOR:        Dean Zeller                                      *
* TERM:              Spring 2021                                      *
* SUBMISSION DATE:   4/2/2021                            		      *
*                                                                     *
* DESCRIPTION:                                                        *
* The following is a tester for the VideoGameCollection object.       *
*                                                                     *
* COPYRIGHT:                                                          *
* This program is copyright (c)2020 Jacob Hardman and Dean Zeller.    *
* Based on a template written by Tom Jensen and Dean Zeller.          *
* It is original work without use of outside sources.                 *
*                                                                     *
**********************************************************************/

public class VideoGameCollectionTester 
{
    
    public static void main(String[] args) 
    {
    	// Load Initial Collection, hardcoded for now
    	VideoGameCollection collection1 = new VideoGameCollection("First Person Shooter Games");
    	VideoGame game1 = new VideoGame("Halo: Combat Evolved",
										2001,
										"First Person Shooter",
										"Bungie",
										"Microsoft",
										59.99,
										false,
										1);
    	VideoGame game2 = new VideoGame("Insurgency",
                						2014,
                						"First Person Shooter",
                						"New World Interactive",
                						19.99,
                						false,
                						1);
    	collection1.addGame(game1);
    	collection1.addGame(game2);
    	
    	collection1.printCollection();
    	
    	// Make changes through get and set methods
    	collection1.getGame(0).setTitle("I changed the game name! Haha!");
    	collection1.getGame(1).setDeveloper("Jacob Hardman made this game");
    	collection1.printCollection();
    }
}
