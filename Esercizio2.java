import java.util.Scanner;

public class Esercizio2 {

    public static void main(String[] args) {
        Scanner testScanner= new Scanner(System.in);
        System.out.print("Inserisci il tuo nome:");
        String name= testScanner.nextLine();
        System.out.print("User:"+ name);
        int age= Integer.parseInt(testScanner.nextLine());
        System.out.print("Age:"+ age);
    }
}
