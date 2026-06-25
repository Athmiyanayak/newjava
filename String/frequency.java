import java.util.*;
public class frequency{
    public static void main(String[]args){
        String s="athmiya";
        for(int i=0;i<s.length();i++){
           int count=1;
           for(int j=i+1;j<s.length();j++){
            if(s.charAt(i)==s.charAt(j)){
                count++;
            }
           }boolean found=false;
           for(int k=0;k<i;k++){
            if(s.charAt(k)==s.charAt(i)){
                found=true;
                break;
            }
           }
           if(!found){
            System.out.println(s.charAt(i)+" : "+count);
           }
        }
    }
}