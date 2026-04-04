package Tugas;

import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        System.out.println("Program Membandingkan 2 Angka");
        Scanner input = new Scanner(System.in);
        int angka1;
        int angka2;

        System.out.print("Masukkan Angka Pertama : ");
        angka1 = input.nextInt();

        System.out.print("Masukkan Angka Kedua : ");
        angka2 = input.nextInt();

        if (angka1 < angka2) {
            System.out.println(angka1 + " Lebih Kecil Dari " + angka2);
        } else if (angka1 == angka2) {
            System.out.println(angka1 + " Sama Dengan " + angka2);
        } else {
            System.out.println(angka1 + " Lebih Besar Dari " + angka2);
        }

    }
    
}
