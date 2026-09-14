package lab1;

public class Multiples {
    public static void countFizzBuzz(int n, int a, int b) {
        int total = 0;
        while (n > 0) {
            // Find out which numbers divide i.
            boolean divisibleBy3 = n % a == 0;
            boolean divisibleBy5 = n % b == 0;

            // Print our appropriate result.
            if (divisibleBy3 || divisibleBy5) {

                total++;

            }
            n--;
        }
        int count = total;
        System.out.println(count);
    }

}
