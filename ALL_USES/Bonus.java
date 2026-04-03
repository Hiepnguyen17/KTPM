package home1;

public class Bonus {
	public int bonus(int year, boolean target) {
        if (year < 0) {
            throw new IllegalArgumentException("year must be >= 0");
        }
        if (!target) {
        	return 0;
        }
        if (year < 1) {
        	return 2000000;
        }
        if (year < 2) {
            return 5000000; 
        } 
        if (year < 3) {
            return 10000000;
        } 
        
        return 15000000;
        
    }
}
