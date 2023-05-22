/**
 * this programa simulates rolling a pair of dice.
 * This soluction uses Math.random()
 */
public class App {
    public static void main(String[] args) throws Exception {
        int lauch1, lauch2;

        System.out.println("Lançamento de 2 dados");

        lauch1 = (int) (Math.random() * 6) + 1; // simulates dice rolling
        lauch2 = (int) (Math.random() * 6) + 1;

        System.out.println("O primeiro dados apresenta "+ lauch1);
        System.out.println("O segundo dados apresenta " + lauch2);
        System.out.println("O total é " + (lauch1+lauch2));
    }
}
