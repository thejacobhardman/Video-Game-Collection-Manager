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

import java.util.*;

public class ComicCollection 
{
    /**************************************************************
    * ATTRIBUTES                                                  *
    **************************************************************/
    private String name;
    private ArrayList<ComicBook> comics;
    
    /**************************************************************
    * CONSTRUCTORS                                                *
    **************************************************************/
    // all necessary parameters for attributes
    public ComicCollection(String name_)
    {
        this.name = name_;
        this.comics = new ArrayList<ComicBook>();
    }
    
    // no initial parameters
    public ComicCollection()
    {
        this("My comic book collection");
    }
    
    /**************************************************************
    * GET and SET METHODS                                         *
    **************************************************************/
    
    // return a comic given the index
    public ComicBook getComic(int index)  
    {
        return this.comics.get(index);
    }
    
    // return the number of comics in the array
    public int getSize()
    {
        return this.comics.size();
    }
    
    
    /**************************************************************
    * OUTPUT METHODS                                              *
    **************************************************************/
    // print the entire collection, with title and summary information
    public void printCollection()
    {
        System.out.println("\nCollection: "+this.name+"\n");
        System.out.println("--------------------------------------------");
        for (int i = 0; i < this.comics.size(); i++)
        {
            System.out.println((i+1)+": "+this.getComic(i).toString());
        }
        System.out.println(this.comics.size()+" in collection.");
        System.out.println("--------------------------------------------");
    }
    
    // print a summary of the collection
    public void printSummary()
    {
        for (int i = 0; i < this.comics.size(); i++)
        {
            System.out.println(this.getComic(i).description());
        }
    }
    
    /**************************************************************
    * OTHER METHODS                                               *
    **************************************************************/
    
    public void addComic(ComicBook newComic)
    {
        this.comics.add(newComic);
    }
    
    public void SearchByTitle()
    {
        
    }
    
    public void SearchByCreator()
    {
        
    } 
}
