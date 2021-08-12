import java.util.*;

public class CreditCard {
	
	static void  Reverse(Long number,  int [] numbers) {
		
		
		
		 numbers[0] = (int) ((number/Math.pow(10, 15))%10);
		 numbers[1] = (int) ((number/Math.pow(10, 14))%10);
		 numbers[2] = (int) ((number/Math.pow(10, 13))%10);
		 numbers[3] = (int) ((number/Math.pow(10, 12))%10);
		 numbers[4] = (int) ((number/Math.pow(10, 11))%10);
		 numbers[5] = (int) ((number/Math.pow(10, 10))%10);
		 numbers[6] = (int) ((number/Math.pow(10, 9))%10);
		 numbers[7] = (int) ((number/Math.pow(10, 8))%10);
		 numbers[8] = (int) ((number/Math.pow(10, 7))%10);
		 numbers[9] = (int) ((number/Math.pow(10, 6))%10);
		 numbers[10] = (int) ((number/Math.pow(10, 5))%10);
		 numbers[11] = (int) ((number/Math.pow(10, 4))%10);
		 numbers[12] = (int) ((number/Math.pow(10, 3))%10);
		 numbers[13] = (int) ((number/Math.pow(10, 2))%10);
		 numbers[14] = (int) ((number/Math.pow(10, 1))%10);
		 numbers[15] = (int) ((number/Math.pow(10, 0))%10);
		
	}
	
	static void A(int A, int Z, int [] numbers) {
		 for (int a=0; a<=15; a+=2) {
			 Z = numbers[a];
			 A = A + Z;
			
		 }
		 
		
	}

	public static void main(String[] args) {
		// This is a program to check if a Credit Number is valid using the Luhn Algorithm
		Scanner number = new Scanner(System.in);	
		System.out.println(" How many credit cards do you want to check?");
		int N = number.nextInt();
		int [] digits = new int [16]; 
		Long CC;
		int Z=0;
		int A=0;
		int Y;
		int B=0;
		
		for (int i=1; i<=N; i++) {
			Scanner digit = new Scanner(System.in);	
			System.out.println(" Enter Credit card number: ");
			Long cardno = digit.nextLong();
				
			  // Reversing the entered credit card number
			CC = Long.reverse(cardno);
			
			  
			  // Assiging reversed numbers to the array
			  Reverse(CC, digits);
			 
			 //Calculating  A
			  A(A, Z, digits);
			 for (int a=0; a<=15; a+=2) {
				 Z = digits[a];
				 A = A + Z;
			 }
			 
			 //Calculating B
			 for (int a=1; a<=15; a+=2) {
				 Y = 2 * digits[a];
				 if (Y>=10) {
					int x = Y % 10;
					int y = 1;
					Y = x + y;
				 }
				 B = B + Y;
			 } 
			 int C = A + B;
			 //Finally!!
			 if (C % 10 == 0) {
				 System.out.println(" Your Credit Card Number is valid");
			 } else { System.out.println(" Your Credit Card Numbers is not valid"); }
			 
	}
		
	}
}

