package Latihan;

import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float makan, transport, belanja, total;
        float p_makan, p_transport, p_belanja;
        
        System.out.print("Masukkan Biaya Makan: ");
        makan = input.nextFloat();
        System.out.print("Masukkan Biaya Transport: ");
        transport = input.nextFloat();
        System.out.print("Masukkan Biaya Belanja: ");
        belanja = input.nextFloat();

        total = makan + transport + belanja;
        p_makan = (makan/total)*100;
        p_transport = (transport/total)*100;
        p_belanja = (belanja/total)*100;

        System.out.println("-------------------------------");
        System.out.println("---     Data Pengeluaran     --");
        System.out.println("-------------------------------");
        System.out.println("Biaya Makan         : " + makan);
        System.out.println("Biaya Transport     : " + transport);
        System.out.println("Biaya Belanja       : " + belanja);
        System.out.println("-------------------------------");
        System.out.println("Total Pengeluaran   : " + total);
        System.out.println("-------------------------------");
        System.out.println("--  Presentase Pengeluaran   --");
        System.out.println("-------------------------------");
        System.out.println("Makan       : " + p_makan + " %");
        System.out.println("Transport   : " + p_transport + " %");
        System.out.println("Belanja     : " + p_belanja + " %");
        System.out.println("-------------------------------");
    }
    
}
