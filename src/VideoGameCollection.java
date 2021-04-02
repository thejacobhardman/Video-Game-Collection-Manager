/**********************************************************************
*                   Assignment 7 -- Video Game Collection             *
*                                                                     *
* PROGRAMMER:        Jacob Hardman - hard7293@bears.unco.edu          *
* CLASS:             CS200 – Object Oriented Programming              *
* INSTRUCTOR:        Dean Zeller                                      *
* TERM:              Spring 2021                                      *
* SUBMISSION DATE:   4/2/2021		                                  *
*                                                                     *
* DESCRIPTION:                                                        *
* The following is an OOP definition for a video game collection.     *
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
    // all necessary parameters for attributes
    public VideoGameCollection(String name_)
    {
        this.name = name_;
        this.games = new ArrayList<VideoGame>();
    }
    
    // no initial parameters
    public VideoGameCollection()
    {
        this("My video game collection.");
    }
    
    /**************************************************************
    * GET and SET METHODS                                         *
    **************************************************************/
    
    // return a comic given the index
    public VideoGame getGame(int index)  
    {
        return this.games.get(index);
    }
    
    // return the number of comics in the array
    public int getSize()
    {
        return this.games.size();
    }
    
    
    /**************************************************************
    * OUTPUT METHODS                                              *
    **************************************************************/
    // print the entire collection, with title and summary information
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
    
    // print a summary of the collection
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
    
    public void addGame(VideoGame newGame)
    {
        this.games.add(newGame);
    }
    
    public void SearchByTitle(String title)
    {
    	ArrayList<VideoGame> gamesFound = new ArrayList<VideoGame>();
        for (int i = 0; i < this.games.size(); i++) {
        	if (this.getGame(i).getTitle() == title) {
        		gamesFound.add(this.getGame(i));
        	}
        }
        
        System.out.println(MessageFormat.format("\nThere were {0} games found with the title: {1}.\n", gamesFound.size(), title));
        System.out.println("--------------------------------------------");
        for (int i = 0; i < gamesFound.size(); i++)
        {
            System.out.println((i+1)+": " + gamesFound.get(i).toString());
        }
        System.out.println("--------------------------------------------");
    }
    
    public void SearchByDeveloper(String developer)
    {
    	ArrayList<VideoGame> gamesFound = new ArrayList<VideoGame>();
        for (int i = 0; i < this.games.size(); i++) {
        	if (this.getGame(i).getDeveloper() == developer) {
        		gamesFound.add(this.getGame(i));
        	}
        }
        
        System.out.println(MessageFormat.format("\nThere were {0} games found that were made by: {1}.\n", gamesFound.size(), developer));
        System.out.println("--------------------------------------------");
        for (int i = 0; i < gamesFound.size(); i++)
        {
            System.out.println((i+1)+": " + gamesFound.get(i).toString());
        }
        System.out.println("--------------------------------------------");
    }
    
    public void SearchByGenre(String genre)
    {
    	ArrayList<VideoGame> gamesFound = new ArrayList<VideoGame>();
        for (int i = 0; i < this.games.size(); i++) {
        	if (this.getGame(i).getGenre() == genre) {
        		gamesFound.add(this.getGame(i));
        	}
        }
        
        System.out.println(MessageFormat.format("\nThere were {0} games found in the {1} genre.\n", gamesFound.size(), genre));
        System.out.println("--------------------------------------------");
        for (int i = 0; i < gamesFound.size(); i++)
        {
            System.out.println((i+1)+": " + gamesFound.get(i).toString());
        }
        System.out.println("--------------------------------------------");
    } 
}
