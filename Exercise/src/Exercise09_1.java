/*
 * Eloi Nshuti
 * Exercise 9-1
 * 9/8/2022
 */
public class Exercise09_1 {
    public static void main(String[] args) {
        
        Rectangle Rectangle1 = new Rectangle();
        System.out.println("\nThe area and perimeter of the rectangle of width "
                + Rectangle1.width + " and height " + Rectangle1.height + " is: \n" + 
           		   "Area: " + Rectangle1.getArea() + "\nPerimeter: " + Rectangle1.getPerimeter());
    
        Rectangle Rectangle2 = new Rectangle(4,40);
        System.out.println("\nThe area and perimeter of the rectangle of width "
                + Rectangle2.width + " and height " + Rectangle2.height + " is: \n" + 
           		   "Area: " + Rectangle2.getArea() + "\nPerimeter: " + Rectangle2.getPerimeter());
   
       Rectangle Rectangle3 = new Rectangle(3.5,35.9); 
       System.out.println("\nThe area and perimeter of the rectangle of width "
         + Rectangle3.width + " and height " + Rectangle3.height + " is: \n" + 
    		   "Area: " + Rectangle3.getArea() + "\nPerimeter: " + Rectangle3.getPerimeter());
       
     }
}

class Rectangle {
    double width; 
    double height;
  
    /** Two double data fields named width and height that specify the width and height 
     * of the rectangle. The default values are 1 for both width and height. */
    Rectangle() {
      width = 1;
      height = 1;
    }
  
    /** A constructor that creates a rectangle with the specified width and height. */
    Rectangle(double newWidth, double newHeight) {
    	width = newWidth;
        height = newHeight;
    }
  
    /** A method named getArea() that returns the area of this rectangle. */
    double getArea() {
      return width * height;
    }
  
    /** A method named getPerimeter() that returns the perimeter. */
    double getPerimeter() {
      return 2 * (width + height) ;
    }
  }