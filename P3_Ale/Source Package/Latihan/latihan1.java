package Latihan;

import javax.swing.JOptionPane;

public class latihan1 {
    public static void main(String[] args) {
        String nama = "";

        nama = JOptionPane.showInputDialog("Ketik Nama Anda : ");
        String msg = "Hello " + nama + "\nLanjutkan Belajarnya Pasti Menjadi Programmer Java !";
        JOptionPane.showMessageDialog(null, msg);
    }
    
}
