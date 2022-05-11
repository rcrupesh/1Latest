package logical_program;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calender {

	public static void main(String[] args) 
	{
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");
		 System.out.println(format.format(cal.getTime()));
		
		 Calendar cal1=Calendar.getInstance();
	        SimpleDateFormat format1=new SimpleDateFormat("dd/MM/yyyy");
	        format.format(cal1.getTime());
	        
	        int number=12345;
	        String name=Integer.toString(number);

	       // String name="Nature";

	        String revstring="";
	        for(int i=name.length()-1;i>=0;i--)
	        {
	           revstring=revstring+name.charAt(i);
	        }
	        //int out=Interger.ParseInt(revstring);
	       int out = Integer.parseInt(revstring);
	        System.out.print(out);

	        
	        
	        
	        
	       
	}

}
