
import java.util.Scanner;

public class Pair_3_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the arr1");
        int n1 = sc.nextInt();
        System.out.println("Enter which pair sum you have find it");
        int sum = sc.nextInt();
        System.out.println("Enter the elements in an array1");
        int arr1[] = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        for (int i = 0; i < arr1.length; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                for (int k = j + 1; k < arr1.length; k++) {
                    if (arr1[i] + arr1[j] + arr1[k] == sum) {
                        System.out.println("(" + arr1[i] + "," + arr1[j] + "," + arr1[k] + ")");
                    }

                }
            }
        }
    }
}
