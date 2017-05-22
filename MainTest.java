package Assessment;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;

public class MainTest {
	
	//Set up the test array
	ArrayList<String> testArray;
	
	//Setting up the values in the array
	@Before
	public void setUpArray(){
		testArray = new ArrayList<String>(Arrays.asList("Boat1", "Boat 2", "Boat 3"));
	}
	
	@Test
	public void testAddToArray(){
		testArray.add("Boat 4");
		ArrayList<String>expected = new ArrayList<String>(Arrays.asList("Boat 1", "Boat 2", "Boat 3", "Boat 4"));
		assertEquals(testArray, expected);
	}
	
	@Test
	public void testRemoveFromArray(){
		testArray.remove("Boat 3");
		ArrayList<String>expected = new ArrayList<String>(Arrays.asList("Boat 1", "Boat 2", "Boat 4"));
		assertEquals(testArray, expected);
	}
	
	@Test
	public void testArrayIndex(){
		assertEquals(testArray.indexOf("Boat 1"), 1);
	}
}

//Essentially I was trying to learn how to test an arrayList- I knew that I'd need to create an instance of an object
//ie BoatClass boat = new BoatClass to add to the arrayList, but I didn't know how to pull my actual arrayList into the 
//test class, so instead I've put in a testArray to show how I would probably go about testing the actual arrayList. I'd
//test the add, remove and indexOf fucntions to see if it works correctly.