import java.util.Scanner;

public class Day39 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int pilihan;
        System.out.println("===pilihan sarapan===");
        System.out.println("1. nasi goreng");
        System.out.println("2. bubur ayam");
        System.out.println("3. roti panggang");
        System.out.println("masukkan nomor pilihan anda:");
        pilihan=input.nextInt();
        if (pilihan==1) {
            System.out.println("anda memilih nasi goreng, selamat menikmati!");
        }else if (pilihan==2) {
            System.out.println("anda memilih bubur ayam. pilihan yang lezat!");
        } else if (pilihan==3) {
            System.out.println("anda memilih roti panggang, ringan dan cepat!");
        } else {
            System.out.println("pilihan tidak valid. silahkan coba lagi");
            input.close();
   
}
   
}
            
        }
