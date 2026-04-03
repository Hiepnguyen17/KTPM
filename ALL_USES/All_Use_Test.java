package home1;

import static org.junit.Assert.*;
import org.junit.Test;

public class All_Use_Test {

    private Bonus bonusCalc = new Bonus();

    @Test
    public void testAllPaths() {

        // 1: Exception
        try {
            bonusCalc.bonus(-1, true);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            assertEquals("year must be >= 0", ex.getMessage());
        }

        // 2
        assertEquals(0, bonusCalc.bonus(0, false));

        // 3
        assertEquals(2000000, bonusCalc.bonus(0, true));

        // 4
        assertEquals(5000000, bonusCalc.bonus(1, true));


        // 5
        assertEquals(10000000, bonusCalc.bonus(2, true));


        // 6
        assertEquals(15000000, bonusCalc.bonus(3, true));

        

       
    }
}