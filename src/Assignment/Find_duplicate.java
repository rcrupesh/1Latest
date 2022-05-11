package Assignment;

public class Find_duplicate {

	public static void main(String[] args) {


		String name="Programming";
		int count1=0;
		int count2=0;
		int count3=0;
		for(int i=0;i<=name.length()-1;i++)
		{
			if(name.charAt(i)=='g')
			{
				count1++;
			}
			if(name.charAt(i)=='r')
			{
				count2++;
			}
			if(name.charAt(i)=='m')
			{
				count3++;
			}
		}
		System.out.println("g :"+count1);
		System.out.println("r :"+count2);
		System.out.println("m :"+count3);
	}

}
