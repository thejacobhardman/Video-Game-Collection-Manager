/**********************************************************************
*                  Assignment 8 -- Video Game Tester                  *
*                                                                     *
* PROGRAMMER:        Jacob Hardman - hard7293@bears.unco.edu          *
* CLASS:             CS200 – Object Oriented Programming              *
* INSTRUCTOR:        Dean Zeller                                      *
* TERM:              Spring 2021                                      *
* SUBMISSION DATE:   4/9/2021		                                  *
*                                                                     *
* DESCRIPTION:                                                        *
* The following is tester for the VideoGame object.                   *
*                                                                     *
* COPYRIGHT:                                                          *
* This program is copyright (c)2020 Jacob Hardman and Dean Zeller.    *
* Based on a template written by Tom Jensen and Dean Zeller.          *
* It is original work without use of outside sources.                 *
*                                                                     *
**********************************************************************/

public class VideoGameTester 
{
    public static void main(String[] args) 
    {   
    	VideoGame game1 = new VideoGame("Halo: Combat Evolved",
    									2001,
    									"First Person Shooter",
    									"Bungie",
    									"Microsoft",
    									59.99,
    									false,
    									1);
    	
    	VideoGame game2 = new VideoGame("Subnautica",
    								    2019,
    								    "Survival",
    								    "Unknown Worlds Entertainment",
    								    29.99,
    								    1);
    	
    	VideoGame game3 = new VideoGame("Insurgency",
    			                        2014,
    			                        "First Person Shooter",
    			                        "New World Interactive",
    			                        19.99,
    			                        false,
    			                        1);
     
        // Summary info
        System.out.println("My Video Games:");
        System.out.println(" - " + game1.description());
        System.out.println(" - " + game2.description());
        System.out.println(" - " + game3.description());
        System.out.println("--------------------------------------");
        
        // Full info
        System.out.println("\nDetailed information:\n");
        System.out.println(game1.toString());
        System.out.println(game2.toString());
        System.out.println(game3.toString());
        
        // Change Info 
        game1.setDeveloper("343 Industries");
        game2.setReleasePrice(19.99);
        game2.setGenre("Survival Horror");
        game3.setPublisher("Microsoft");
        game3.setGenre("Military Simulation");
        
        // Full info, reflecting changes
        System.out.println("\nDetailed information, with changes:\n");
        System.out.println(game1.toString());
        System.out.println(game2.toString());
        System.out.println(game3.toString());
    }
}
