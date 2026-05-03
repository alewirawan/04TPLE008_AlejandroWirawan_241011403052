package Tugas;

abstract class Kendaraan{
    public void nyalakanMesin(){
        System.out.println("Mesin dinyalakan...");
    }
    public abstract void berjalan();
}

class Mobil extends Kendaraan{
    public void berjalan(){
        System.out.println("Mobil Berjalan Dengan 4 Roda");
    }
}

class Motor extends Kendaraan{
    public void berjalan(){
        System.out.println("Motor Berjalan Dengan 2 Roda");
    }
}

public class tugas1 {
    public static void main(String[] args) {
        Mobil mobil = new Mobil();
        Motor motor = new Motor();

        System.out.println("Mobil   :");
        mobil.nyalakanMesin();
        mobil.berjalan();
        
        System.out.println();
        
        System.out.println("Motor   :");
        motor.nyalakanMesin();
        motor.berjalan();
    }
}
