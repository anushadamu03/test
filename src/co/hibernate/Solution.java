package co.hibernate;

import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)
    {
    	Scanner scan= new Scanner(System.in);
    	String s=scan.nextLine();
    	scan.close();
    	
    	s= s.trim();
    	if (s.length()==0)
    	{
    		System.out.println(0);
    	}
    	
    	else
    	{
    	  String[] Strings=	s.split("['!?,._@ ]+");
    	  System.out.println(Strings.length);
    	  	for(String str:Strings)
    	  		System.out.println(str);
    	}
    	
    	
    	
    	
    }

	
	}
	

