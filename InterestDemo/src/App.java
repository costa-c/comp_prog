import java.util.Scanner;

/**
 * This class implements a simple program that
 * will compute the amount of interest that is
 * earned on an invested at an certain interest
 * rate for one year. The interest and
 * the value of the investment after one year are
 * printed to standard output.
 * User must input: investiment and annual rate
 */

public class App {
    public static void main(String[] args) {
        double principal; // The value of the investment.
        double rate; // The annual interest rate.
        double interest; // The interest earned during the year.

        Scanner stdin = new Scanner(System.in); // Create the Scanner.

        System.out.println("Investimento após um ano");
        System.out.print("                 Investimento inicial: ");
        principal = stdin.nextDouble();
        System.out.print("    Taxa de juro anual (como decimal): ");
        rate = stdin.nextDouble();

        interest = principal * rate;        // Compute this year's interest.
        principal += interest;              // Add it to principal.

        System.out.printf("              O valor do juro ganho é: %,15.2f Eur%n", interest);
        System.out.format("O valor do investimento após um ano é: %,15.2f Eur%n", principal);
    }
}
