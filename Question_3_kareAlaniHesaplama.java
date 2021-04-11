package Assigment_3_AritmeticOperator;

public class Question_3_kareAlaniHesaplama {

	public static void main(String[] args) {
		
		/*Write a Java program that displays the area of a rectangle with a width of 4.5 and a height of 7.9 using the following formula:

			area = width * height */
		
		rectangleArea(4.5,7.9);
		

	}
	
	public static void rectangleArea(double i, double i2) {
		
		double  area=i*i2;
		
		System.out.println("area = "+ area);
	}

}
