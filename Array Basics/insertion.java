import java.util.*;
public class insertion{
    public static void main(String[]args){
int arr[]={1,2,3,5,6};
int element=4;
int position=3;
int newarr[]=new int[arr.length+1];
for(int i=0;i<position;i++){
    newarr[i]=arr[i];
}newarr[position]=element;
for(int i=position;i<arr.length;i++){
    newarr[i+1]=arr[i];
}for(int i=0;i<newarr.length;i++){
    System.out.println(newarr[i]);

}
    }
}