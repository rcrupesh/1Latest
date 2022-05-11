package Collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Convert_coolection_Arrays {

	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList<>();
		al.add("My");
		al.add("favourite");
		al.add("Book");
		String  name[]=new String[al.size()];  
		name=(String[]) al.toArray(name);   //convert collection to array
		System.out.println(name[1]);
		for (int i=0;i<=name.length-1;i++)
		{
			System.out.println(name[i]);
		}
		
		
		
        
		
	}

}
