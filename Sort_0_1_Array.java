import java.util.Arrays;

import javax.xml.transform.Source;

public class Sort_0_1_Array {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 0, 1, 1, 0, 0, 0, 1 };
        int start = 0;
        int end = arr.length - 1;
        int i = 0;
        while (start <= end) {
            if (arr[i] == 0) {
                swap1(arr, start, i);
                i++;
                start++;
            } else {
                swap1(arr, end, i);
                end--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void swap1(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
