package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class sorting {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();   //created array list
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(6);
		al.add(7);
		al.add(9);
		al.add(3);
		System.out.println("=======print collection==============");
		for(Object o:al)
		{
			System.out.println(o);
		}
		Collections.sort(al);
		System.out.println("===Print  after sorting===");
		
		for(Object o:al)
		{
			System.out.println(o);
		}
		                                 //Comparator<Object> cmp = Collections.reverseOrder();
		Collections.sort(al,Collections.reverseOrder());
       System.out.println("===print in reverse order===");
		
       for(Object o:al)
		{
			System.out.println(o);
		}
	}

}
