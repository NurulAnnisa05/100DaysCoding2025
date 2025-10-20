public class Day43 {
    public static void main(String[] args) {
    
        int angkaCek = 15; 

        System.out.println("--- Program Cek Kelipatan untuk Angka Tunggal ---");
        System.out.println("Angka yang dicek: " + angkaCek);


        
        
        if (angkaCek % 3 == 0 && angkaCek % 5 == 0) {
            System.out.println("Hasil: Kelipatan 3 dan 5 (FizzBuzz)");
        } 
        
        else if (angkaCek % 3 == 0) {
            System.out.println("Hasil: Kelipatan 3 (Fizz)");
        } 
        
        else if (angkaCek % 5 == 0) {
            System.out.println("Hasil: Kelipatan 5 (Buzz)");
        } 
        
        else {
            System.out.println("Hasil: Bukan kelipatan 3 atau 5");
        }
        
        System.out.println("------------------------------------------------");
    }
}
