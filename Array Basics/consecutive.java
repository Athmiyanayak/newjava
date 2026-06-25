/*Maximum consecutive one’s (or zeros) in a binary array*/
import java.util.*;
public class consecutive{
    public static void main(String[]args){
int arr[]={1,1,0,0,0,0,0};
int count=1;
int maxcount=0;
for(int i=1;i<arr.length;i++){
    if(arr[i]==arr[i-1]){
        count++;}else{
            count=1;}
        
        maxcount=Math.max(count,maxcount);
    }
maxcount=Math.max(count,maxcount);
System.out.println(maxcount);
    }
}