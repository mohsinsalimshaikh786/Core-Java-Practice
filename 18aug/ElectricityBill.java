
/*
Program: Java program to calculate electricity bill(using if else)
@author: Shuruti Singhal
@date: 18 august 2022 
*/

class ElectricityBill
{
	static void calcBill(int noOfUnits)
	{
		double billAmount =0.0;
		if(noOfUnits<=50)
		{ 
	     
		 billAmount= noOfUnits*0.50;
			
		}
		else if(noOfUnits<=150)
		     {
			billAmount = 25+ ((noOfUnits-50)*0.75);
	        	}
				else if(noOfUnits <=250)
				    {
				     billAmount = 100 +((noOfUnits-150)* 1.20);
					 
			    	}
                  else 
				  {
					  billAmount =220 +((noOfUnits-250)*1.50);
				  }
				
                      					
		billAmount= billAmount +(0.20*billAmount);
		System.out.println("The amount is :"+ billAmount);
	}
	
	public static void main(String args[])
	{
		int units =Integer.parseInt(args[0]);
		 calcBill(units);
	}
	
}