public class Day29 {

    public static void main(String[] args) {
        int nilaiSiswa = 85;
        int nilaiTarget = 70;
        int batasBawah = 60;

        // Penggunaan Operator > (Lebih Dari) 

  
        boolean lulusTarget = nilaiSiswa > nilaiTarget;
        
        System.out.println("Nilai Siswa: " + nilaiSiswa);
        System.out.println("Nilai Target Kelulusan: " + nilaiTarget);
        System.out.println("Apakah nilai siswa lebih dari target? (nilaiSiswa > nilaiTarget) -> " + lulusTarget); 
       

        // Penggunaan Operator < (Kurang Dari)

       
        
        boolean diBawahBatas = nilaiSiswa < batasBawah;

        System.out.println("Batas Nilai Terbawah: " + batasBawah);
        System.out.println("Apakah nilai siswa kurang dari batas bawah? (nilaiSiswa < batasBawah) -> " + diBawahBatas);
        
      

       
    }
}
