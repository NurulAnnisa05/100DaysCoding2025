import java.util.Scanner;

public class Day22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sisi;
System.out.print("Masukkan panjang sisi persegi: ");
if (input.hasNextDouble()) {
            sisi = input.nextDouble();
        if (sisi > 10) {
               double luas = sisi * sisi;            System.out.println("Panjang sisi: " + sisi);               System.out.println("Luas persegi adalah: " + luas);
            } else {
           System.out.println("Panjang sisi harus angka positif.");
            }
        } else {
            System.out.println("Input tidak valid. Harap masukkan angka.");
        }
        
        input.close();
    }
}
