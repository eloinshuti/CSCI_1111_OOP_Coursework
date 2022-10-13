
/*
 * Eloi Nshuti
 * 9/13/2022
 * Final Project
 */
import java.util.*;
public class FinalProject {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		USA state = new USA();
		NorthAmerica countriesNA = new NorthAmerica();
		Europe countriesEURO = new Europe();
		WGeography members = null;
		java.io.File file = new java.io.File("NewFile.txt");
		System.out.println(file.getAbsolutePath());
		
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
		
		else if(item.getNumber() == 2) {//Europe
			DoStatement item2 = new DoStatement("countries in Europe ");
			if(item2.getNumber() == countriesEURO.getEurope().size()) {
				System.out.println("Correct!");
			}
			else
				System.out.println("Incorrect, the answer is " + countriesEURO.getEurope().size());
			System.out.println("Enter as many countries in Europe as you can (Enter 'QUIT' to quit): ");
			int sum  = 0;
			for (int i = 0; i < countriesEURO.getEurope().size(); i++) {
				
				System.out.println("- ");
				answer = input.nextLine();
				
				if (answer.equalsIgnoreCase("QUIT"))
					i = countriesEURO.getEurope().size() - 1;
				members = new WGeography(answer, countriesEURO.getEurope());
				if(members.isItCorrect()) 
					sum = sum+1;
			}
			
			System.out.println("You scored: " +  sum + "/" + countriesEURO.getEurope().size()+ "\n");
		}
		
		else if(item.getNumber() == 3) {//USA
			DoStatement item3 = new DoStatement("states in the United States of America");
			if(item3.getNumber() == state.getStates().size()) {
				System.out.println("Correct!");
			}
			else
				System.out.println("Incorrect, the answer is " + state.getStates().size());
			System.out.println("Enter as many states in the United States as you can (Enter 'QUIT' to quit): ");
			int sum  = 0;
			for (int i = 0; i < state.getStates().size(); i++) {
				
				System.out.println("- ");
				answer = input.nextLine();
				
				if (answer.equalsIgnoreCase("QUIT"))
					i = state.getStates().size() - 1;
				members = new WGeography(answer, state.getStates());
				if(members.isItCorrect()) 
					sum = sum+1;
			}
			
			System.out.println("You scored: " +  sum + "/" + state.getStates().size()+ "\n");
			
		}
		
		else if(item.getNumber() == 4) {//Quit
			System.exit(0);
		}
		
		else
			System.out.println("Invalid input");
		
		} while (item.getNumber() != 1 || item.getNumber() != 2 || item.getNumber() != 3 || item.getNumber() != 3);
		
	}
}

class WGeography implements Correct{
	private java.util.Date date;
	private String answer;
	private ArrayList<String> element;
	public int sum = 0;
	public WGeography() {
		date = new java.util.Date();
	}
	public WGeography(String answer, ArrayList<String> element) {
		this.answer = answer;
		this.element = element;
	}
	public String getAnswer(){
		return answer;
	}
	public ArrayList<String> getElement(){
		return element;
	}
	
	@Override
	public Boolean isItCorrect() {
		if(getElement().contains(getAnswer()))
			return true;
		else
			return false;
	}
	
}

interface Correct{
	public Boolean isItCorrect();
}

class DoStatement {
	private java.util.Date date;
	private int number;	
	private String text;
	public DoStatement() {
		date = new java.util.Date();
	}
	public DoStatement(String useInDo) {
		Scanner input = new Scanner(System.in);
		boolean continueInput = true;

		do {
			try {
				System.out.print("Enter the number of " + useInDo + " : ");
			    number = input.nextInt();
			    continueInput = false; 
			    }
		    catch(InputMismatchException ex) {
			    System.out.println("Invalid input");
			    input.nextLine();
			    }
			} while(continueInput);
		this.number = number;
	}
	public int getNumber() {
		return this.number;
	}
	public String getText() {
		return this.text;
	}
}

class Europe{
	private ArrayList<String> europe;
	public Europe() {
		
		String[] array = {"Albania","Andorra","Armenia","Austria","Azerbaijan","Belarus","Belgium",
		        "Bosnia and Herzegovina","Bulgaria","Croatia","Cyprus","Czech Republic",
		        "Denmark","Estonia","Finland","France","Georgia","Germany","Greece","Hungary",
		        "Iceland","Ireland","Italy","Kosovo","Latvia","Liechtenstein","Lithuania",
		        "Luxembourg","Macedonia","Malta","Moldova","Monaco","Montenegro","Netherlands",
		        "Norway","Poland","Portugal","Romania","Russia","San Marino","Serbia",
		        "Slovakia","Slovenia","Spain","Sweden","Switzerland","Turkey","Ukraine",
		        "United Kingdom","Vatican City"};
		
		europe =  new ArrayList<>(Arrays.asList(array));
	}
	public ArrayList<String> getEurope() {
		return europe;
	}
	
}

class NorthAmerica{
	private ArrayList<String> countriesNA;
	public NorthAmerica() {
		String[] array = {"United States of America","Mexico","Canada","Guatemala","Cuba","Haiti",
				"Dominican Republic","Honduras","Nicaragua","El Salvador","Costa Rica","Panama",
				"Jamaica","Trinidad and Tobago","Dominica","Greenland","Saint Kitts and Nevis",
				"Belize","Bahamas","Barbados","Saint Lucia","Grenada","Antigua and Barbuda"};
		countriesNA =  new ArrayList<>(Arrays.asList(array));
	}
	public ArrayList<String> getCountries(){
		return countriesNA;
	}
}


class USA{
	private ArrayList<String> states;
	public USA() {
		String[] array = {"Alabama","Alaska","Arizona","Arkansas","California","Colorado",
				"Connecticut","Delaware","Florida","Georgia",
				"Hawaii","Idaho","Illinois","Indiana","Iowa","Kansas","Kentucky","Louisiana",
				"Maine","Maryland","Massachusetts","Michigan","Minnesota","Mississippi",
				"Missouri","Montana","Nebraska","Nevada","New Hampshire","New Jersey",
				"New Mexico","New York","North Carolina","North Dakota","Ohio","Oklahoma",
				"Oregon","Pennsylvania","Rhode Island","South Carolina","South Dakota",
				"Tennessee","Texas","Utah","Vermont","Virginia","Washington","West Virginia",
				"Wisconsin","Wyoming"};
		states =  new ArrayList<>(Arrays.asList(array));
	}
	public ArrayList<String> getStates() {
		return states;
	}
}