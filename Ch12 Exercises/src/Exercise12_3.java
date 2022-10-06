/*
 * Eloi Nshuti
 * Exercise 12-3
 * 9/6/2022
 */

import java.util.Scanner;
public class Exercise12_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		int[] random = new int[100];
		
		
		for(int i = 0; i < random.length; i++) {
			int number = (int)(Math.random() * 10);
			random[i] = number;
		
		}
		
		try {
			System.out.print("Enter the index of the array to display (0-99): ");
			int index = input.nextInt();
			System.out.print(random[index]);
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Out of Bounds."); 
		}
		
		
	}
}