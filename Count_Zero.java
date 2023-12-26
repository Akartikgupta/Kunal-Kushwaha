// Here we have to count the number of zeros and one's occur in the array 
public class Count_Zero {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0 };
        int Count_Zero = 0;
        int count_One = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                Count_Zero++;
            }
            if (arr[i] == 1) {
                count_One++;
            }
        }
        System.out.println("Total number of zeros occur in this array is:" + Count_Zero);
        System.out.println("Total number of one's occur in this array is:" + count_One);
    }
}
