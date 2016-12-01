import main.Horse;
import org.junit.Before;
import org.junit.Test;
import org.junit.validator.ValidateWith;

import static org.junit.Assert.assertEquals;

/**
 * Created by Rita on 2016.12.01..
 */
public class TestHorse {
    private Horse horse;

    @Before
    public void initTest() {
        horse = new Horse("Paci");
    }

    @Test
    public void testFeed() throws Exception {
        int feedCounterBeforeFeed = horse.getFeedCounter();
        horse.feed();
        int feedCounterAfterFeed = horse.getFeedCounter();
        assertEquals(20, feedCounterAfterFeed - feedCounterBeforeFeed);
    }


    @Test(expected = IllegalArgumentException.class) //ez a test varja, h exceptiont dobjon
    public void testSetChildrenNum() throws Exception {
        horse.setChildrenNum(-1);
    }
}
