package Polibia;
import java.util.Scanner;

public class MainP {
    public static void main(String[] args) {
        Enc enc = new Enc();
        Des des = new Des();

        Scanner sc = new Scanner(System.in);
        System.out.println("Input text: ");
        String text = sc.nextLine();
        System.out.println("               Method Polibiba               ");
        System.out.println("---------------------------------------------");
        String coded = enc.findInArr(text);
        System.out.println("Coded message: " + coded);

        String decoded = des.outString(coded);
        System.out.println("Encoded Message: " + decoded);
    }
}
