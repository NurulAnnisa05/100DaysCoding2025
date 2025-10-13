public class Day36 {
    public static void main(String[] args) {
        int nilaiUjian = 85;
        int nilaiTugas = 70;

       
        if (nilaiUjian >= 75) {
            System.out.println("Nilai Ujian Lulus. (>= 75)");

          
            if (nilaiTugas >= 60) {
                System.out.println("Nilai Tugas juga Lulus. (>= 60)");
                System.out.println("SELAMAT! Kedua syarat terpenuhi.");
            } else {
                System.out.println("Namun, Nilai Tugas Belum Lulus. (< 60)");
                System.out.println("Perlu perbaikan tugas.");
            }
        } else {
            System.out.println("Nilai Ujian Belum Lulus. (< 75)");
            System.out.println("Perlu remedial ujian.");
        }
    }
}
