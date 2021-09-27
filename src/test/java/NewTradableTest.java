import org.junit.*;
import static org.junit.Assert.*;

public class NewTradableTest {
    NewTradable n;

    @Before
    public void setUp() throws Exception {
        n = new NewTradable();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Yeehaw", n.sound());
    }

}
