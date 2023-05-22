/*
 * Count how many times two pairs of dice are rolled before 
 * the two pairs come up showing the same value
 */
public class App {
    public static void main(String[] args) throws Exception {
        PairOfDice firstDice; // Refers to the first pair of dice.
        firstDice = new PairOfDice();

        PairOfDice secondDice; // Refers to the second pair of dice.
        secondDice = new PairOfDice();

        int countRolls; // Counts how many times the two pairs of
                        // dice have been rolled.

        int total1; // Total showing on first pair of dice.
        int total2; // Total showing on second pair of dice.

        countRolls = 0;

        do { // Roll the two pairs of dice until totals are the same.

            firstDice.roll(); // Roll the first pair of dice.
            total1 = firstDice.getDie1() + firstDice.getDie2(); // Get total.
            System.out.println("First pair comes up  " + total1);

            secondDice.roll(); // Roll the second pair of dice.
            total2 = secondDice.getDie1() + secondDice.getDie2(); // Get total.
            System.out.println("Second pair comes up " + total2);

            countRolls++; // Count this roll.

            System.out.println(); // Blank line.

        } while (total1 != total2);

        System.out.println("It took " + countRolls
                + " rolls until the totals were the same.");

    } // end main()

} // end class RollTwoPairs
