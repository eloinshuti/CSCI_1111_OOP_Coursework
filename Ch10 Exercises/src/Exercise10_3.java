/*
 * Eloi Nshuti
 * 9/20/2022
 * Exercise 10-3
 */

public class Exercise10_3 {
	
	public static void main(String[] args) {
		
		MyInteger myInteger = new MyInteger(3);
		
		System.out.println(" getValue():");
		System.out.println("value = " + myInteger.getValue());
		
		System.out.println("\n isEven(), isOdd(), isPrime(): ");
		System.out.println("Is 3 an even number? " + myInteger.isEven());
		System.out.println("Is 3 an odd number? " + myInteger.isOdd());
		System.out.println("Is 3 a prime number? " + myInteger.isPrime());
		
		System.out.println("\n isEven(MyInteger), isOdd(MyInteger), isPrime(MyInteger): ");
		System.out.println("Is 3 an even number? " + myInteger.isEven(myInteger));
		System.out.println("Is 3 an odd number? " + myInteger.isOdd(myInteger));
		System.out.println("Is 3 a prime number? " + myInteger.isPrime(myInteger));
		
		System.out.println("\n isEven(int), isOdd(int), isPrime(int): ");
		System.out.println("Is 2 an even number? " + MyInteger.isEven(2));
		System.out.println("Is 2 an odd number? " +  MyInteger.isOdd(2));
		System.out.println("Is 2 a prime number? " +  MyInteger.isPrime(2));
		
		System.out.println("\n isEquals(int): ");
		System.out.println("Is the stored value equal to 1? " + myInteger.equals(1));
		
		System.out.println("\n isEquals(MyInteger): ");
		System.out.println("Is the stored value equal to 3? " + myInteger.equals(myInteger));
		
		char [] myChar = {'e', 'f', 'x'};
		int[] g = MyInteger.parseInt(myChar);
		
		System.out.println("\n parseInt(char[]) for myChar = {'e', 'f', 'x'} : ");
		for (int i = 0; i < g.length; i++) {
			System.out.print(g[i] + " ");
		}
		
		System.out.println("\n\n parseInt(String) for myString = \"1148\" : ");
		System.out.println(MyInteger.parseInt("1148"));
	}
	
	
}

class MyInteger {
	
	int value;

	public MyInteger(int newValue) {
		value = newValue;
	}
	public int getValue() {
		return value;
	}
	
	public boolean isEven() {
		if (value%2 == 0)
			return true;
		else
			return false;
	}
	public boolean isOdd() {
		if (value%2 == 0)
			return false;
		else
			return true;
	}
	public boolean isPrime() {
		int count = 0;
		
		for(int i = 2; i < value; i++) {
			if(value%i == 0)
				count++;			
		}
		if (count > 0)
			return false;
		else
			return true;
		}
	
	public static boolean isEven(int value) {
		if (value%2 == 0)
			return true;
		else
			return false;
	}
	public static boolean isOdd(int value) {
		if (value%2 == 0)
			return false;
		else
			return true;
			
	}
	public static boolean isPrime(int value) {
		int count = 0;
		
		for(int i = 2; i < value; i++) {
			if(value%i == 0)
				count++;			
		}
		if (count > 0)
			return false;
		else
			return true;
		}
	
	public static boolean isEven(MyInteger Value) {
		if (Value.value % 2 == 0)
			return true;
		else
			return false;
	}
	public static boolean isOdd(MyInteger Value) {
		if (Value.value % 2 == 0)
			return false;
		else
			return true;
			
	}
	public static boolean isPrime(MyInteger Value) {
		int count = 0;
		
		for(int i = 2; i < Value.value; i++) {
			if(Value.value % i == 0)
				count++;			
		}
		if (count > 0)
			return false;
		else
			return true;
		}
	

	public boolean equals(int value) {
		if(getValue() == value)
			return true;
		else
			return false;
	}
	
	public boolean equals(MyInteger Value) {
		if(Value.value == getValue())
			return true;
		else
			return false;
	}
	
	public static int[] parseInt(char[] myChar) {
		int [] myInt = new int[myChar.length];
		
		for(int i = 0; i < myChar.length; i++) {
			myInt[i] = (int)myChar[i];
		}
		return myInt;
	}
	
	public static int parseInt(String myString) {
		return Integer.parseInt(myString);
	}
}