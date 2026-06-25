import java.util.*;
public class sum{
    public static void main(String[]args){
        int data=12342;
        int sum=0;
        while(data!=0){
            int rem=data%10;
            sum=sum+rem;
            data=data/10;
        }
        System.out.println(sum);
    }
}