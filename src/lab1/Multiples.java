package lab1;

public class Multiples {
    public static int countFizzBuzz(int i) {
        int total = 0;
        while (i > 0) {
            // Find out which numbers divide i.
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            // Print our appropriate result.
            if (divisibleBy3 || divisibleBy5) {

                total++;

            }
            i--;
        }
        return total;
    }
}
