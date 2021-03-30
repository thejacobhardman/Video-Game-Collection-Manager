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

public class ComicBook 
{
    /**************************************************************
    * ATTRIBUTES                                                  *
    **************************************************************/
    private String title;
    private int issueNum;
    private String writer;
    private String artist;
    private String condition;
    private double value;
    
    /**************************************************************
    * CONSTRUCTORS                                                *
    **************************************************************/
    
    //all necessary parameters for attributes
    public ComicBook(String title_, 
                     int issueNum_, 
                     String writer_,
                     String artist_, 
                     String condition_, 
                     double value_) 
    {
        this.title = title_;
        this.issueNum = issueNum_;
        this.writer = writer_;
        this.artist = artist_;
        this.condition = condition_;
        this.value = value_;
    }
    
    //condition and value omitted
    public ComicBook(String title_, 
                     int issueNum_, 
                     String writer_, 
                     String artist_) 
    {
        this(title_, 
             issueNum_, 
             writer_, 
             artist_, 
             null,      // condition omitted
             0.00);     // value omitted
    }
    
    //only series name and issue number
    public ComicBook(String title_, int issueNum_) 
    {
        this(title_,
             issueNum_,
             null,      // writer omitted
             null,      // artist omitted
             null,      // condition omitted
             0.00);     // value omitted
    }
    
    //writer and artist omitted
    public ComicBook(String title_, 
                     int issueNum_, 
                     String condition_, 
                     double value_) 
    {
        this(title_,
             issueNum_,
             null,       // writer omitted
             null,       // artist omitted
             condition_, 
             value_);    
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
    
    public void setIssueNume(int issueNum_)
    {
        this.issueNum = issueNum_;
    }
    public int getIssueNum()
    {
        return this.issueNum;
    }
    
    public void setWriter(String writer_)
    {
        this.writer = writer_;
    }
    public String getWriter()
    {
        return this.writer;
    }
    
    public void setArtist(String artist_)
    {
        this.artist = artist_;
    }
    public String getArtist()
    {
        return this.artist;
    }
    
    public void setCondition(String condition_)
    {
        this.condition = condition_;
    }
    public String getCondition()
    {
        return this.condition;
    }
    
    public void setValue(double value_)
    {
        this.value = value_;
    }
    public double getValue()
    {
        return this.value;
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
