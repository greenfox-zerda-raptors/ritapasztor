/**
 * Created by Rita on 2016.12.06..
 */
public class Accumul {


    public static String accum(String s) {
        StringBuilder result = new StringBuilder();

        if (s.length() >= 1) {
            for (int i = 0; i < s.length(); i++) {
                result.append(s.toUpperCase().charAt(i));
                for (int j = 0; j < i; j++) {
                    result.append(s.toLowerCase().charAt(i));
                }
                if (i != s.length() - 1) {
                    result.append('-');
                }
                //return s.substring(0,1).toUpperCase() + "-" + s.substring(1,2).toUpperCase()+s.substring(1,2).toLowerCase()
                //+s.substring(2).toUpperCase()+s.substring(2).toLowerCase()+s.substring(2).toLowerCase(); --> ezert keszitettuk a for loopot
            }
            return result.toString();
        }
        return  "";
        /*(s.equals("")) {
            return "";
        }*/ //nem kell, mert a fenti if-ben benne van minden
        // else return s.toUpperCase(); nem kell mert benne van a for loopban
    }
}
