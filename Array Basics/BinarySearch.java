 import java.util.*;
public class BinarySearch{
    public static void main(String[]args){
        int arr[]={1,2,3,4,5,6};
        int search=2;
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;

            if(arr[mid]==search){
                System.out.println(mid);
                return;
            }else if(arr[mid]<search){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
    }
}