package Assigment_3_AritmeticOperator;

public class Question_6_Caffeine {

	public static void main(String[] args) {
		
		/*Scientists estimate that roughly 10 grams of caffeine consumed at one time is a lethal overdose.

Write a program with a variable that holds the number of milligrams of caffeine in a drink and outputs how many drinks it takes to kill a person.

       Sample Output

      Number of milligrams in drink: 500
      It would take about 20 drinks for a lethal overdose
		 * 
		 */
		
		caffeineConsume(500);
		
	}
	
	public static void caffeineConsume(double i) {
		
		double gr=i/1000;
		double numberDrink=10/gr;
		
		
		System.out.println("Number of milligrams in drink :" + i);
		System.out.println("It would take about "+ numberDrink +" drinks for a lethal overdose");
		


	}

}
