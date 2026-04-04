package Tugas;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        System.out.println("Program Konversi Hari Menjadi Minggu");
        
        Scanner input = new Scanner(System.in);
        int hari;
        int minggu;
        int sisa;
        
        System.out.print("Input Jumlah Hari: ");
        hari = input.nextInt();

        minggu = hari/7;
        sisa = hari%7;

        System.out.println("Hasil Koversi :");
        System.out.print(minggu + " minggu " + sisa + " hari");
        input.close();
    }
}
