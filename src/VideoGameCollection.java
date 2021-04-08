/**********************************************************************
*                   Assignment 8 -- Video Game Collection             *
*                                                                     *
* PROGRAMMER:        Jacob Hardman - hard7293@bears.unco.edu          *
* CLASS:             CS200 – Object Oriented Programming              *
* INSTRUCTOR:        Dean Zeller                                      *
* TERM:              Spring 2021                                      *
* SUBMISSION DATE:   4/9/2021		                                  *
*                                                                     *
* DESCRIPTION:                                                        *
* The following is an OOP definition for a video game collection.     *
*                                                                     *
* ATTRIBUTES:                                                         *
* 	name -- The name of the collection, stored as a String.           *
* 	games -- An ArrayList that stores the individual VideoGame        *
* 			 objects.												  *
*                                                                     *
* COPYRIGHT:                                                          *
* This program is copyright (c)2020 Jacob Hardman and Dean Zeller.    *
* Based on a template written by Tom Jensen and Dean Zeller.          *
* It is original work without use of outside sources.                 *
*                                                                     *
**********************************************************************/

import java.text.MessageFormat;
import java.util.*;

public class VideoGameCollection 
{
    /**************************************************************
    * ATTRIBUTES                                                  *
    **************************************************************/
    private String name;
    private ArrayList<VideoGame> games;
    
    /**************************************************************
    * CONSTRUCTORS                                                *
    **************************************************************/
    
    /***********************************************************************
	 * Method:   Constructor (all parameters)                               *
	 * Purpose:  Create a Video Game based on user parameters               *
	 * Parameters:                                                          *
	 *    name_ -- the name of the game collection, as a String             *
	 *    games_ -- the list of games to use in the collection              *
	 * Return value: None                                                   *
	 ***********************************************************************/
    public VideoGameCollection(String name_, ArrayList<VideoGame> games_)
    {
    	this.name = name_;
    	this.games = games_;
    }
    
    /***********************************************************************
	 * Method:   Constructor (games omitted)                                *
	 * Purpose:  Create a Video Game Collection based on user parameters.   *
	 *           An empty list of games is created by default.              *
	 * Parameters:                                                          *
	 *    name_ -- the name of the game collection, as a String             *
	 * Return value: None                                                   *
	 ***********************************************************************/
    public VideoGameCollection(String name_)
    {
        this.name = name_;
        this.games = new ArrayList<VideoGame>();
    }
    
    /***********************************************************************
	 * Method:   Constructor (no parameters)                                *
	 * Purpose:  Creates a blank object.                                    *
	 * Parameters: None                                                     *
	 * Return value: None                                                   *
	 ***********************************************************************/
    public VideoGameCollection()
    {
        this("My video game collection.");
    }
    
    /**************************************************************
    * GET and SET METHODS                                         *
    **************************************************************/
    
    /***********************************************************************
	 * Method:  setName                                                     *
	 * Purpose:  manually sets the title of the game collection             *
	 * Parameters:                                                          *
	 *    name_ -- the new title for the game collection, as a String       *
	 * Return value: None                                                   *
	 ***********************************************************************/
    public void setName(String name_)
    {
    	this.name = name_;
    }
    
    /***********************************************************************
	 * Method:  getName                                                     *
	 * Purpose:  retrieves the title of the game collection                 *
	 * Parameters: None                                                     *
	 * Return value: The title of the game collection as a String.          *
	 ***********************************************************************/
    public String getName()
    {
    	return this.name;
    }
    
    /***********************************************************************
	 * Method:  getGame                                                     *
	 * Purpose:  retrieves a specific game in the collection based on an    *
	 * 		     index provided by the user.                                *
	 * Parameters:                                                          *
	 *    index -- specifies what game to retrieve from the collection      *
	 * Return value: The game at the specified index, as a VideoGame object *
	 ***********************************************************************/
    public VideoGame getGame(int index)  
    {
        return this.games.get(index);
    }
    
    /***********************************************************************
	 * Method:  getSize                                                     *
	 * Purpose:  retrieves the current size of the game collection          *
	 * Parameters: None                                                     *
	 * Return value: The size of the game collection as an int.             *
	 ***********************************************************************/
    public int getSize()
    {
        return this.games.size();
    }
    
    
    /**************************************************************
    * OUTPUT METHODS                                              *
    **************************************************************/
    
    /***********************************************************************
	 * Method:  printCollection	                                            *
	 * Purpose: Displays name of the game collection, and the games in      *
	 * 			said collection in an easy to read manner.    				*
	 * Parameters: none                                                     *
	 * Return value: None                                                   *
	 ***********************************************************************/
    public void printCollection()
    {
        System.out.println("\nCollection: "+this.name+"\n");
        System.out.println("--------------------------------------------");
        for (int i = 0; i < this.games.size(); i++)
        {
            System.out.println((i+1)+": "+this.getGame(i).toString());
        }
        System.out.println(this.games.size()+" in collection.");
        System.out.println("--------------------------------------------");
    }
    
    /***********************************************************************
	 * Method:  printSummary	                                            *
	 * Purpose: Displays the descriptions of each game in the collection.   *
	 * Parameters: none                                                     *
	 * Return value: None                                                   *
	 ***********************************************************************/
    public void printSummary()
    {
        for (int i = 0; i < this.games.size(); i++)
        {
            System.out.println(this.getGame(i).description());
        }
    }
    
    /**************************************************************
    * OTHER METHODS                                               *
    **************************************************************/
    
    /***********************************************************************
	 * Method:  addGame                                                     *
	 * Purpose:  adds a new game to the collection                          *
	 * Parameters:                                                          *
	 *    newGame -- the new game to add, as a VideoGame object             *
	 * Return value: None                                                   *
	 ***********************************************************************/
    public void addGame(VideoGame newGame)
    {
        this.games.add(newGame);
    }
    
    /***********************************************************************
	 * Method:  DeleteGame                                                  *
	 * Purpose:  Deletes a game at the specified index.                     *
	 * Parameters:                                                          *
	 *    index -- the index value of the game to be deleted.               *
	 * Return value: None                                                   *
	 ***********************************************************************/
    public void DeleteGame(int index) {
    	this.games.remove(index);
    }
    
    /***********************************************************************
	 * Method:  SearchGames                                                 *
	 * Purpose:  Searches the collection for games that contain the user    *
	 *           provided search parameter. Returns the found games in an   *
	 *           ArrayList of VideoGame objects.                            *
	 * Parameters:                                                          *
	 *    searchParam -- the search paramter to search the collection       *
	 *    				 of games for.                                      *
	 * Return value: None                                                   *
	 ***********************************************************************/
    public ArrayList<VideoGame> SearchGames(String searchParam)
    {
    	ArrayList<VideoGame> gamesFound = new ArrayList<VideoGame>();
        for (int i = 0; i < this.games.size(); i++) {
        	if (this.getGame(i).getTitle().toUpperCase().contains(searchParam.toUpperCase())) {
        		gamesFound.add(this.getGame(i));
        	}
        	if (this.getGame(i).getGenre().toUpperCase().contains(searchParam.toUpperCase())) {
        		gamesFound.add(this.getGame(i));
        	}
        	if (this.getGame(i).getDeveloper().toUpperCase().contains(searchParam.toUpperCase())) {
        		gamesFound.add(this.getGame(i));
        	}
        	if (this.getGame(i).getDeveloper() != this.getGame(i).getPublisher()) {
        		if (this.getGame(i).getPublisher().toUpperCase().contains(searchParam.toUpperCase())) {
            		gamesFound.add(this.getGame(i));
            	}
        	}
        } 
        
        return gamesFound;
    }
}
