package TestPackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class UnitTests {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
		ut_AddTwoNumbers();
		assertTrue(MyClass.ReturnTrue());
	}

	
	public void ut_AddTwoNumbers(){
		
		int nbr1 = 1;
		int nbr2 = 2;
		int nbr3 = 3; 
		String str1 = null;
		String str2 = "abc";
		String str3 = "abc";
		String str4 = "zxt";
		
		int nbrResult = 0;
		
		MyClass c = new MyClass();
		nbrResult = c.AddTwoNumbers(nbr1, nbr2);
		
		
		assertEquals(nbrResult, 3);
		
		
		
	}
}
