import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        NumberFormat fr = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat in = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat usa = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat ch = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String us = usa.format(payment);
        String india = in.format(payment);
        String china = ch.format(payment);
        String france = fr.format(payment);
            
        
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}

