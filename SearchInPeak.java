public class SearchInPeak{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,3,2};
        int target=4;
        System.out.println(search(arr,target));
    }
    static int search(int arr[],int target){
        int peak=PeakIndex(arr);
        int firsttry=binarysearch(arr, target,0,peak);
        if(firsttry!=-1){
            return firsttry;
        }
        //try to search in second half
    return binarysearch(arr, target, peak+1, arr.length-1); 
    }
    static int binarysearch(int arr[],int target,int start,int end){
        while(start<=end){
            boolean isAsc=arr[start]<arr[end];
           // int mid =(start+end)/2;might be possible that (start + end) exceed the int limit
           int mid=start+(end - start)/2;
           if(arr[mid]==target){
            return mid;
           }
           if(isAsc){
            if(target<arr[mid]){
                end=mid-1;
               }
               else if(target>arr[mid]){
                start=mid+1;
               }
           }
           else{
            if(target>arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
           }
          
           
        }
        return -1;
    }
    public static int PeakIndex(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start < end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                //you are in descending part of array
                //this may be the answer,but look at left
                //this is why end!=mid-1
                end=mid;
            }else{
                //you are in asecending part of array
                start=mid+1;//because we know that mid+1 element>mid element

            }
        }
        //in the end,start==end and pointing to the largest number because of the 2 checks above
        //start and end are always trying to find max element in the above 2 checks
        //hence,when they pointing to just one element ,that is the maximum one because that is what the checks say
        //more elaboration:at every point of time for start and end,they have the best possible answer till that time
        //and if we are saying that only one item is reminaning,hence because of above line that is the best possible answer
        return start;//or return end as both are equal
    }
}
