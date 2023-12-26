
// We have to find the maximum and minimum element in the array 
import java.util.*;

public class Max_Min {
    public static void main(String[] args) {
        int arr[] = { 3, 42, 45, 244, 22 };
        int Max = Integer.MIN_VALUE;
        int Min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > Max) {
                Max = arr[i];
            }
            if (arr[i] < Min) {
                Min = arr[i];
            }
        }
        System.out.println("Maximum element in this array is:" + Max);
        System.out.println("Minimum element in this array is:" + Min);
    }
}
