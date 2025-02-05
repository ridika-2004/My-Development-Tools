import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuelTankTest {
    private FuelTank fuelTank;
    @Test
    void testTankFuelLevel(){
        fuelTank = new FuelTank(50.0);
        assertEquals(50.0,fuelTank.getFuelLevel(),0.0001);
    }

    @Test
    void testHasEnoughFuelWhenSufficient () {
        fuelTank = new FuelTank (50.0) ;
        assertTrue ( fuelTank . hasEnoughFuel (30.0) ) ;
    }
    @Test
    void testHasEnoughFuelWhenInsufficient () {
        fuelTank = new FuelTank (50.0) ;
        assertFalse ( fuelTank . hasEnoughFuel (70.0) ) ;
    }
    @Test
    void testConsumeFuelMultipleTimes () {
        fuelTank = new FuelTank (50.0) ;
        fuelTank.consumeFuelLevel(20.0); ;
        fuelTank.consumeFuelLevel(15.0); ;
        assertEquals (15.0 , fuelTank . getFuelLevel () , 0.001) ;
    }

    @Test
    void testConsumeFuelWhenEmpty () {
        fuelTank = new FuelTank(50.0);
        fuelTank.consumeFuelLevel(50.0); ;
        fuelTank.consumeFuelLevel(10.0); ;
        assertEquals ( -10.0 , fuelTank.getFuelLevel() , 0.001) ;
    }
}