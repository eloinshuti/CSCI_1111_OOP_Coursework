### Eloi Nshuti
### Southwest Technical College
### CSCI 1111 - Object Oriented Programming

##**Synopsis**
##### This is the final project for the Object Oriented Programming I (CSCI 1111) class. The project tests contains code that tests the user's knowledge of western geography 
##### by asking questions on the subject.
##### This repository will also be used to save coursework from the class.

##**Motivation**
##### I built this program to help the users learn and test their skills in geography especially of the western part of the world.

##**Code Example**
##### This is a code snippet of how the program requests the users input and analyzes it.
```
		USA state = new USA();
		NorthAmerica countriesNA = new NorthAmerica();
		Europe countriesEURO = new Europe();
		WGeography members = null;
		
		System.out.println("This is a test that checks your knowledge of western geography.");
		System.out.println("Test options:");
		System.out.println("\t1. North America. \n\t2. Europe \n\t3. United States of America \n\t4. Quit\n");
		
		DoStatement item;
		String answer ;
		do {
			item = new DoStatement("option");
			
		if (item.getNumber() == 1) {
			
			DoStatement item1 = new DoStatement("countries in North America ");
			if(item1.getNumber() == countriesNA.getCountries().size()) {
				System.out.println("Correct!");
			}
			else
				System.out.println("Incorrect, the answer is " + countriesNA.getCountries().size());
			System.out.println("Enter as many countries in North America as you can (Enter 'QUIT' to quit): ");
			int sum  = 0;
			for (int i = 0; i < countriesNA.getCountries().size(); i++) {
				
				System.out.println("- ");
				answer = input.nextLine();
				
				if (answer.equalsIgnoreCase("QUIT"))
					i = countriesNA.getCountries().size()-1;
				members = new WGeography(answer, countriesNA.getCountries());
				if(members.isItCorrect()) 
					sum = sum+1;
			}
			
			System.out.println("You scored: " +  sum + "/" + countriesNA.getCountries().size() + "\n");
		}
```
##**Tests**
##### To run the test, the user has to select an option from the list provided and answer the questions prompted. If the user wants to quit or end the program there ##### are instructions provided to do so (Use JUnit4 to test).

![TestExample](https://user-images.githubusercontent.com/112521045/195716810-9751e1ec-be3e-4d79-b931-0c00784c7d16.PNG)

##**Contributors**
##### Use this program using JUnit4.
