package SkippTCwithout_dependonmethod;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class throw_skip_exception {

	
@Test
 public void TestMethod1() 
 {
			
	throw new SkipException("skipping this exception");
		 
}

}
