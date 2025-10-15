import java.util.Scanner;

public class Day38 {
    
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int bilangan;
        System.out.println("masukkan sebuah bilangan bulat:");
        bilangan=input.nextInt();
        if (bilangan >0) {
            System.out.println("bilangan"+bilangan + "adalah bilangan positif.");
        } else if (bilangan <0) {
            System.out.println("bilangan"+bilangan +"adalah bilangan negatif.");
        } else{ 
            System.out.println("bilangan"+bilangan+"adalah nol");
            input.close();
        }
                    
   
}
            
        }
