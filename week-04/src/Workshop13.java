/**
 * Created by Rita on 2016.11.07..
 */
public class Workshop13 {
    public static void main(String[] args) {
        int[] ah = new int[]  { 3, 4, 5, 6, 7 };
        // print the sum of all numbers in ah

        int sum = 0; //I need this outside of the loop, because I need it later - not in the loop
        for (int num : ah){ //meaning that each element of the ah array is added to num integer
            sum = sum+num; //need to add value of num to sum
        }//=for each loop used


        System.out.println("Sum of array elements is:" + sum);
    }
}
//longer version is in Workshop13a
