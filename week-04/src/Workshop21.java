/**
 * Created by Rita on 2016.11.07..
 */
public class Workshop21 {
    public static void main(String[] args) {
        // create a recursive function that returns it's input factorial

        System.out.println(fact(4));
    }
    public static long fact(int num){
        if (num == 1) {
            return 1;
        }//else is not needed, its better without it: {return num ==1 ? 1:fact(num-1)*num;}
        return num * fact(num-1);
    }
}//in Java recursion is not that good - use when repeated thing happens a few times only
//if the size depends on the input number, don't use it, because huge numbers can be added randomly
