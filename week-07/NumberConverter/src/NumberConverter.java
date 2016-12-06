import com.sun.deploy.util.StringUtils;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Rita on 2016.12.06..
 */
public class NumberConverter {

    public static String arabicToRoman(int arabic) {
        StringBuilder out = new StringBuilder();
        String[] symbols = new String[] {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        Integer[] values = new Integer[] {1000,900,500,400,100,90,50,40,10,9,5,4,1}; //ugyanaz legyen a sorrend


        /* Hashmappal sajnos nem mukodott, de azert itt van a kod
        HashMap<Integer, String> numberToSymbol = new HashMap<Integer, String>() {
            {
                put(9, "IX");
                put(5, "V");
                put(4, "IV");
            }
        };*/

        String strI = "I";
        String strV = "V";
        String strX = "X";
        String strL = "L";

        int remaining = arabic;

        /* Hashmappet probaltuk ezzel, de nem ment:
        for(Map.Entry<Integer, String> entry : numberToSymbol.entrySet()) {
            remaining = appendRomanNumber(remaining, entry.getKey(), entry.getValue(), out);
        }*/

        for (int i = 0; i < values.length ; i++) {
            remaining = appendRomanNumber(remaining, values[i], symbols[i], out);
        }

        /*
        // indexszelnunk kell, ezert jobb arraylistet vagy hashmap-t hasznalni; szamhoz szimbolumot rendelunk
        remaining = appendRomanNumber(remaining, 9, "IX", out); // ahhoz, h ne kelljen egyesevel kiirni ezt a sort, kell egy loop --> while
        remaining = appendRomanNumber(remaining, 5, "V", out);
        remaining = appendRomanNumber(remaining, 4, "IV", out);
        */

        /*if (remaining == 9) { //mivel 3 szamnal is ugyanaz a kod, irok egy methodot: appendRomanNumber
            out.append(strI).append(strX);
            remaining -= 9;
        }
        if (remaining >= 5) {
            out.append(strV);
            remaining -= 5;
        }
        if (remaining == 4) { //4-es es 9-es is lehet >=, mert van folotte egy olyan szam, amit lekezelunk kulon
            out.append(strI).append(strV);
            remaining -= 4;
        }*/

        /*for (int j = 1; j <= remaining; j++) {
            out.append(strI);
        }*///ezt a for loop-t atirom while-ra
        /*while (remaining >= 1) {
            out.append("I");
            remaining -= 1;
        }*/ //a while loop sem kell, mert kb ugyanaz van benne, mint a method-ban volt, ezert a method-t hasznalom, es beleirom a tomb-be az 1, "I"-t
        remaining = appendRomanNumber(remaining,1,"I",out);


        return out.toString();
    }

    private static int appendRomanNumber(int numeral, int value, String romanSymbol, StringBuilder builder) {
        while (numeral >= value) { // eredetileg if volt, de pl 39-en tobbszor is vegig kell mennie, mert a 10 tobbszorose fog maradni
            builder.append(romanSymbol);
            numeral -= value;
        }
        return numeral;
    }
}
