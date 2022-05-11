package Assignment;

import java.util.Arrays;

public class SmaLLEST_number_inArray {

	public static void main(String[] args) {
//		int num[]= new int[2];
//		num[0]=1;
//		num[1]=2;
		int num[]= {1,3,2,4,5};
		
		
		
		for(int i=0;i<=num.length-1;i++)
		{
			
			System.out.println(num[i]);
		}
		Arrays.sort(num);
		for(int i=0;i<=num.length-1;i++)
		{
			
			System.out.println(num[i]);
		}
		System.out.println(num[0]);

	}

}
