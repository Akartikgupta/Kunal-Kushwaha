//The Question is all about finding the element in an rotated binary search
//First find the pivot 
//pivot means the highest element in an array
//There will be 4 cases in finding the pivot
//if pivot element is not found then applu normal binary search
//if pivot is found then we look after 3 possible cases
//This code is not made for the duplicate elements in an array
public class Rotated_Binary_Search {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,0,1,2,3};
         System.out.println(search(0, arr)); 
    }
    static int search(int target,int arr[]){
        int pivot=findpivot(arr);
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

