import java.awt.Rectangle;
/**

   This example demonstrates Inserting a rectangle at the specified position.
*/

public class AddTester {

	public static void main(String[] args) {
		
		Rectangle box = new Rectangle(5, 10, 20, 30);
		box.add(0,0);
	    
	      // Print information about the Inserted rectangle 
	      System.out.println("Actual Location: x: "+ box.getX() + ", y: "+box.getY()); 
	      System.out.println("Expected Location: x: 0, y: 0" + "\n"); 
	      
	      System.out.println("Actual Dimension: W: "+ box.getWidth() + ", H: "+box.getHeight()); 
	      System.out.println("Expected Dimension: W: 25, H: 40"); 

	}

}
