public class Day31 {
    public static void main(String[] args) {
        
        int nilaiUjian = 85;
        int nilaiAbsensi = 90;

        
        boolean lulusUjian = (nilaiUjian >= 80); 
        boolean kehadiranCukup = (nilaiAbsensi > 75); 

        
        
        boolean lulusTotal = lulusUjian && kehadiranCukup;

        
        System.out.println("Nilai Ujian: " + nilaiUjian);
        System.out.println("Nilai Absensi: " + nilaiAbsensi);
        System.out.println("Kondisi Lulus Ujian (>= 80): " + lulusUjian);
        System.out.println("Kondisi Kehadiran Cukup (> 75): " + kehadiranCukup);
        System.out.println("Hasil Lulus Total (lulusUjian && kehadiranCukup): " + lulusTotal);

        System.out.println("---");

        
       
    }
}
