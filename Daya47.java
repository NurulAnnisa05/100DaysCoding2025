import java.util.Scanner;

public class Day47 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("--- Program Penentu Nama Hari ---");
        System.out.print("Masukkan angka hari (1=Minggu, 2=Senin, ..., 7=Sabtu): ");
        
        
        int angkaHari = input.nextInt();
        
        String namaHari;
        
        
        switch (angkaHari) {
            case 1:
                namaHari = "Minggu";
                break;
            case 2:
                namaHari = "Senin";
                break;
            case 3:
                namaHari = "Selasa";
                break;
            case 4:
                namaHari = "Rabu";
                break;
            case 5:
                namaHari = "Kamis";
                break;
            case 6:
                namaHari = "Jumat";
                break;
            case 7:
                namaHari = "Sabtu";
                break;
            default:
                namaHari = "Angka yang dimasukkan tidak valid (harus antara 1 sampai 7).";
                break;
        }
        
        System.out.println("Hari ke-" + angkaHari + " adalah: " + namaHari);
        
        
        input.close();
    }
}
