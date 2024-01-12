public class Rotation_Count {
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        System.out.println(countrotation(arr));
    }
    static int countrotation(int arr[]){
        int pivot=findpivot(arr);
        // if(pivot==-1){
        //     //Array is not rotated
        //     return 0;
        // }
        return pivot+1;
    }
    //Use this for non duplicates element in an array
    static int findpivot(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end - start)/2;
            //for finding the pivot element in an array 
            //we should test for the 4 cases
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(mid>start && arr[mid]<arr[mid-1]){

                return mid-1;
            }
            else if(arr[mid]<=arr[start]){
               end=mid-1;
            }else{
                start =mid+1;
            }
        }
        return -1;
    }
}
