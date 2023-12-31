import java.util.Arrays;
import java.util.Scanner;

public class Union_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the arr1");
        int n1 = sc.nextInt();
        System.out.println("Enter the elements in an array1");
        int arr1[] = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the size of arr2");
        int n2 = sc.nextInt();
        System.out.println("Enter the elements in an array2");
        int arr2[] = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        int arr3[] = new int[n1 + n2];
        for (int i = 0; i < n1; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < n2; i++) {
            arr3[n1 + i] = arr2[i];
        }
        System.out.println("Printing the elements in an array");
        System.out.println(Arrays.toString(arr3));

    }
}
