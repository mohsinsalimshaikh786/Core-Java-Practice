  
/*
Program: Java program to calculate minimum notes for a given amount(using if else)
@author: Shuruti Singhal
@date: 18 august 2022 
*/

class NotesCalculator
{
	static void calcNotes(int amount)
	{
		int note2000=0,note500=0,note100=0,note50=0, note20=0, note10=0, note5=0, note2=0, note1=0;
		
	 while(amount>0)
	 {
    if(amount>=2000)
		  {
			note2000++;
			amount-=2000;
		  }
		else if(amount>=500)
		  {
			note500++;
			amount-=500;
		  }
		else if(amount>=100)
		  {
			note100++;
			amount-=100;
		  }
		else if(amount>=50)
		  {
			note50++;
			amount-=50;
		  }
		else if(amount>=20)
		    {
			 note20++;
			amount-=20;
	        }
			else if(amount>=10)
		     {
			 note10++;
			 amount-=10;
	         }
			     else if(amount>=5)
		             {
			          note5++;
			          amount-=5;
	                  }
	            		else if(amount>=2)
		                    {
			                      note2++;
			                     amount-=2;
	                         }
			                else if(amount>=1)
		                         {
			                       note1++;
		                        	amount-=1;
	                             }
								 else
									 System.out.println("Wrong input");
	  }			
            System.out.println("RS 2000 notes :"+ note2000);
            System.out.println("RS 500 notes :"+ note500);
            System.out.println("RS 100 notes :"+ note100);			
			System.out.println("RS 50 notes :"+ note50);
			System.out.println("RS 20 notes :"+ note20);
			System.out.println("RS 10 notes :"+ note10);
			System.out.println("RS 5 notes :"+ note5);
			System.out.println("RS 2 notes :"+ note2);
			System.out.println("RS 1 notes :"+ note1);
		
		
		
	}
	
	public static void main(String args[])
	{
		int total =Integer.parseInt(args[0]);
		 calcNotes(total);
	}
	
}