import java.util.*;
import java.util.Arrays;
public class Frequency{
    public static void main(String[]args){
int arr[]={1,2,3,7,5,3,2,7,1};
Arrays.sort(arr);
for(int i=0;i<arr.length;i++){
    int count=1;
    for(int j=i+1;j<arr.length;j++){
        if(arr[i]==arr[j]){
            count++;
        }
    }boolean found=false;
    for(int k=0;k<i;k++){{
        if(arr[i]==arr[k]){
            found=true;
            break;
        }
    }}
    if(!found){
        System.out.println(arr[i] + " occurs " + count + " times");
    }
}
    }
}