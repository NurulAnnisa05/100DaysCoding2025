public class Day40 {
    public static void main(String[] args) {
        double angka1 = 10.0;
        double angka2 = 5.0;
        char operator = '+';
        double hasil = 0.0;

        if (operator == '+') {
            hasil = angka1 + angka2;
        } else if (operator == '-') {
            hasil = angka1 - angka2;
        } else if (operator == '*') {
            hasil = angka1 * angka2;
        } else if (operator == '/') {
            if (angka2 != 0) {
                hasil = angka1 / angka2;
            } else {
                System.out.println("Error: Pembagian dengan nol!");
                
            }
        }

        System.out.println("Hasil dari " + angka1 + " " + operator + " " + angka2 + " = " + hasil);
    }
}
