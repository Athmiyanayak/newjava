import java.util.*;
public class Armstrong{
    public static void main(String[]args){
        int n=153;
        int original =n;
        int sum=0;
        while(n!=0){
            int rem=n%10;
            sum=sum+(rem*rem*rem);
            n=n/10;
        }if(sum==original){
            System.out.println("armstrong");
        }else{
            System.out.println("not armstrong");
        }
    }
}