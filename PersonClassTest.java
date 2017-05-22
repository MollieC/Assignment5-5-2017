package Assessment;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonClassTest {

		PersonClass testing = new PersonClass("Frank", "Ocean", "24/05/1987", "German", true, false);
		PersonClass testing2 = new PersonClass("David", "Green", "03/02/1984", "British", "7890/1", false, false);
		
		//Testing First Name Constructor, Getter and Setter
		@Test
		public void testGetPersonFirstName() {
			assertEquals("Frank", testing.getFirstName());
		}
		
		@Test
		public void testSetMarinaName(){
			testing.setFirstName("Mollie");
			assertEquals("Mollie", testing.getFirstName());
		}
		
		//Testing Second Name Constructor, Getter and Setter
		@Test
		public void testGetPersonSecondName(){
			assertEquals("Ocean", testing.getSecondName());
		}
		
		@Test
		public void testSetMarinaAddress(){
			testing.setSecondName("Michaels");
			assertEquals("Michaels", testing.getSecondName());
		}
		
		//Testing DOB Constructor, Getter and Setter
		@Test
		public void testGetPersonDob(){
			assertEquals("24/05/1987", testing.getDob());
		}
		
		@Test
		public void testSetPersonDob(){
			testing.setDob("31/10/1987");
			assertEquals("31/10/1987", testing.getDob());
		}
		
		//Testing Nationality Constructor, Getter and Setter
		@Test
		public void testPersonNationality(){
			assertEquals("German", testing.getNationality());	
		}
				
		@Test
		public void testSetPersonNationality(){
			testing.setNationality("Asian");
			assertEquals("Asian", testing.getNationality());
		}
			
		//Testing VisaInfo Constructor, Getter and Setter
		@Test
		public void testGetPersonVisaInfo(){
			assertEquals("7890/1", testing2.getVisaInfo());
		}
		
		//Testing Captain Constructor, Getter and Setter
		@Test
		public void testPersonIsCaptain(){
			assertEquals(false, testing.getIsCaptain());
		}
		@Test
		public void testSetPersonIsCaptain(){
			testing.setIsCaptain(true);
			assertEquals(true, testing.getIsCaptain());
		}
		
		//Testing Owner Constructor, Getter and Setter
		@Test
		public void testPersonIsOwner(){
			assertEquals(true, testing.getIsOwner());
		}
		@Test
		public void testSetPersonIsOwner(){
			testing.setIsOwner(false);
			assertEquals(false, testing.getIsOwner());
		}
}

//I didn't have any methods in my PersonClass, so this was simply to test the getters and setters, and all of them came
//out as passing the tests.
