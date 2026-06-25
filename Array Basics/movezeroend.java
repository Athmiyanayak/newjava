import java.util.*;
public class movezeroend{
    public static void main(String[]args){
        int arr[]={1,2,0,4,0,9,0};
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[count];
                arr[count++]=temp;
                
            }
        }for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
    }
}}