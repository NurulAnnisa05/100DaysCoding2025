public class Day28 {

    
    public static void main(String[] args) {
       int nilaiPertama=13;
       int nilaiKedua=5;
       int nilaiKetiga=13;
       
        System.out.println("nilai pertama (a)="+nilaiPertama);
        System.out.println("nilai kedua (b)="+nilaiKedua);
        System.out.println("nilai ketiga (c)="+nilaiKetiga);
       //penggunaan == 
       boolean hasilSama1=(nilaiPertama==nilaiKedua);
        System.out.println("apakah a==b?(13==5)->"+hasilSama1);
        boolean hasilSama2=(nilaiPertama==nilaiKetiga);
        System.out.println("apakah a==c?(13==13->"+hasilSama2);
        //penggunaan !=
        boolean hasilBeda1=(nilaiPertama != nilaiKedua);
        System.out.println(" apakah a!=b?(13!=5)->"+hasilBeda1);
        boolean hasilBeda2=(nilaiPertama!=nilaiKetiga);
        System.out.println(" apakah a!=c?(13!=13)->"+hasilBeda2);
        
       
    }
    
}
