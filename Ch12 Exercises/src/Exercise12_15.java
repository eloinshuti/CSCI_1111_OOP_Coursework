/*
 * Eloi Nshuti
 * Exercise 12-15
 * 9/6/2022
 */
import java.util.Scanner;
public class Exercise12_15 {
	public static void main(String[] args) throws Exception{
		java.io.File file = new java.io.File("Exercise12_15.txt");
		
		
		if(file.exists() == false) {
			try (
			         java.io.PrintWriter output = new java.io.PrintWriter(file);
			         ) {
				int[] random = new int[100];
				for(int i = 0; i < random.length; i++) {
					int number = (int)(Math.random() * 10);
					random[i] = number;
					output.print(random[i] + " ");
				}		
			       }
		}

		Scanner input = new Scanner(file);
		while(input.hasNext()) {
			int array = input.nextInt();
			System.out.print(array + " ");
		}		
	}
}
