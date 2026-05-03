package Tugas;

interface BangunDatar {
    double hitungLuas();
    double hitungKeliling();
}

class Persegi implements BangunDatar{
    double sisi;

    public Persegi(double sisi){
        this.sisi = sisi;
    }
    public double hitungLuas(){
        return sisi * sisi;
    }
    public double hitungKeliling(){
        return 4 * sisi;
    }
}

public class tugas2 {
    public static void main(String[] args) {
        Persegi p = new Persegi(5);

        System.out.println("Persegi :");
        System.out.println("Luas    : " + p.hitungLuas());
        System.out.println("Keliling: " + p.hitungKeliling());
    }
}
