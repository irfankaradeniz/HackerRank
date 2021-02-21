import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String newString = "";
      
        for(int j = A.length()-1; j>=0; j--){
            newString = newString + A.charAt(j);
        } 
        if(A.equals(newString)){
            System.out.println("Yes");
        } else{System.out.println("No");
        }
    }
}



