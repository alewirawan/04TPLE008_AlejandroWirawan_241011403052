package Tugas;

import java.text.NumberFormat;
import java.util.Scanner;

import javax.swing.text.NumberFormatter;

public class tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Uang Anda Saat Ini :  ");
        double uang = input.nextDouble();
        System.out.print("Masukkan Target Anda Saat Ini :  ");
        double target = input.nextDouble();

        float prcnttrgt = (float)uang/(float)target; 
        
        NumberFormat CurrFormatter = NumberFormat.getCurrencyInstance();
        NumberFormat PercentFormatter = NumberFormat.getPercentInstance();

        CurrFormatter.setMaximumIntegerDigits(10);
        PercentFormatter.setMaximumIntegerDigits(10);
            
        CurrFormatter.setMinimumIntegerDigits(1);
        PercentFormatter.setMinimumIntegerDigits(1);
                
        CurrFormatter.setMaximumFractionDigits(2);
        PercentFormatter.setMaximumFractionDigits(6);
        
        CurrFormatter.setMinimumFractionDigits(2);
        PercentFormatter.setMinimumFractionDigits(1);

        String CurrStr = CurrFormatter.format(uang);
        String CurrStrt = CurrFormatter.format(target);
        String PercentStr = PercentFormatter.format(prcnttrgt);

        System.out.println("Uang Anda Saat Ini dalam format currency : " + CurrStr);
        System.out.println("Target Anda Saat Ini dalam format currency : " + CurrStrt);
        System.out.println("Dana Terkumpul Saat Ini dalam format percent : " + PercentStr);
    }
}
