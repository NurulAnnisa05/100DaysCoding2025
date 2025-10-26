public class Day49 {
    public static void main(String[] args) {
        int angka = 7;
        String hasil;

         
        hasil = (angka % 2 == 0) ? "Genap" : "Ganjil";

        System.out.println("Angka " + angka + " adalah: " + hasil);
        
        
        int angka2 = 10;
        String hasil2 = (angka2 % 2 == 0) ? "Genap" : "Ganjil";
        
        System.out.println("Angka " + angka2 + " adalah: " + hasil2);
    }
}
