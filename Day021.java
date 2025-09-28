public class Day21 {
    public static void main(String[] args) {
        int a = 26;
        int b = 13;
        
        System.out.printf("Sebelum ditukar: a =%d,b=%d\n" ,a,b);
        
        
        a = a+b;        
        b = a-b;
        a = a-b;
        
        System.out.printf("Setelah ditukar: a =%d,b=%d\n",a,b );
    }
}
