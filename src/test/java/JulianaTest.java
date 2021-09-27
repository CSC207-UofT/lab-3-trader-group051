/*
 * This file contains sample JUnit test cases for Bear.java
 * You should NOT modify this file!
 */

import org.junit.*;

import static org.junit.Assert.*;


public class JulianaTest {
    Juliana jules;

    @Before
    public void setUp() throws Exception {
        jules = new Juliana();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("hehe rawr xd", jules.sound());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(42069, jules.getPrice());
    }
}
