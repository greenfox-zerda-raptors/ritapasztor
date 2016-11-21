import static org.junit.Assert.*;

/**
 * Created by Rita on 2016.11.21..
 */
public class AppleTest {
    @org.junit.Test
    public void getName() throws Exception {
        Apple myObject = new Apple();
        assertEquals("apple", myObject.getName());
    }

}