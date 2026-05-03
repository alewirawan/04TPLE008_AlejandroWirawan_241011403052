package Tugas;

class mahasiswa{
    private String nama, nim;
    private double tugas, uts, uas;

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setNim(String nim){
        this.nim = nim;
    }

    public void setNilai(double tugas, double uts, double uas){
        this.tugas = tugas;
        this.uts = uts;
        this.uas = uas;
    }

    public String getNama(){
        return nama;
    }

    public String getNim(){
        return nim;
    }

    public double getRataRata(){
        return (tugas + uts + uas)/3;
    }

    public void tampilData(){
        System.out.println("Nama            : " + nama);
        System.out.println("NIM             : " + nim);
    }

    public void tampilData(double rata){
        System.out.println("Rata-rata Nilai :  " + rata);
    }
}
public class tugas2 {
    public static void main(String[] args) {
        mahasiswa m1 = new mahasiswa();
        mahasiswa m2 = new mahasiswa();

        m1.setNama("Andi");
        m1.setNim("12345");
        m1.setNilai(80, 85,90);
        
        m2.setNama("Budi");
        m2.setNim("67890");
        m2.setNilai(75, 70, 80);

        System.out.println("Data Mahasiswa 1:");
        m1.tampilData();
        m1.tampilData(m1.getRataRata());
        System.out.println();

        System.out.println("Data Mahasiswa 2:");
        m2.tampilData();
        m2.tampilData(m2.getRataRata());
    }
}
