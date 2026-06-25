import java.util.*;
public class longestswubstring{
    public static void main(String[]args){
        String str="abacdab";
        String current="";
        String longest="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            while(current.indexOf(ch)!=-1){
                current=current.substring(1);
            }current=current+ch;
            if(current.length()>longest.length()){
                longest=current;
            }                                                     
        }
System.out.println(longest);
    }
}                                                             