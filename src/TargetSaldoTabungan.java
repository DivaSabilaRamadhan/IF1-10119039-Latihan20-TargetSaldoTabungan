/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diva Sabila Ramadhan
 * Nama  : Diva Sabila Ramadhan 
 * Kelas : IF1
 * NIM   : 10119039
 * Deskripsi Program : Menampilkan Target Saldo Tabungan
 */
public class TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    
    public static double bunga, jmlBunga;
    public static int targetSaldo, lama, saldoawal;
    public static double hitungBunga(double bunga, int saldo)
    {
        jmlBunga = bunga * saldo;
        return jmlBunga;
    }
    public static void tampilSaldo(double bunga, int saldo, int targetSaldo)
    {
        lama = 1;
        while(saldo < targetSaldo){
            saldo += hitungBunga(bunga,saldo);
            System.out.printf("Saldo di bulan ke-" + lama + "Rp.%,d%n",saldo);
            lama++;
        }
    }
    public static void main(String[] args) {
        tampilSaldo(0.08, 3500000, 6000000);
    }
    
}
