import java.util.*;
public class Duplicates{
    public static void main(String[]args){
        String s="athmiya";
        String result="";
        for(int i=0;i<s.length();i++){
            if(result.indexOf(s.charAt(i))==-1){
                result+=s.charAt(i);
            }
        }
        System.out.println(result);
    }
}