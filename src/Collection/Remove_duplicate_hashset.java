package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Remove_duplicate_hashset {

	public static void main(String[] args) 
	{
		HashSet hs=new HashSet<>();
		hs.add(3);
		
		hs.add(2);
		hs.add(1);
		hs.add(1);
		hs.add(2);
		
		
		for(Object o:hs)
		{
			System.out.println(o);
		}
		
	}

}
