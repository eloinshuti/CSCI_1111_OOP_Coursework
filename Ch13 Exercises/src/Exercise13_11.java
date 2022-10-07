/*
 * Eloi Nshuti
 * Exercise 13-11
 * 10/7/2022
 */
import java.lang.Cloneable; 

public class Exercise13_11 {
	public static void main(String[] args) throws CloneNotSupportedException {
			
		Octagon oct1 = new Octagon();
		Octagon oct2 = (Octagon)oct1.clone();
		
		
		if (oct1.comparableTo(oct2) == -1)
			System.out.println("Octagon 1 < Octagon 2");
		else if (oct1.comparableTo(oct2) == 1)
			System.out.println("Octagon 1 > Octagon 2");
		else if (oct1.comparableTo(oct2) == 0)
			System.out.println("Octagon 1 = Octagon 2");
	}
}

class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable{
	private double side;
	
	public Octagon() {
		side = 1;
	}
	public double getSide() {	
		return this.side;
	}
	@Override
	public double getArea() {
		
		return (2 + (4/Math.sqrt(2)))*side*side;
	}
	@Override
	public double getPerimeter() {
		
		return 0;
	}
	
	@Override
	public int comparableTo(Octagon o) {
		if (getArea() > o.getArea())
			return 1;
		else if (getArea() < o.getArea())
			return -1;
		else 
			return 0;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {	
		return super.clone();
	}
}

interface Comparable<E>{
	public int comparableTo(E o);
}


abstract class GeometricObject {
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
	public abstract double getArea();
	public abstract double getPerimeter();
}

