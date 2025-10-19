import java.util.Scanner;

public class Day42 {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        
        final double PERSEN_PAJAK = 0.05; 

        
        System.out.print("Masukkan Gaji Pokok (Rp): ");
        double gajiPokok = input.nextDouble();

       
        System.out.print("Masukkan Potongan Lain-lain (Rp): ");
        double potonganLain = input.nextDouble();

       
        double potonganPajak = gajiPokok * PERSEN_PAJAK;
        double totalPotongan = potonganPajak + potonganLain;
        double gajiBersih = gajiPokok - totalPotongan;

        System.out.println("\n--- Hasil Perhitungan ---");
        System.out.println("Gaji Pokok         : Rp " + gajiPokok);
        System.out.println("Potongan Pajak (5%): Rp " + potonganPajak);
        System.out.println("Total Potongan     : Rp " + totalPotongan);
        System.out.println("---------------------------");
        System.out.println("Gaji Bersih (NET)  : Rp " + gajiBersih);
        
        input.close();
    }
}
