import java.util.*;
public class bubblesort{
    public static void main(String[]args){
        int arr[]={1,7,3,8,5};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
      for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
      }
    }
}