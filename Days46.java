import java.util.Scanner;

public class Day46 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int pilihan;

        System.out.println("=== Menu Makanan & Minuman ===");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Mie Ayam");
        System.out.println("3. Es Jeruk");
        System.out.println("4. Kopi Susu");
        System.out.println("==============================");
        System.out.print("Masukkan pilihan Anda (1-4): ");

        
        pilihan = input.nextInt();

        
        switch (pilihan) {
            case 1:
                System.out.println("Anda memilih Nasi Goreng. Pesanan sedang disiapkan.");
                break;
            case 2:
                System.out.println("Anda memilih Mie Ayam. Pesanan sedang disiapkan.");
                break;
            case 3:
                System.out.println("Anda memilih Es Jeruk. Pesanan sedang disiapkan.");
                break;
            case 4:
                System.out.println("Anda memilih Kopi Susu. Pesanan sedang disiapkan.");
                break;
            default:
                System.out.println("Pilihan tidak valid. Silakan masukkan angka 1 sampai 4.");
        }

        
        input.close();
        System.out.println("\nTerima kasih atas kunjungannya!");
    }
}
