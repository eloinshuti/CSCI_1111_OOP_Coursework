/*
 * Eloi Nshuti
 * Exercise 11-1
 * 9/23/2022
 */
import java.util.Scanner;
public class Exercise11_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the triangle color: ");
		String color = input.nextLine();
		
		System.out.print("Enter the triangle sides (Ex: 2 3 4): ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		
		System.out.print("Enter 1 for a filled triangle or 2 for a unfilled triangle: ");
		int filledValue = input.nextInt();

		boolean filled = false;
		if(filledValue == 1)
			filled = true;
		else if (filledValue == 2)
			filled = false;
		else
			System.out.print("The triangle filled in value is invalid.");
			
		Triangle side = new Triangle(side1,side2, side3, color, filled);
		System.out.println("\nArea: " + side.getArea());
		System.out.println("Perimeter: " + side.getPerimeter());
		System.out.println(side.toString());
		side.printGeometricObject();
	}
}

class Triangle extends GeometricObject {
	private double side1;
	private double side2;
	private double side3;
	
	public Triangle() {
		side1 = 1;
		side2 = 1;
		side3 = 1;
	}
	
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	public Triangle(double side1, double side2, double side3, String color, boolean filled) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		setColor(color);
		setFilled(filled);
	}
	
	public double getSide1() {	
		return this.side1;
	}
	public double getSide2() {	
		return this.side2;
	}
	public double getSide3() {	
		return this.side3;
	}
	
	public double getArea() {
		double s = (this.side1 + this.side2 + this.side3)/2;
		return Math.sqrt(s * (s - this.side1) * (s - this.side2) * (s - this.side3));
	}
	public double getPerimeter() {
		return this.side1 + this.side2 + this.side3;
	}
	
	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}
	
	public void printGeometricObject() {
		System.out.println("Date created: " + getDateCreated() + "\nColor: " + getColor() + 
			      " \nFilled: " + isFilled());
	}
}


class GeometricObject {
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
  
    public GeometricObject() {
    	dateCreated = new java.util.Date();
    }

    public GeometricObject(String color, boolean filled) {
    	dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }
    
    public String getColor() {
    	return color;
    }
  
    public void setColor(String color) {
    	this.color = color;
    }
 
    public boolean isFilled() {
    	 return filled;
    }

	public void setFilled(boolean filled) {
		 this.filled = filled;
	}
  
	public java.util.Date getDateCreated() {
		 return dateCreated;
	}
}