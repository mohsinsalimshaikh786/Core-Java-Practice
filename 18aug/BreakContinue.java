
/*
Program: Java program to understand break and continue statement
@author: Mohsin shaikh
@date: 18 August 2022
*/

class BreakContinue
{
	// method to understand break keyword
	static void callBreak()
	{
		for(int i=0;i<1;i++ )
		{
			System.out.println(i); // printing the value of int
			if(i==6)
				break;
		}
		
	}	
	// method to understand continue keyword
	static void callContinue()
	{
		for(int i=0;i<1;i++)
		{
			System.out.println(i);
			if(i==6)
				continue;
		}
		
		
	}
	
	public static void main(String args[])
	{
		callBreak();
	}
}
