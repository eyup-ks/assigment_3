package Assigment_3_AritmeticOperator;

public class Question_5_saatCeviri {

	public static void main(String[] args) {
		
		/* Write a program that outputs the number of hours, minutes, and seconds that corresponds to input total seconds.

-Declare int variables inputSeconds, hours, minutes, seconds
-Initialize the inputSeconds

-Using %(remainder) and / operators, find out how many whole hours, minutes and seconds are in inputSeconds.
-Assign values to the hours, minutes, seconds variables
-Display the result

       Sample Output:

       inputSecond is 3695

      1 hours, 1 minutes, and 35 seconds
		
		 */
		inputSecond(7262);
			
		}
		
		
		public static void inputSecond(int sec) {
			

			int min=sec/60;
			int hour=min/60;
			
			int leftmin=min%60;
			
			int second=sec%60;
			
	
			System.out.println(hour +"hours, " + leftmin+ " minutes, and "+ second+ "seconds");

			
			
			
			
		}

	}


