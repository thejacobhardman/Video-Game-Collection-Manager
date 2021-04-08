/**********************************************************************
*           Assignment 8 -- Video Game Collection Interface           *
*                                                                     *
* PROGRAMMER:        Jacob Hardman - hard7293@bears.unco.edu          *
* CLASS:             CS200 – Object Oriented Programming              *
* INSTRUCTOR:        Dean Zeller                                      *
* TERM:              Spring 2021                                      *
* SUBMISSION DATE:   4/9/2021		                                  *
*                                                                     *
* DESCRIPTION:                                                        *
* This is a text-based interface meant to allow the user to interact  *
* and manage a VideoGameCollection object, and the VideoGame objects  *
* stored inside.                                                      *
*                                                                     *
* ATTRIBUTES:                                                         *
* 	validSelections -- The list of valid inputs that the user can     *
* 					   can select from the menu.                      *
* 	selection -- The user's input stored as a String.		          *
*   input -- The scanner property that will be used to accept         *
*            input from the user.                                     *
*                                                                     *
* COPYRIGHT:                                                          *
* This program is copyright (c)2020 Jacob Hardman and Dean Zeller.    *
* Based on a template written by Tom Jensen and Dean Zeller.          *
* It is original work without use of outside sources.                 *
*                                                                     *
**********************************************************************/

import java.util.ArrayList;
import java.util.Scanner;

public class VideoGameCollectionInterface {
	
	private ArrayList<String> validSelections;    
	private String selection;    
	private Scanner input;

}
