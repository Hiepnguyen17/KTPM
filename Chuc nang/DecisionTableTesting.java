package home1;
import static org.junit.Assert.*;

import org.junit.Test;

public class DecisionTableTesting {
	private Bonus bonusCalc;

	@Test
    public void test() {
		
		//R1
        bonusCalc = new Bonus();
        try {
            bonusCalc.bonus(-1, true);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            assertEquals("year must be >= 0", ex.getMessage());
        }
        
        // R2
        assertEquals(2000000, bonusCalc.bonus(0, true));
        
        //R3
        assertEquals(0, bonusCalc.bonus(0, false));

        //R4
        assertEquals(5000000, bonusCalc.bonus(1, true));
        
        //R5
        assertEquals(0, bonusCalc.bonus(1, false));
        
        //R6
        assertEquals(10000000, bonusCalc.bonus(2, true));
        
        //R7
        assertEquals(0, bonusCalc.bonus(2, false));
        
        //R8
        assertEquals(15000000, bonusCalc.bonus(3, true));
        
        //R9
        assertEquals(0, bonusCalc.bonus(5, false));
        
        //R10
        assertEquals(15000000, bonusCalc.bonus(5, true));
        //R11
        
        assertEquals(0, bonusCalc.bonus(3, false));
    }
}
