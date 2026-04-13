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
public class L1 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        float kehadiran, nilai_akhir;
        float p_hadir;
        
        System.out.print("Masukkan Jumlah Kehadiran : ");
        kehadiran = input.nextInt();
        System.out.print("Masukkan Nilai Akhir : ");
        nilai_akhir = input.nextInt();
        
        p_hadir = kehadiran/21;
        
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
    }
}
