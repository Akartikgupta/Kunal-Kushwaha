public class Rotated_Binary_Search_Duplicate_Elements {
    public static void main(String[] args) {
        int arr[]={2,2,2,2,9};
        System.out.println(findpivotwithduplicate(arr));
    }
    static int search(int target,int arr[]){
        int pivot=findpivotwithduplicate(arr);
        //if u don't find the pivot ,it means tha array is not rotated
        if(pivot == -1){
            //then do normal binary search
           return binarysearch(arr, target, 0, arr.length-1);
        }
        //if pivot is found ,you have 2 asc sorted arrays
        if(arr[pivot]==target){
            return pivot;
        }
        else if(target>=arr[0]){
            return binarysearch(arr, target, 0, pivot - 1);
        }
        return binarysearch(arr, target, pivot + 1, arr.length-1);
    }
    static int binarysearch(int arr[],int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    static int findpivotwithduplicate(int arr[]){
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
            //If the elements at start ,end are equal then just skip the duplicates
            else if(arr[mid]==arr[start] && arr[mid]==arr[end]){
                //Just skip the duplicates
                //NOTE: What if these element at start and end were the pivot?
                //Check if start is pivot
                if(arr[start]>arr[start+1]){
                    return start;
                }
                start++;
                //Check if end is pivot
                 if(arr[end]<arr[end-1]){
                     return end-1;
                }
                end--;
            }
            //left side is sorted , so pivot should be in right side
            else if(arr[start]<arr[mid] || arr[start]==arr[mid] && arr[mid]>arr[end]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }   
}
