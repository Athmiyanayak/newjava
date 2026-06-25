import java.util.*;
public class wordcount{
    public static void main(String[]args){
        String s="hello everyone hello";
        int count=1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                count++;
            }
        }
        System.out.println("Number of words: " + count);
    }
}