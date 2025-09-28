public class Day21 {
    public static void main(String[] args) {
        int a = 26;
        int b = 13;
        
        System.out.println("Sebelum ditukar: a = " + a + ", b = " + b);
        
   
        a = b;        
        b = a;
        
        System.out.println("Setelah ditukar: a = " + a + ", b = " + b);
    }
}
