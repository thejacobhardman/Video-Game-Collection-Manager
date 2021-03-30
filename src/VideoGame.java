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
    private String tags;
    
    /**************************************************************
    * CONSTRUCTORS                                                *
    **************************************************************/
    
    //all necessary parameters for attributes
    public VideoGame(String title_, 
                     int releaseYear_, 
                     String genre_,
                     String developer_, 
                     String publisher_, 
                     double releasePrice_,
                     boolean isEarlyAccess_,
                     String tags_) 
    {
        this.title = title_;
        this.releaseYear = releaseYear_;
        this.genre = genre_;
        this.developer = developer_;
        this.publisher = publisher_;
        this.releasePrice = releasePrice_;
        this.isEarlyAccess = isEarlyAccess_;
        this.tags = tags_;
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
        this.tags = null;
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
        this.tags = tags_;
    }
    
    //publisher omitted
    public VideoGame(String title_, 
    				 int releaseYear_, 
    				 String genre_,
    				 String developer_, 
    				 double releasePrice_,
    				 boolean isEarlyAccess_,
    				 String tags_) 
    {
    	this.title = title_;
        this.releaseYear = releaseYear_;
        this.genre = genre_;
        this.developer = developer_;
        this.publisher = developer_;
        this.releasePrice = releasePrice_;
        this.isEarlyAccess = isEarlyAccess_;
        this.tags = tags_;   
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
    
    public void setTags(String tags_)
    {
    	this.tags = tags_;
    }
    public String getTags()
    {
    	return this.tags;
    }
    
    /**************************************************************
    * OUTPUT METHODS                                              *
    **************************************************************/
    
    //Return a string with only the title and issue number
    public String description() 
    {
        return this.title + " Issue #" + this.issueNum;
    }
    
    //Return the entire object as a single String
    public String toString()
    {
        String result = this.title+" #" + this.issueNum;
        if (this.writer!=null)
        {
            result += "\n  Written by: "+this.writer;
            result += "\n  Art by: "+this.artist;
        }
        if (this.condition!=null)
        {
            result += "\n  Condition by: "+this.condition;
        }
        if (this.value!=0.00)
        {
            result += "\n  Value by: "+this.value;
        }
        result += "\n";
        return result;
    }
    
    /**************************************************************
    * OTHER METHODS                                               *
    **************************************************************/
    public ComicBook createNextInSeries()
    {
        return new ComicBook(this.title, this.issueNum+1);
    }
    
}
