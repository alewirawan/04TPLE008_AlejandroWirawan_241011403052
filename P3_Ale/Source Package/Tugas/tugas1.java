package Tugas;

import javax.swing.JOptionPane;

public class tugas1 {
    public static void main(String[] args) {
        String nilai = "";
        String grade;

        nilai = JOptionPane.showInputDialog("Masukkan Nilai Anda : ");
        
        int nilai_convert = Integer.parseInt(nilai);
        
        if (nilai_convert <= 100 && nilai_convert >= 80){
            grade = "A";
            String msg = "Nilai Anda " + nilai + " Mendapat Grade " + grade;
            JOptionPane.showMessageDialog(null, msg);
        } else if (nilai_convert < 80 && nilai_convert >= 70){
            grade = "B";
            String msg = "Nilai Anda " + nilai + " Mendapat Grade " + grade;
            JOptionPane.showMessageDialog(null, msg);
        } else if (nilai_convert < 70 && nilai_convert >= 60){
            grade = "C";
            String msg = "Nilai Anda " + nilai + " Mendapat Grade " + grade;
            JOptionPane.showMessageDialog(null, msg);
        } else if (nilai_convert < 60 && nilai_convert >= 55){
            grade = "D";
            String msg = "Nilai Anda " + nilai + " Mendapat Grade " + grade;
            JOptionPane.showMessageDialog(null, msg);
        } else if (nilai_convert < 55){
            grade = "E";
            String msg = "Nilai Anda " + nilai + " Mendapat Grade " + grade;
            JOptionPane.showMessageDialog(null, msg);
        } 
        

    }
}
