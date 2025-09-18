public class Day11 {

    
    public static void main(String[] args) {
      //membuat objek scanner untuk menerima input dara keyboard
         Scanner scanner =new Scanner( System.in); 
       //meminta memasukkan nama
       System.out.println(" masukkan nama: ");
        String nama= scanner.nextLine();//membaca satu baris teks (string)
        // meminta memasukkan umur
        System.out.println("masukkan umur anda:");
        int umur= scanner.nextInt();// membaca sebuah bilangan bulat(integer)
        //menampilkan data yang telah dimasukkan
         System.out.println(" \nHallo," + nama + "!");
        String usia;
         System.out.println(" usia saya adalah " + umur + " tahun.");
       
    }
    
}
