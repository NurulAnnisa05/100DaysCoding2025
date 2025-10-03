public class Day26 {
    public static void main(String[] args) {
      //Operator penugasan (=)
        int a = 27;
        int b = 13;
        int c = a;  
        System.out.println("Setelah c = a, nilai c: " + c); 
        


     //Operator penugasan (+=)
        a += b;
        
        System.out.println("Setelah a += b, nilai a: " + a); 
        


        //  Operator Penugasan (-=)
        b -= 3;
        System.out.println("Setelah b -= 3, nilai b: " + b);
        


        //  Operator Penugasan (*=)
        
        c *= 2;
        
        System.out.println("Setelah c *= 2, nilai c: " + c); 
        


        //  Operator Penugasan (/=)
        c /= a;
        
        System.out.println("Setelah c /= a, nilai c: " + c); 
        


        //  Operator Penugasan (%=)
        
        a %= b;
        System.out.println("Setelah a %= b, nilai a: " + a); 
    }
}
