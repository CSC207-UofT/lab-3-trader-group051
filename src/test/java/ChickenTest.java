import org.junit.*;

import static org.junit.Assert.*;


public class ChickenTest {
    Chicken c;

    @Before
    public void setUp() throws Exception {
        c = new Chicken();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Buk buk bukoa buk!", c.sound());
    }

    @Test(timeout = 50)
    public void TestGetEggsLaid() {assertEquals(0, c.getEggsLaid());
    }

    @Test(timeout = 50)
    public void TestLayAnEgg() {
        c.layAnEgg();
        assertEquals(1, c.getEggsLaid());
    }

    @Test(timeout = 50)
    public void TestEggStolen() {
        c.eggStolen();
        assertEquals(0, c.getEggsLaid());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(30, c.getPrice());
    }

}
