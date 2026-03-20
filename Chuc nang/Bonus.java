package home1;

public class Bonus {
	public static final int BONUS_0_YEARS = 2000000;
    public static final int BONUS_1_YEARS  = 5000000;
    public static final int BONUS_2_YEARS  = 10000000;
    public static final int BONUS_3_YEARS_ABOVE = 15000000;

    
    public int bonus(int year, boolean target) {
        if (year < 0) {
            throw new IllegalArgumentException("year must be >= 0");
        }
        if (year < 1) {
        	return target ? BONUS_0_YEARS : 0;
        }
        if (year < 2) {
            return target ? BONUS_1_YEARS : 0;
        } else if (year < 3) {
            return target ? BONUS_2_YEARS : 0;
        } else {
            return target ? BONUS_3_YEARS_ABOVE : 0;
        }
    }
}
