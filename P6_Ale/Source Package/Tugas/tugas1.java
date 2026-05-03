package Tugas;

class Persegipanjang{
    private double panjang, lebar;

    public void setPanjang(double panjang){
        this.panjang = panjang;
    }
    public void setLebar(double lebar){
        this.lebar = lebar;
    }

    public double getPanjang(){
        return panjang;
    }
    public double getLebar(){
        return lebar;
    }
    public double getLuas(){
        return panjang * lebar;
    }
    public double getKeliling(){
        return 2 * (panjang + lebar);
    }
}

public class tugas1 {
    public static void main(String[] args) {
        Persegipanjang pp[] = new Persegipanjang[2];

        pp[0] = new Persegipanjang();
        pp[1] = new Persegipanjang();

        pp[0].setPanjang(10);
        pp[0].setLebar(5);

        pp[1].setPanjang(7);
        pp[1].setLebar(4);

        for(int i = 0; i < 2; i++){
            System.out.println("Persegi Panjang ke-" + (i+1));
            System.out.println("Panjang = " + pp[i].getPanjang());
            System.out.println("Lebar   = " + pp[i].getLebar());
            System.out.println("Luas    = " + pp[i].getLuas());
            System.out.println("Keliling= " + pp[i].getKeliling());
            System.out.println();
        }
    }
}
