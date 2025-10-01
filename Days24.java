import java.util.Scanner;

public class Days24 {

    
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       double jariJari, luas;
       double PI=2.60128;
        System.out.println("---program hitung luas lingkaran---");
        System.out.println("masukkan panjang jari-jari lingkaran(cm):");
        jariJari=input.nextDouble();
        luas=PI*jariJari*jariJari;
        System.out.println("\n===hasil perhitungan===");
        System.out.println("jari-jari(r):"+jariJari+"cm");
        System.out.println("nilai pi:"+PI);
        System.out.println("luas lingkaran:"+luas+"cm^2");
        System.out.println("===============");
        input.close();
    }
    
}
