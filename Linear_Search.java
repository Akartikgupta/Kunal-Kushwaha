
import java.util.Scanner;

public class Linear_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 3, 4, 2, 5, 6 };
        for (int i = 0; i < arr.length; i++) {
            int search = sc.nextInt();
            if (arr[i] == search) {
                System.out.println("Element found at this index" + i + "and match value is " + search);
            } else {
                System.out.println("Not found a similar match with the element");
            }

        }
    }
}
