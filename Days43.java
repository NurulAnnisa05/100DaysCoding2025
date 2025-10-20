import java.util.Scanner; 

public class Day43 {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);

        System.out.println("--- Program Cek Kelipatan 3, 5, dan Keduanya (Angka Tunggal) ---");
        System.out.print("Masukkan satu bilangan bulat: ");

        
        int angkaCek = input.nextInt();

        System.out.println("\nHasil Pengecekan Angka " + angkaCek + ":");

        
        if (angkaCek % 3 == 0 && angkaCek % 5 == 0) {
            System.out.println("-> Kelipatan 3 dan 5 (FizzBuzz)");
        } 
        
        else if (angkaCek % 3 == 0) {
            System.out.println("-> Kelipatan 3 (Fizz)");
        } 
        
        else if (angkaCek % 5 == 0) {
            System.out.println("-> Kelipatan 5 (Buzz)");
        } 
    
        else {
            System.out.println("-> Bukan kelipatan 3 atau 5");
        }
        
        System.out.println("------------------------------------------------------------------");
    }
}
