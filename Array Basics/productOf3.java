/*
Maximum product of a triplet (subsequence of size 3) in array
Last Updated : 12 Feb, 2025
Given an integer array, find a maximum product of a triplet in the array.

Examples: 

Input:  arr[ ] = [10, 3, 5, 6, 20]
Output: 1200
Explanation: Multiplication of 10, 6 and 20

Input:  arr[ ] =  [-10, -3, -5, -6, -20]
Output: -90

Input: arr[ ] =  [1, -4, 3, -6, 7, 0]
Output: 168*/
import java.util.*;
public class productOf3{
    public static void main(String[]args){
int arr[]={1,2,3,4,5,6,7,8};
int n=arr.length;
Arrays.sort(arr);
int maximum=Integer.MIN_VALUE;
for(int i=0;i<n-2;i++){
    for(int j=i+1;j<n-1;j++){
        for(int k=j+1;k<n;k++){
            int product=arr[i]*arr[j]*arr[k];
            maximum=Math.max(maximum,product);
        }
    }
}System.out.println(maximum);
    }
}