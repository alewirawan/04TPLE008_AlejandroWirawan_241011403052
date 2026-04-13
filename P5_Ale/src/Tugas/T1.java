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
public class T1 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int angka;
        
        System.out.print("Masukkan Angka    : ");
        
        if (input.hasNextInt()){
            angka = input.nextInt();
            if (angka%2 == 0){
                System.out.println("Angka " + angka + " adalah Bilangan Genap");
            } else{
                System.out.println("Angka " + angka + " adalah Bilangan Ganjil");
            }
        } else {
                System.out.println("Input Harus Bilangan Bulat !");
        }
    }
}
