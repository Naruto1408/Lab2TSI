package Gronsfeld;
import java.util.Scanner;

public class MainG {
    public static void main(String[] args) {
        Gronsfeld gronsfeld = new Gronsfeld();

        Scanner sc = new Scanner(System.in);
        System.out.println("Input key: ");
        String key = sc.nextLine();

        System.out.println("Input text: ");
        String text = sc.nextLine();

        System.out.println("               Method Gronsfeld              ");
        System.out.println("---------------------------------------------");
        String crypted = gronsfeld.crypt(text, key);
        System.out.println("Coded message: " + crypted);
        String decrypted = gronsfeld.decrypt(crypted, key);
        System.out.println("Decoded message: " + decrypted);
    }
}
