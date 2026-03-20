package home1;

import static org.junit.Assert.*;

import org.junit.Test;

public class BoundaryTesting {

	private Bonus bonusCalc;
	
	@Test
    public void test() {
        bonusCalc = new Bonus();
        //1
        assertEquals(2000000, bonusCalc.bonus(0, true));
        
        //2
    	assertEquals(0, bonusCalc.bonus(0, false));
    	
    	//3
    	assertEquals(5000000, bonusCalc.bonus(1, true));
    	
    	//4
    	assertEquals(0, bonusCalc.bonus(1, false));
    	
    	//5
    	assertEquals(10000000, bonusCalc.bonus(2, true));
    	
    	//6
    	assertEquals(0, bonusCalc.bonus(2, false));
    	
    	//7
    	assertEquals(15000000, bonusCalc.bonus(3, true));
    	
    	//8
    	assertEquals(0, bonusCalc.bonus(3, false));
    	
    	//9
    	assertEquals(15000000, bonusCalc.bonus(4, true));
    	
    	//10
    	assertEquals(0, bonusCalc.bonus(4, false));
    }

}