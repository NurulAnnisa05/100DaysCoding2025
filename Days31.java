public class Day31 {

    public static void main(String[] args) {
        boolean kondisi1 = true;
        boolean kondisi2 = false;
        boolean kondisi3 = true;
        boolean kondisi4 = false;

        
        boolean hasil1 = kondisi1 || kondisi2;

       
        boolean hasil2 = kondisi1 || kondisi3;

       
        boolean hasil3 = kondisi2 || kondisi4;

        
        boolean hasil4 = kondisi4 || kondisi3;

        System.out.println("Hasil 1 (true || false): " + hasil1);
        System.out.println("Hasil 2 (true || true): " + hasil2);
        System.out.println("Hasil 3 (false || false): " + hasil3);
        System.out.println("Hasil 4 (false || true): " + hasil4);

        
    }
}
