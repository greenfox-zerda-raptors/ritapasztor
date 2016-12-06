import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Rita on 2016.12.06..
 */
public class AccumulTest {
    @Test
    public void AccumulTestEmpty(){
        assertEquals("",Accumul.accum(""));
    }

    @Test
    public void AccumulTestA(){
        assertEquals("A",Accumul.accum("a"));
    }

    @Test
    public void AccumulTestAb(){
        assertEquals("A-Bb",Accumul.accum("ab"));
    }

    @Test
    public void AccumulTestAbc(){
        assertEquals("A-Bb-Ccc",Accumul.accum("abc"));
    }

    @Test
    public void AccumulTestRiTA(){
        assertEquals("R-Ii-Ttt-Aaaa",Accumul.accum("RiTA"));
    }


}
