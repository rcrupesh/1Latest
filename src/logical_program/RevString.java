package logical_program;

import java.util.Scanner;

public class RevString {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value for rev opeartion");
		String orgstring = sc.next();
		//String orgstring="Rupesh";
		
		String revstring="";
		for(int i=orgstring.length()-1;i>=0;i--)
		{
			revstring=revstring+orgstring.charAt(i);
		}
		System.out.println(revstring);
		
		if(revstring.equals(orgstring))
		{
			System.out.println("it is palindrome");
		}
		else
		{
			System.out.println("not palidrome");
		}
		
		

	}

}
