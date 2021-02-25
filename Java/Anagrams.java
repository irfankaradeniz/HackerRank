import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        String x = a.toLowerCase();
        String y = b.toLowerCase();
        char[] aCh = x.toCharArray(); 
        char[] bCh = y.toCharArray();
        
        for(int i=0;i<aCh.length;i++){
            for(int j=i+1;j<aCh.length;j++){
                if (aCh[j] < aCh[i]) {
                    char temp = aCh[i];
                    aCh[i]=aCh[j];
                    aCh[j]=temp;
                }
            }
        }
        
        for(int i=0;i<bCh.length;i++){
            for(int j=i+1;j<bCh.length;j++){
                if (bCh[j] < bCh[i]) {
                    char temp = bCh[i];
                    bCh[i]=bCh[j];
                    bCh[j]=temp;
                }
            }
        }
 
        if (aCh.length != bCh.length)
            return false;

        
        for (int i = 0; i < aCh.length; i++)
            if (aCh[i] != bCh[i])
                return false;
 
        return true;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
