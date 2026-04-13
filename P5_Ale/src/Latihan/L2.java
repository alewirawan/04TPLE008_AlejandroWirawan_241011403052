/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

import java.util.Scanner;

/**
 *
 * @author alewi
 */
public class L2 {
        public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        float realisasi, kehadiran, tugas, uts, uas, nilai_akhir;
        float p_hadir, b_hadir, b_tugas, b_uts, b_uas;
        
        System.out.print("Masukkan Jumlah Realisasi: ");
        realisasi = input.nextFloat();
        System.out.print("Masukkan Jumlah Kehadiran: ");
        kehadiran = input.nextFloat();
        System.out.print("Masukkan Tugas: ");
        tugas = input.nextFloat();
        System.out.print("Masukkan UTS: ");
        uts = input.nextFloat();
        System.out.print("Masukkan UAS: ");
        uas = input.nextFloat();
        
        p_hadir = kehadiran/realisasi;
        b_hadir = p_hadir*10;
        b_tugas = (tugas*20)/100;
        b_uts = (uts*30)/100;
        b_uas = (uas*40)/100;
        nilai_akhir = b_hadir + b_tugas + b_uts + b_uas;
        
        System.out.println("---------------------------------------");
        System.out.println("---       Data Nilai Mahasiswa      ---");
        System.out.println("---------------------------------------");
        System.out.println("Realisasi   : " + realisasi + " Pertemuan");
        System.out.println("Kehadiran   : " + kehadiran);
        System.out.println("Tugas       : " + tugas);
        System.out.println("UTS         : " + uts);
        System.out.println("UAS         : " + uas);
        
        if (p_hadir >= 0.75) {
            if (nilai_akhir <= 100 && nilai_akhir >= 80){
                System.out.println("Nilai   : " + nilai_akhir + " | Grade A");
            } else if (nilai_akhir < 80 && nilai_akhir >= 70){
                System.out.println("Nilai   : " + nilai_akhir + " | Grade B");
            } else if (nilai_akhir < 70 && nilai_akhir >= 60){
                System.out.println("Nilai   : " + nilai_akhir + " | Grade C");
            } else if (nilai_akhir < 60 && nilai_akhir >= 55){
                System.out.println("Nilai   : " + nilai_akhir + " | Grade D");
            } else if (nilai_akhir < 55){
                System.out.println("Nilai   : " + nilai_akhir + " | Grade E");
            }
        } else {
            if (nilai_akhir >= 55){
                System.out.println("Nilai   : 55 | Grade D");
                System.out.println("Tidak Lulus");
            } else {
                System.out.println("Nilai   : " + nilai_akhir + " | Grade E");
                System.out.println("Tidak Lulus");
            }
        }
        System.out.println("---------------------------------------");
    }

}
