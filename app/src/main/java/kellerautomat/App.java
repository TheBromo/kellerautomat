/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package kellerautomat;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter UPN:");
        var input = scanner.nextLine();
        System.out.println("Stepmodus?");
        var modus = scanner.nextBoolean();

        int result = new App().run(input, modus);
        System.out.println("==================================");
        System.out.println("        RESULT: " + result);
        System.out.println("==================================");
    }

    public int run(String input, boolean stepmodus) {
        if (input.isEmpty()) {
            throw new IllegalArgumentException("string is empty");
        }

        List<Symbol> tokens = Arrays.stream(input.split("\\s")).map(Symbol::parseSymbol).toList();

        Modes modus;
        if (stepmodus) {
            modus = new Stepmodus(tokens);
        } else {
            modus = new Laufmodus(tokens);
        }

        return modus.doCalculation();
    }
}
