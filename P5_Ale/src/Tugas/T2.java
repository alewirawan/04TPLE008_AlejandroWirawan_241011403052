/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

import java.util.Scanner;

/**
 *
 * @author alewi
 */
public class T2 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        
        int kehadiran, tugas;
        
        System.out.print("Masukkan Presentase Kehadiran : ");
        kehadiran = input.nextInt();
        System.out.print("Masukkan Nilai Tugas          : ");
        tugas = input.nextInt();
        
        if (kehadiran >= 75){
            if (tugas >= 70){
                System.out.println("Selamat, Anda Dapat Mengikuti Ujian");
            } else {
                System.out.println("Nilai Tugas Anda Kurang, Silakan Revisi Terlebih Dahulu");
            }
        } else {
            if (tugas >= 70){
                System.out.println("Presentase Kehadiran Anda Kurang, Tidak Dapat Mengikuti Ujian");
            } else {
                System.out.println("Anda Tidak Memenuhi Syarat Ujian");
            }
            
        }
        
    }
}
