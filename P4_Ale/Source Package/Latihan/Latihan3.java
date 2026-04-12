package Latihan;

public class Latihan3 {
    public static void main(String[] args) {
        float makan, transport, belanja, total;
        float diskon, harga_akhir;
        makan = 35000;
        transport = 20000;
        belanja = 45000;
        total = makan + belanja + transport;
        diskon = total*10/100;
        harga_akhir = total - diskon;

        System.out.println("---------------------------------");
        System.out.println("--    Pengeluaran Mahasiswa    --");
        System.out.println("---------------------------------");
        System.out.println("Makan               : Rp." + makan);
        System.out.println("Transport           : Rp." + transport);
        System.out.println("Belanja             : Rp." + belanja);
        System.out.println("--------------------------------");
        System.out.println("Total Pengeluaran   : Rp." + total);
        System.out.println("Diskon              : Rp." + diskon);
        System.out.println("Total Setelah Diskon: Rp." + harga_akhir);

        
    }
}
