/**********************************************************************
*                     Assignment 7 -- Video Game                      *
*                                                                     *
* PROGRAMMER:        Jacob Hardman - hard7293@bears.unco.edu          *
* CLASS:             CS200 – Object Oriented Programming              *
* INSTRUCTOR:        Dean Zeller                                      *
* TERM:              Spring 2021                                      *
* SUBMISSION DATE:   4/2/2021		                                  *
*                                                                     *
* DESCRIPTION:                                                        *
* The following is an OOP definition for a video game object.         *
*                                                                     *
* COPYRIGHT:                                                          *
* This program is copyright (c)2020 Jacob Hardmanm and Dean Zeller.   *
* Based on a template written by Tom Jensen and Dean Zeller.          *
* It is original work without use of outside sources.                 *
*                                                                     *
**********************************************************************/

public class VideoGame
{
    /**************************************************************
    * ATTRIBUTES                                                  *
    **************************************************************/
    private String title;
    private int releaseYear;
    private String genre;
    private String developer;
    private String publisher;
    private double releasePrice;
    private boolean isEarlyAccess;
    private int numberInSeries;
    
    /**************************************************************
    * CONSTRUCTORS                                                *
    **************************************************************/
    
    /***********************************************************************
	 * Method:   Constructor (all parameters)                               *
	 * Purpose:  Create a Video Game based on user parameters               *
	 * Parameters:                                                          *
	 *    title_ -- the title of the game                   				*
	 *    releaseYear_ -- the year that the game was released               *
	 *    genre_ -- the genre of the game                                   *
	 *    developer_ -- the developer of the game                           *
	 *    publisher_ -- the publisher of the game                           *
	 *    releasePrice_ -- the price of the game at release                 *
	 *    isEarlyAccess_ -- Denotes whether the game is in a state          *
	 *    of early access.                                                  *
	 *    tags_ -- Any relevant metadata
	 * Return value:  no return value type                                  *
	 ***********************************************************************/
    public VideoGame(String title_, 
                     int releaseYear_, 
                     String genre_,
                     String developer_, 
                     String publisher_, 
                     double releasePrice_,
                     boolean isEarlyAccess_,
                     int numberInSeries_) 
    {
        this.title = title_;
        this.releaseYear = releaseYear_;
        this.genre = genre_;
        this.developer = developer_;
        this.publisher = publisher_;
        this.releasePrice = releasePrice_;
        this.isEarlyAccess = isEarlyAccess_;
        this.numberInSeries = numberInSeries_;
    }
    
    //publisher, isEarlyAccess and tags omitted
    public VideoGame(String title_, 
    				 int releaseYear_, 
    				 String genre_,
                     String developer_, 
                     double releasePrice_) 
    {
    	this.title = title_;
        this.releaseYear = releaseYear_;
        this.genre = genre_;
        this.developer = developer_;
        this.publisher = developer_;
        this.releasePrice = releasePrice_;
        this.isEarlyAccess = false;
        this.numberInSeries = 1;
    }
    
    //publisher and isEarlyAccess omitted
    public VideoGame(String title_, 
    				 int releaseYear_, 
    				 String genre_,
    				 String developer_, 
    				 double releasePrice_,
    				 String tags_) 
    {
    	this.title = title_;
        this.releaseYear = releaseYear_;
        this.genre = genre_;
        this.developer = developer_;
        this.publisher = developer_;
        this.releasePrice = releasePrice_;
        this.isEarlyAccess = false;
        this.numberInSeries = 1;
    }
    
    //publisher omitted
    public VideoGame(String title_, 
    				 int releaseYear_, 
    				 String genre_,
    				 String developer_, 
    				 double releasePrice_,
    				 boolean isEarlyAccess_) 
    {
    	this.title = title_;
        this.releaseYear = releaseYear_;
        this.genre = genre_;
        this.developer = developer_;
        this.publisher = developer_;
        this.releasePrice = releasePrice_;
        this.isEarlyAccess = isEarlyAccess_;
        this.numberInSeries = 1;
    }
    
    /**************************************************************
    * GET and SET METHODS                                         *
    **************************************************************/
    
    public void setTitle(String title_)
    {
        this.title = title_;
    }
    public String getTitle()
    {
        return this.title;
    }
    
    public void setReleaseYear(int releaseYear_)
    {
        this.releaseYear = releaseYear_;
    }
    public int getReleaseYear()
    {
        return this.releaseYear;
    }
    
    public void setGenre(String genre_)
    {
        this.genre = genre_;
    }
    public String getGenre()
    {
        return this.genre;
    }
    
    public void setDeveloper(String developer_)
    {
        this.developer = developer_;
    }
    public String getDeveloper()
    {
        return this.developer;
    }
    
    public void setPublisher(String publisher_)
    {
        this.publisher = publisher_;
    }
    public String getPublisher()
    {
        return this.publisher;
    }
    
    public void setReleasePrice(double releasePrice_)
    {
        this.releasePrice = releasePrice_;
    }
    public double getReleasePrice()
    {
        return this.releasePrice;
    }
    
    public void setIsEarlyAccess(boolean isEarlyAccess_) 
    {
    	this.isEarlyAccess = isEarlyAccess_;
    }
    public boolean getIsEarlyAccess()
    {
    	return this.isEarlyAccess;
    }
    
    public void setNumberInSeries(int numberInSeries_) 
    {
    	this.numberInSeries = numberInSeries_;
    }
    public int getNumberInSeries()
    {
    	return this.numberInSeries;
    }
    
    /**************************************************************
    * OUTPUT METHODS                                              *
    **************************************************************/
    
    //Return a string with only the title and issue number
    public String description() 
    {
        return this.title + " released in " + this.releaseYear + ".";
    }
    
    //Return the entire object as a single String
    public String toString()
    {
        String result = this.title + ".";
        result += "\nReleased in: " + this.releaseYear + ".";
        result += "\nGenre: " + this.genre + ".";
        
        if (this.developer == this.publisher) {
        	result += "\nDeveloped and published by: " + this.developer + ".";
        } else {
        	result += "\nDeveloped by: " + this.developer + ".";
        	result += "\nPublished by: " + this.publisher + ".";
        }
        
        result += "\nOriginal price at release: " + this.releasePrice + ".";
        
        if (this.isEarlyAccess == true) {
        	result += "\nIs an early access title.";
        } else {
        	result += "\nIs not an early access title.";
        }
        
        result += "\n";
        return result;
    }
    
    /**************************************************************
    * OTHER METHODS                                               *
    **************************************************************/
    
    public VideoGame createSequel(VideoGame originalTitle)
    {
        return new VideoGame(originalTitle.title + " " + originalTitle.numberInSeries + 1,
        					 originalTitle.releaseYear,
        					 originalTitle.genre,
        					 originalTitle.developer,
        					 originalTitle.publisher,
        					 originalTitle.releasePrice,
        					 originalTitle.isEarlyAccess,
        					 originalTitle.numberInSeries + 1);
    }
    
}
