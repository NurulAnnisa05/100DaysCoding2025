import java.util.Scanner; 

public class Day22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        System.out.println(" Program Hitung Luas Persegi ");
        System.out.print("Masukkan panjang sisi (dalam cm): ");
        
        double sisi = scanner.nextDouble(); 

        double luas = sisi * sisi;
        System.out.println("\n");
        System.out.println("Panjang sisi yang dimasukkan: " + sisi + " cm");
        System.out.println("Luas Persegi adalah: " + luas + " cm persegi");
       
        scanner.close(); 
    }
}
