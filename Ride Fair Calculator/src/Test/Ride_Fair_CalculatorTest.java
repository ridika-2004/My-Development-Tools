package Test;
import static org.junit.jupiter.api.Assertions.*;
import Source.Ride_Fair_Calculator;
import org.junit.jupiter.api.Test;

class Ride_Fair_CalculatorTest {
    @Test
    public void total_calculation()
    {
        Ride_Fair_Calculator premium_ride_calc = new Ride_Fair_Calculator(5,5,"premium ride");
        assertEquals(27, premium_ride_calc.total_fare());
        Ride_Fair_Calculator premium_ride_calc_more = new Ride_Fair_Calculator(10,5,"premium ride");

        assertEquals(30, premium_ride_calc_more.total_fare());

        Ride_Fair_Calculator economy_ride_calc = new Ride_Fair_Calculator(5,5,"economy ride");


        assertEquals(16.25, economy_ride_calc.total_fare());
        assertTrue(premium_ride_calc.total_fare()>economy_ride_calc.total_fare());
        assertTrue(premium_ride_calc_more.total_fare()>premium_ride_calc.total_fare());
        assertFalse(economy_ride_calc.total_fare()>premium_ride_calc.total_fare());
        assertNotSame(premium_ride_calc.total_fare(),economy_ride_calc.total_fare());

    }
}