// Approach 
// We use the Xor Operation to get the unique numbern

import java.util.Scanner;

public class Unique_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        System.out.println("Enter the elements in an array");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int unique = Find_Unique_Number(arr);
        System.out.println("Unique number present in an array" + " " + unique);

    }

    private static int Find_Unique_Number(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans = ans ^ arr[i];
        }
        return ans;
    }
}
