package Assigment_3_AritmeticOperator;

public class Question_7_paraUstuVerme {

	public static void main(String[] args) {
		/*Write a program that determines the change to be dispensed from a vending machine. An item in the machine can cost between 25 cents and 1 dollar, in 5-cent increments (25, 30, 35, . . . , 90, 95, or 100), and the machine accepts only a single dollar bill to pay for the item.

      Sample output

      Price in cents : 95

      Your change is 0 quarters, 0 dimes, and 1 nickles
      
      quarters=25,  dimes=10, and 1 nickles=5cent
		 
		 */
		
		vendingmachine(35);
	}
	
	public static void vendingmachine(int price) {
		
		int change=100-price;  //65 sent geri verecegiz bunu 2*25 1*10 1*5 olarak vermem lazim
		
		int quarterAmount=change/25;     //quarterAmount 2*25 sentliklerin adedi geri kaldi 15 cent
		
		int dimesAmount=((change-(quarterAmount*25))/10);  // 1*10 cent verdik kaldi 5
		
		int nicklesAmount=(change-(dimesAmount*10)-(quarterAmount*25))/5;
		
		
		
		
			
			
		System.out.println("Your change is "+ quarterAmount +" quarters," + dimesAmount+ " dimes, and " 
		+nicklesAmount +" nickles");	
		}
		
		
		
		
	}


