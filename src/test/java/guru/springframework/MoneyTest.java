package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoneyTest {

    @Test
    void testMultiplicationDollar() {
        // Dollar five = new Dollar(5);
        Money five = Money.dollar(5);
        //Dollar product = five.times(2);
        //assertEquals(10, product.amount);
        //assertEquals(new Dollar(10), product);
        //assertEquals(new Dollar(10), five.times(2));
        assertEquals(Money.dollar(10), five.times(2));
        //product = five.times(3);
        //assertEquals(15, product.amount);
        //assertEquals(new Dollar(15), product);
        //assertEquals(new Dollar(15), five.times(3));
        assertEquals(Money.dollar(15), five.times(3));
        assertNotEquals(Money.dollar(32), five.times(5));
    }

    @Test
    void testEqualityDollar() {
        //assertEquals(new Dollar(5), new Dollar(5));
        assertEquals(Money.dollar(5), Money.dollar(5));
        //assertNotEquals(new Dollar(5), new Dollar(8));
        assertNotEquals(Money.dollar(5), Money.dollar(8));
        //assertNotEquals(new Dollar(5), new Franc(5));
        assertNotEquals(Money.dollar(5), Money.franc(5));
    }

    @Test
    void testMultiplicationFranc() {
        //Franc five = new Franc(5);
        Money five = Money.franc(5);
        // product = five.times(2);
        //assertEquals(new Franc(10), product);
        //assertEquals(new Franc(10), five.times(2));
        assertEquals(Money.franc(10), five.times(2));
        //product = five.times(3);
        //assertEquals(new Franc(15), product);
        //assertEquals(new Franc(15), five.times(3));
        assertEquals(Money.franc(15), five.times(3));
    }

    @Test
    void testEqualityFranc() {
        //assertEquals(new Franc(5), new Franc(5));
        assertEquals(Money.franc(5), Money.franc(5));
        //assertNotEquals(new Franc(5), new Franc(8));
        assertNotEquals(Money.franc(5), Money.franc(8));
    }
}

