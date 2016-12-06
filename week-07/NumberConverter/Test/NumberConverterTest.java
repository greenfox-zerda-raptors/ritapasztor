import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Rita on 2016.12.06..
 */
public class NumberConverterTest {

    @Test
    public void shouldReturnIfor1() {
        assertEquals("I", NumberConverter.arabicToRoman(1));
    }

    @Test
    public void shouldReturnIIfor2() {
        assertEquals("II", NumberConverter.arabicToRoman(2));
    }

    @Test
    public void shouldReturnIIIfor3() {
        assertEquals("III", NumberConverter.arabicToRoman(3));
    }
    @Test
    public void shouldReturnIVfor4() {
        assertEquals("IV", NumberConverter.arabicToRoman(4));
    }
    @Test
    public void shouldReturnVfor5() {
        assertEquals("V", NumberConverter.arabicToRoman(5));
    }
    @Test
    public void shouldReturnVIfor6() {
        assertEquals("VI", NumberConverter.arabicToRoman(6));
    }
    @Test
    public void shouldReturnIXfor9() {
        assertEquals("IX", NumberConverter.arabicToRoman(9));
    }
    @Test
    public void shouldReturnXfor10() {
        assertEquals("X", NumberConverter.arabicToRoman(10));
    }
   @Test
    public void shouldReturnXVIIIfor18() {
        assertEquals("XVIII", NumberConverter.arabicToRoman(18));
    }
    @Ignore
    public void shouldReturnXXfor20() {
        assertEquals("XX", NumberConverter.arabicToRoman(20));
    }
    @Test
    public void shouldReturnXXXVIIIfor38() {
        assertEquals("XXXVIII", NumberConverter.arabicToRoman(38));
    }

    @Test
    public void shouldReturnCCCXCVIIIfor398() {
        assertEquals("CCCXCVIII", NumberConverter.arabicToRoman(398));
    }

    @Test
    public void shouldReturnDDCCCLXIXfor869() {
        assertEquals("DCCCLXIX", NumberConverter.arabicToRoman(869));
    }
}
