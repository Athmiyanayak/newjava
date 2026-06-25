import java.util.*;
import java.util.Arrays;
public class Duplicates{
    public static void main(String[]args){
        int arr[]={1,2,3,4,5,2,3,6};
        Arrays.sort(arr);
        int n=arr.length;
        int temp[]=new int[n];
        int j=0;
        for(int i=0;i<n-1;i++){
            if(arr[i]!=arr[i+1]){
                temp[j++]=arr[i];
            }
        }temp[j++]=arr[n-1];
        // Print the array without duplicates
        for(int i=0;i<j;i++){
            System.out.print(temp[i]+" ");
        }
    }
}