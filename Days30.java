public class Day30 {
    public static void main(String[] args) {
        
        int nilaiA = 25;
        int nilaiB = 20;
        int nilaiC = 25;

        
        boolean hasil;

        System.out.println("Nilai A = " + nilaiA);
        System.out.println("Nilai B = " + nilaiB);
        System.out.println("Nilai C = " + nilaiC);
        System.out.println("------------------------------------");

        // Operator Kurang Dari atau Sama Dengan (<=)
        System.out.println("--- Operator <= (Kurang dari atau Sama dengan) ---");

       
        hasil = nilaiA <= nilaiB;
        
        System.out.println("A <= B: " + hasil);

        
        hasil = nilaiB <= nilaiA;
        
        System.out.println("B <= A: " + hasil);

        
        hasil = nilaiA <= nilaiC;
        
        System.out.println("A <= C: " + hasil);

        System.out.println("\n------------------------------------");

        // Operator Lebih Dari atau Sama Dengan (>=)
        System.out.println("--- Operator >= (Lebih dari atau Sama dengan) ---");

        
        hasil = nilaiA >= nilaiB;
        
        System.out.println("A >= B: " + hasil);

        
        hasil = nilaiB >= nilaiA;
       
        System.out.println("B >= A: " + hasil);

       
        hasil = nilaiA >= nilaiC;
        
        System.out.println("A >= C: " + hasil);
    }
}
