package home1;

import static org.junit.Assert.*;

import org.junit.Test;

public class testC2 {
	private Bonus bonusCalc;
	
	@Test
    public void test() {
		bonusCalc = new Bonus();
		
		
		//Path 1
		try {
            bonusCalc.bonus(-1, true);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            assertEquals("year must be >= 0", ex.getMessage());
        }
		
		//Path 2
		assertEquals(0, bonusCalc.bonus(0,false ));
		
		//Path 3
		assertEquals(2000000, bonusCalc.bonus(0,true ));
		
		//Path 4
		assertEquals(5000000, bonusCalc.bonus(1,true ));
		
		//Path 5
		assertEquals(10000000, bonusCalc.bonus(2, true));
		
		//Path 6
		assertEquals(15000000, bonusCalc.bonus(4, true));
	
		
		
	}

}





	
        