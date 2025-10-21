import java.util.Scanner;

public class Day44 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan nilai (0-100): ");
        int nilai = scan.nextInt();
        String predikat;

        if (nilai >= 90) {
            predikat = "A";
        } else if (nilai >= 80) {
            predikat = "B";
        } else if (nilai >= 70) {
            predikat = "C";
        } else if (nilai >= 60) {
            predikat = "D";
        } else if (nilai >= 0) {
            predikat = "E";
        } else {
            predikat = "Nilai Tidak Valid";
        }

        System.out.println("Predikat Anda: " + predikat);
        scan.close();
    }
}
