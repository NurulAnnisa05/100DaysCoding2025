public class Day43{
    public static void main(String[] args) {
        
        int batasAtas = 15;
        int i = 1;

        System.out.println("--- Program Cek Kelipatan 3, 5, dan Keduanya (Menggunakan WHILE) ---");

        
        while (i <= batasAtas) {
            System.out.print("Angka " + i + ": ");

           
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Kelipatan 3 dan 5 (FizzBuzz)");
            }
          
            else if (i % 3 == 0) {
                System.out.println("Kelipatan 3 (Fizz)");
            }
            
            else if (i % 5 == 0) {
                System.out.println("Kelipatan 5 (Buzz)");
            }
            
            else {
                System.out.println("Bukan kelipatan 3 atau 5");
            }

           
            i++;
        }
        System.out.println("-----------------------------------------------------------------");
    }
}
