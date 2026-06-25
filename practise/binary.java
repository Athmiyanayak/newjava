import java.util.*;
public class binary{
public static void main(String[]args){
    int arr[]={1,5,3,7,2};
    int low=0;
    int search=3;
    int high=arr.length-1;
    while(low<=high){
        int mid=(low+high)/2;
        if(arr[mid]==search){
            System.out.println(mid);
            break;
    
        }else if(arr[mid]<search){

        low=mid+1;
        }else{
            high=mid-1;
        }
    }
}
}