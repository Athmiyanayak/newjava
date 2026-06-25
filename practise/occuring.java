import java.util.*;
public class occuring{
    public static void main(String[]args){
        String s="programmming";
        int maxcount=0;
       char maxChar=' ';
        for(int i=0;i<s.length();i++){
            int count=1;
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                }
            }boolean found=false;
            for(int k=0;k<i;k++){
                if(s.charAt(i)==s.charAt(k)){
                    found=true;
                    break;
                }
            }
            if(!found){
                System.out.println(s.charAt(i) + ": " + count);
                if(count>maxcount){
                    maxcount=count;
                    maxChar=s.charAt(i);
                }
            }
        }System.out.println(maxcount+" "+maxChar);
    }
}