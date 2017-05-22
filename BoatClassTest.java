package Assessment;

import static org.junit.Assert.*;

import org.junit.Test;

public class BoatClassTest {

		BoatClass testing = new BoatClass("The Mary Jane", "France", 200.4, 1);
		
		//Testing Name Constructor, Getter and Setter
		@Test
		public void testGetBoatName() {
			assertEquals("The Mary Jane", testing.getName());
		}
		
		@Test
		public void testSetBoatName(){
			testing.setName("BoatMan");
			assertEquals("BoatMan", testing.getName());
		}
		
		//Testing Country of Origin Constructor, Getter and Setter
		@Test
		public void testGetBoatOriginCountry(){
			assertEquals("France", testing.getOriginCountry());
		}
		
		@Test
		public void testSetMarinaAddress(){
			testing.setOriginCountry("Germany");
			assertEquals("Germany", testing.getOriginCountry());
		}
		
		//Testing Size Constructor, Getter and Setter
		@Test
		public void testGetBoatSize(){
			assertEquals(200.4, testing.getSize(), 0);
		}
		
		@Test
		public void testSetBoatSize(){
			testing.setSize(6000.5);
			assertEquals(6000.5, testing.getSize(), 0);
		}
		
		//Testing Speed Getter
		@Test
		public void testGetBoatSpeed(){
			assertEquals(1, testing.getSpeed());
	
		}
		
		//Testing Boat Accelerate Method
		@Test
		public void testBoatAccelerate(){
			testing.accelerate();
			assertEquals(2, testing.getSpeed());
			
		}

		//Testing Boat Decelerate Method
		@Test
		public void testBoatDecelerate(){
			testing.deccelerate();
			assertEquals(0, testing.getSpeed());
					
		}
	
		//Testing the addPeople Method
		//@Test
		//public void testAddPeopleToBoat(){
			//assertEquals();
		//}
}

//In this part, I created an instance of a boat and tested the getters and setters, as well as the deceleration and 
//acceleration methods, which all came out as running perfectly. I had a bit of trouble writing the test to 
//the addPeople method (as it included an arraylist and returned no value), but my logic suggests it would be to do 
//something like checking the length/size of an arraylist, then calling the add method to add someone to the arraylist 
//and then checking whether the arraylist has increased in size? Or potentially calling specific index points in the
//arraylist to see whether there is an object at that index point and whether its the object you expect it to be.
