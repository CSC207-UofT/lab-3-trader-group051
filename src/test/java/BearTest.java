/*
 * This file contains sample JUnit test cases for Bear.java
 * You should NOT modify this file!
 */

import org.junit.*;

import static org.junit.Assert.*;


public class BearTest {
    Bear b;

    @Before
    public void setUp() throws Exception {
        b = new Bear();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("rawrrr!", b.sound());
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(0, b.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        b.upgradeSpeed();
        assertEquals(1, b.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        b.downgradeSpeed();
        assertEquals(-1, b.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(100, b.getPrice());
    }
}
