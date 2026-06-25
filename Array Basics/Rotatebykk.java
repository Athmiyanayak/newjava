import java.util.*;
import java.util.Scanner;
public class Rotatebykk{
    public static void main(String[]args){
        int arr[]={1,2,3,4,5};
        Scanner sc=new Scanner(System.in);
        int n=arr.length;
        int k=sc.nextInt();
        k=k%n;
        
    for(int r=0;r<k;r++){
int first=arr[0];
for(int i=0;i<n-1;i++){
    arr[i]=arr[i+1];
}arr[n-1]=first;
    

    }for(int i=0;i<n;i++){
        System.out.println(arr[i]);
    }
    }
}