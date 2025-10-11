public class Day34 {

    public static void main(String[] args) {
        int nilaiA = 20;
        int nilaiB = 5;

       
        // Langkah 1: nilaiB++ (nilaiB = 6, tapi di dalam ekspresi masih 5)
        // Langkah 2: (nilaiB++ * 2) = (5 * 2) = 10
        // Langkah 3: nilaiA %= 10 (nilaiA = 20 % 10) = 0
        
        boolean hasilCek = (nilaiA %= (nilaiB++ * 2)) == 0; 
     

        String status = hasilCek ? "LULUS" : "GAGAL";

        System.out.println("Nilai A akhir: " + nilaiA);     
        System.out.println("Nilai B akhir: " + nilaiB);     
        System.out.println("Hasil Cek (True/False): " + hasilCek);
        System.out.println("Status: " + status);          
    }
}
