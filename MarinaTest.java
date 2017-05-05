//TDD ON THE ASSIGNMENT METHOD
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;


public class MarinaTest {
	
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object [][] { {} });
		}
		
		@Parameter public int Expected;
		@Parameter(1) public String Input1;
		@Parameter(2) public String Input2;

	@Test
	public void test() {
		Main testing = new Main();
		assertEquals(Expected, testing.assignBoat(Input1, Input2));
		
	}
}
//I was trying to see if the method, assignBoat, would actually assign boats to people and print it out.