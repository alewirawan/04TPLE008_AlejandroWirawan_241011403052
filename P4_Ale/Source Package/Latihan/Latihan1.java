package Latihan;

import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float realisasi, kehadiran, tugas, uts, uas, total;
        float b_kehadiran, b_tugas, b_uts, b_uas;

        System.out.print("Masukkan Realisasi: ");
        realisasi = input.nextFloat();
        System.out.print("Masukkan Kehadiran: ");
        kehadiran = input.nextFloat();
        System.out.print("Masukkan Tugas: ");
        tugas = input.nextFloat();
        System.out.print("Masukkan UTS: ");
        uts = input.nextFloat();
        System.out.print("Masukkan UAS: ");
        uas = input.nextFloat();
        
        b_kehadiran = (kehadiran/realisasi)*10;
        b_tugas = (tugas*20)/100;
        b_uts = (uts*30)/100;
        b_uas = (uas*40)/100;
        total = b_kehadiran + b_tugas + b_uts + b_uas;

        System.out.println("---------------------------------------");
        System.out.println("---       Data Nilai Mahasiswa      ---");
        System.out.println("---------------------------------------");
        System.out.println("Realisasi   : " + realisasi + " Pertemuan");
        System.out.println("Kehadiran   : " + kehadiran);
        System.out.println("Tugas       : " + tugas);
        System.out.println("UTS         : " + uts);
        System.out.println("UAS         : " + uas);
        System.out.println("Total       : " + total);
        System.out.println("---------------------------------------");
    }
}
