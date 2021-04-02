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
* ATTRIBUTES:                                                         *
* 	title -- The title of the game, stored as a String.               *
* 	releaseYear -- The year that the game was released in, stored     *
* 				   as an int.                                         *
* 	genre -- The genre of the game, stored as a String.               *
* 	developer -- The developer of the game, stored as a String.       *
* 	publisher -- The publisher of the game, stored as a String.       *
* 	releasePrice -- The price of the game at release,                 *
* 					stored as a double.                               *
* 	isEarlyAccess -- Denotes whether the game is currently in a       *
* 					 state of early access, stored as a boolean.      *
* 	numberInSeries -- Denotes the chronological placement of a game   *
* 					  in a series.                                    *
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
	 *    numberInSeries_ -- Denotes what place in the series the game      *
	 *    takes place                                                       *
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
    
    /***********************************************************************
	 * Method:   Constructor (publisher and isEarlyAccess omitted)          *
	 * Purpose:  Create a Video Game based on user parameters.              *
	 * 			 The publisher attribute is set to the developer attribute  *
	 * 	         by default. isEarlyAccess is set to false.                 *
	 * Parameters:                                                          *
	 *    title_ -- the title of the game                   				*
	 *    releaseYear_ -- the year that the game was released               *
	 *    genre_ -- the genre of the game                                   *
	 *    developer_ -- the developer of the game                           *
	 *    releasePrice_ -- the price of the game at release                 *
	 *    of early access.                                                  *
	 *    numberInSeries_ -- Denotes what place in the series the game      *
	 *    takes place                                                       *
	 * Return value:  no return value type                                  *
	 ***********************************************************************/
    public VideoGame(String title_, 
    				 int releaseYear_, 
    				 String genre_,
                     String developer_, 
                     double releasePrice_,
                     int numberInSeries_) 
    {
    	this.title = title_;
        this.releaseYear = releaseYear_;
        this.genre = genre_;
        this.developer = developer_;
        this.publisher = developer_;
        this.releasePrice = releasePrice_;
        this.isEarlyAccess = false;
        this.numberInSeries = numberInSeries_;
    }
    
    /***********************************************************************
	 * Method:   Constructor (publisher omitted)                            *
	 * Purpose:  Create a Video Game based on user parameters.              *
	 * 			 The publisher attribute is set to the developer attribute  *
	 * 	         by default.                                                *
	 * Parameters:                                                          *
	 *    title_ -- the title of the game                   				*
	 *    releaseYear_ -- the year that the game was released               *
	 *    genre_ -- the genre of the game                                   *
	 *    developer_ -- the developer of the game                           *
	 *    releasePrice_ -- the price of the game at release                 *
	 *    of early access.                                                  *
	 *    isEarlyAccess_ -- Denotes whether the game is in a state          *
	 *    of early access.                                                  *
	 *    numberInSeries_ -- Denotes what place in the series the game      *
	 *    takes place                                                       *
	 * Return value:  no return value type                                  *
	 ***********************************************************************/
    public VideoGame(String title_, 
    				 int releaseYear_, 
    				 String genre_,
    				 String developer_, 
    				 double releasePrice_,
    				 boolean isEarlyAccess_,
    				 int numberInSeries_) 
    {
    	this.title = title_;
        this.releaseYear = releaseYear_;
        this.genre = genre_;
        this.developer = developer_;
        this.publisher = developer_;
        this.releasePrice = releasePrice_;
        this.isEarlyAccess = isEarlyAccess_;
        this.numberInSeries = numberInSeries_;
    }
    
    /**************************************************************
    * GET and SET METHODS                                         *
    **************************************************************/
    
    /***********************************************************************
	 * Method:  setTitle                                                    *
	 * Purpose:  manually sets the title of the game                        *
	 * Parameters:                                                          *
	 *    title_ -- the new title for the game, as a String                 *
	 * Return value: None                                                   *
	 ***********************************************************************/
    public void setTitle(String title_)
    {
        this.title = title_;
    }
    
    /***********************************************************************
	 * Method:  getTitle                                                    *
	 * Purpose:  retrieves the title of the game                            *
	 * Parameters: None                                                     *
	 * Return value: The title of the game as a String.                     *
	 ***********************************************************************/
    public String getTitle()
    {
        return this.title;
    }
    
    /***********************************************************************
	 * Method:  setReleaseYear                                              *
	 * Purpose:  manually sets the release year of the game                 *
	 * Parameters:                                                          *
	 *    releaseYear_ -- the new release year of the game, as an int       *
	 * Return value: None                                                   *
	 ***********************************************************************/
    public void setReleaseYear(int releaseYear_)
    {
        this.releaseYear = releaseYear_;
    }
    
    /***********************************************************************
	 * Method:  getReleaseYear                                              *
	 * Purpose:  retrieves the release year of the game                     *
	 * Parameters: None                                                     *
	 * Return value: The release year of the game, as an int.               *
	 ***********************************************************************/
    public int getReleaseYear()
    {
        return this.releaseYear;
    }
    
    /***********************************************************************
	 * Method:  setGenre                                                    *
	 * Purpose:  manually sets the genre of the game                        *
	 * Parameters:                                                          *
	 *    genre_ -- the new genre of the game, as a String                  *
	 * Return value: None                                                   *
	 ***********************************************************************/
    public void setGenre(String genre_)
    {
        this.genre = genre_;
    }
    
    /***********************************************************************
	 * Method:  getGenre                                                    *
	 * Purpose:  retrieves the genre of the game                            *
	 * Parameters: None                                                     *
	 * Return value: The genre of the game, as a String.                    *
	 ***********************************************************************/
    public String getGenre()
    {
        return this.genre;
    }
    
    /***********************************************************************
	 * Method:  setDeveloper                                                *
	 * Purpose:  manually sets the developer of the game                    *
	 * Parameters:                                                          *
	 *    developer_ -- the new developer of the game, as a String          *
	 * Return value: None                                                   *
	 ***********************************************************************/
    public void setDeveloper(String developer_)
    {
        this.developer = developer_;
    }
    
    /***********************************************************************
	 * Method:  getDeveloper                                                *
	 * Purpose:  retrieves the developer info for the game                  *
	 * Parameters: None                                                     *
	 * Return value: The developer of the game, as a String.                *
	 ***********************************************************************/
    public String getDeveloper()
    {
        return this.developer;
    }
    
    /***********************************************************************
	 * Method:  setPublisher                                                *
	 * Purpose:  manually sets the publisher of the game                    *
	 * Parameters:                                                          *
	 *    publisher_ -- the new publisher of the game, as a String          *
	 * Return value: None                                                   *
	 ***********************************************************************/
    public void setPublisher(String publisher_)
    {
        this.publisher = publisher_;
    }
    
    /***********************************************************************
	 * Method:  getPublisher                                                *
	 * Purpose:  retrieves the publisher info for the game                  *
	 * Parameters: None                                                     *
	 * Return value: The publisher of the game, as a String.                *
	 ***********************************************************************/
    public String getPublisher()
    {
        return this.publisher;
    }
    
    /***********************************************************************
	 * Method:  setReleasePrice                                             *
	 * Purpose:  manually sets the release price of the game                *
	 * Parameters:                                                          *
	 *    releasePrice_ -- the new publisher of the game, as a double       *
	 * Return value: None                                                   *
	 ***********************************************************************/
    public void setReleasePrice(double releasePrice_)
    {
        this.releasePrice = releasePrice_;
    }
    
    /***********************************************************************
	 * Method:  getReleasePrice                                             *
	 * Purpose:  retrieves the release price of the game                    *
	 * Parameters: None                                                     *
	 * Return value: The release price of the game, as a double.            *
	 ***********************************************************************/
    public double getReleasePrice()
    {
        return this.releasePrice;
    }
    
    /***********************************************************************
	 * Method:  setIsEarlyAccess                                            *
	 * Purpose:  manually sets whether the game is in a                     *
	 *           state of early access.                                     *
	 * Parameters:                                                          *
	 *    isEarlyAccess_ -- the new condition of the game's early access    *
	 *                      status, as a boolean.                           *
	 * Return value: None                                                   *
	 ***********************************************************************/
    public void setIsEarlyAccess(boolean isEarlyAccess_) 
    {
    	this.isEarlyAccess = isEarlyAccess_;
    }
    
    /***********************************************************************
	 * Method:  getIsEarlyAccess                                            *
	 * Purpose:  retrieves whether the game is in a state of early access   *
	 * Parameters: None                                                     *
	 * Return value: the new condition of the game's early access           *
	 *               status, as a boolean.                                  *
	 ***********************************************************************/
    public boolean getIsEarlyAccess()
    {
    	return this.isEarlyAccess;
    }
    
    /***********************************************************************
	 * Method:  setNumberInSeries                                           *
	 * Purpose:  manually sets game's chronological position in a series.   *
	 * Parameters:                                                          *
	 *    numberInSeries_ -- the game's new chronological position in the   *
	 *    					 series, as an int.                             *
	 * Return value: None                                                   *
	 ***********************************************************************/
    public void setNumberInSeries(int numberInSeries_) 
    {
    	this.numberInSeries = numberInSeries_;
    }
    
    /***********************************************************************
	 * Method:  getNumberInSeries                                           *
	 * Purpose:  retrieves the game's chronological position in its series  *
	 * Parameters: None                                                     *
	 * Return value: the game's chronological position in its series,       *
	 * 				 as an int.                                             *
	 ***********************************************************************/
    public int getNumberInSeries()
    {
    	return this.numberInSeries;
    }
    
    /**************************************************************
    * OUTPUT METHODS                                              *
    **************************************************************/
    
    /***********************************************************************
	 * Method:  description	                                                *
	 * Purpose: Returns a basic description of the game, including its      *
	 *          title and release year.    						            *
	 * Parameters: none                                                     *
	 * Return value: The title and release year of the game, concatenated   *
	 * 				 into a single String.                                  *
	 ***********************************************************************/
    public String description() 
    {
        return this.title + " released in " + this.releaseYear + ".";
    }
    
    /***********************************************************************
	 * Method:  toString	                                                *
	 * Purpose: Displays the attributes of the game in an easy to read      *
	 * 			manner.     						                        *
	 * Parameters: none                                                     *
	 * Return value: The attributes of the video, concatenated into a       *
	 * 				 single String.                                         *
	 ***********************************************************************/
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
        
        result += "\nOriginal price at release: $" + this.releasePrice + ".";
        
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
    
    /***********************************************************************
	 * Method:  createSequel	                                            *
	 * Purpose: Creates a new game in the same series as the original,      *
	 *          with appropriate title and numberInSeries attributes.       *
	 *          All other attributes are copied from the original game.    	*
	 * Parameters:                                                          *
	 *    originalTitle -- The original game that the sequel will be        *
	 *                     based on. Most of the sequel's attributes will   *
	 *                     be copied from this game.                        *
	 * Return value: The new game, as a VideoGame object.                   *
	 ***********************************************************************/
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
