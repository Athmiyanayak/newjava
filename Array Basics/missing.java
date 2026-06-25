import java.util.*;
public class missing{
    public static void main(String[]args){
int n=8;
        int arr[]={1,2,3,4,6,7,8};
        int actualsum=0;
        int totalsum=n*(n+1)/2;
        for(int i=0;i<arr.length;i++){
            actualsum+=arr[i];
        }
        System.out.println(totalsum-actualsum);
    }
}