package Assessment;

import static org.junit.Assert.*;

import org.junit.Test;

public class MarinaClassTest {

	MarinaClass testing = new MarinaClass("Marina 1", "Anchorage 2", 4);
	
	//Testing Name Constructor, Getter and Setter
	@Test
	public void testGetMarinaName() {
		assertEquals("Marina 1", testing.getName());
	}
	
	@Test
	public void testSetMarinaName(){
		testing.setName("Mollie");
		assertEquals("Mollie", testing.getName());
	}
	
	//Testing Address Constructor, Getter and Setter
	@Test
	public void testGetMarinaAddress(){
		assertEquals("Anchorage 2", testing.getAddress());
	}
	
	@Test
	public void testSetMarinaAddress(){
		testing.setAddress("Anchorage 1");
		assertEquals("Anchorage 1", testing.getAddress());
	}
	
	//Testing Space Constructor, Getter and Setter
	@Test
	public void testGetMarinaSpace(){
		assertEquals(4, testing.getSpace());
	}
	
	@Test
	public void testSetMarinaSpace(){
		testing.setSpace(5);
		assertEquals(5, testing.getSpace());
	}
	
	//Testing ArrayList Constructor, Getter and Setter
	//@Test
	//public void testGetBoatArray(){
	//	assertEquals(0, testing.getBoats());
	//}
	
	//@Test
	//public void testSetBoatArray(){
		//testing.setBoats(getClass());
		//assertEquals(getClass(), testing.getBoats()); 
	//}
	
	//Testing the dockBoat Method
	//@Test
	//public void testDockBoatInMarina(){
		//assertEquals();
	//}
	
}
//Again, I couldn't figure out how to test the dockBoat method, as it doesn't return anything. But what I wanted to do
//was similar to the way I wanted to test the arraylist in the BoatClassTest section. Also, I tried to test the 
//getters and setters for the attribute of the arraylist, I don't actually think the getters and setters for this
//are needed as generally we create new methods to add to the arraylist, but I thought it would be best to 
//include them in the object classes just to make sure.