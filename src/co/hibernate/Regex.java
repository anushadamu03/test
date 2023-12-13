package co.hibernate;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Regex {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int testcase =Integer.parseInt(in.nextLine());
		while(testcase>0)
		{
			testcase--;
			String pattern= in.nextLine();
			
			try {
				Pattern.compile(pattern);
				System.out.println("valid");
			}
			catch(PatternSyntaxException e)
			{
				System.out.println("invalid");
				
			}
		}
		

	}

}
