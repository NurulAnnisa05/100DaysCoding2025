import java.util.Scanner; 

public class Day23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double panjang;
        double lebar;
        double luas;       System.out.print("Masukkan nilai Panjang: ");
        panjang = scanner.nextDouble();              System.out.print("Masukkan nilai Lebar: ");
        lebar = scanner.nextDouble();       
        luas = panjang * lebar; System.out.println("--------------------------------");
        System.out.println("Panjang = " + panjang);      System.out.println("Lebar   = " + lebar);     System.out.println("Luas Persegi Panjang = " + luas);
        scanner.close();
    }
}
