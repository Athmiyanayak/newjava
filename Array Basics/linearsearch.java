import java.util.*;
public class linearsearch{
    public static void main(String[]args){
        int arr[]={1,2,3,4,5};
        int search=3;
        boolean found=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==search){
            found=true;
            break;
            }
        }if(found){
            System.out.println("element found");
        }
    }
}