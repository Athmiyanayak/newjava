import java.util.*;
public class Palindrome{
    public static void main(String[]args){
        String str ="athmiya";
        String original=str;
        String rev="";
        for(int i=str.length()-1;i>0;i--){
            rev=rev+str.charAt(i);
        }if(original==rev){
            System.out.println("it is palindrome");
            
        }else{
            System.out.println("Not Plaindrome");
        }

    }
}