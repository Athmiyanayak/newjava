import java.util.*;
public class duplicatess{
    public static void main(String[]args){
        String str="Programming";
        String result="";
        
        for(int i=0;i<str.length();i++){
            if(result.indexOf(str.charAt(i))==-1){
                result=result+str.charAt(i);
            }
        }
        System.out.println(result);

    }
} 