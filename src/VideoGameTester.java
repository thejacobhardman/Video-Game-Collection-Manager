/**********************************************************************
*                  Assignment 7 -- Video Game Tester                  *
*                                                                     *
* PROGRAMMER:        Jacob Hardman - hard7293@bears.unco.edu          *
* CLASS:             CS200 – Object Oriented Programming              *
* INSTRUCTOR:        Dean Zeller                                      *
* TERM:              Spring 2021                                      *
* SUBMISSION DATE:   4/2/2021		                                  *
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
//    	private String title;
//        private int releaseYear;
//        private String genre;
//        private String developer;
//        private String publisher;
//        private double releasePrice;
//        private boolean isEarlyAccess;
//        private int numberInSeries;
        
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
    	
//        // Load initial collection (hardcoded for now)
//        ComicBook book1 = new ComicBook("Captain Marvel", 
//                                        1, 
//                                        "Kelly Sue DeConnick", 
//                                        "Scott Hepburn");
//        ComicBook book2 = book1.createNextInSeries();
//        ComicBook book3 = new ComicBook("Darth Vader", 
//                                        1,
//                                        "Kieron Gillen", 
//                                        "Salvador Larroca", 
//                                        "Mint", 
//                                        3.50);
//        
//        // Summary info
//        System.out.println("My comic books:");
//        System.out.println("  "+book1.description());
//        System.out.println("  "+book2.description());
//        System.out.println("  "+book3.description());
//        System.out.println("--------------------------------------");
//        
//        // Full info
//        System.out.println("\nDetailed information:\n");
//        System.out.println(book1.toString());
//        System.out.println(book2.toString());
//        System.out.println(book3.toString());
//        
//        // Change info
//        book1.setWriter("Warren Ellis");
//        book2.setArtist("Jim Lee");
//        book2.setValue(40);
//        book3.setCondition("Mint");
//        book3.setValue(book2.getValue());
//        
//        // Full info, reflecting changes
//        System.out.println("\nDetailed information, with changes:\n");
//        System.out.println(book1.toString());
//        System.out.println(book2.toString());
//        System.out.println(book3.toString());
    }
}
