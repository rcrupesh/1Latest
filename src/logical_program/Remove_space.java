package logical_program;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Remove_space {

	public static void main(String[] args) {
		String name = "India     Is My    Country";  
        //1st way  
        String noSpaceStr = name.replaceAll("\\s", ""); // using built in method  
        System.out.print(noSpaceStr);
        
        //System.out.println(name.replaceAll(" ", "")); 
        
        
        
      

	}

}
