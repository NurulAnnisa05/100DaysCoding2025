import java.util.Scanner;

public class Day48 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char operator;
        Double angka1, angka2, hasil;

       

        System.out.println("Pilih operator: +, -, *, atau /");
        operator = input.next().charAt(0); 

       
        System.out.println("Masukkan angka pertama:");
        angka1 = input.nextDouble();

        System.out.println("Masukkan angka kedua:");
        angka2 = input.nextDouble();

        
        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                System.out.println(angka1 + " + " + angka2 + " = " + hasil);
                break; 

            case '-':
                hasil = angka1 - angka2;
                System.out.println(angka1 + " - " + angka2 + " = " + hasil);
                break;

            case '*':
                hasil = angka1 * angka2;
                System.out.println(angka1 + " * " + angka2 + " = " + hasil);
                break;

            case '/':
                
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                    System.out.println(angka1 + " / " + angka2 + " = " + hasil);
                } else {
                    System.out.println("Error! Pembagian dengan nol tidak diizinkan.");
                }
                break;

            default:
                
                System.out.println("Operator tidak valid!");
                break;
        }

        input.close(); 
    }
}
