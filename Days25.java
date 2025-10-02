public class Day25 {
    public static void main(String[] args) {
        int a = 6;
        int b = 13;
        

        int c = a++; 
        
   
        int d = b--; 
        
        System.out.println("--- POST-FIX (a++ dan b--) ---");
        System.out.println("Nilai a: " + a); 
        System.out.println("Nilai c: " + c); 
        System.out.println("Nilai b: " + b); 
        System.out.println("Nilai d: " + d); 
        
        System.out.println("\n------------------------------\n");
        
        int x = 5;
        int y = 10;
        
     
        int z = ++x;
        
       
        int w = --y;
        
        System.out.println("--- PRE-FIX (++x dan --y) ---");
        System.out.println("Nilai x: " + x); 
        System.out.println("Nilai z: " + z); 
        System.out.println("Nilai y: " + y); 
        System.out.println("Nilai w: " + w); 
    }
}
