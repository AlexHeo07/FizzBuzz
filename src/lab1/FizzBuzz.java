package lab1;

/**
 * Solve the lab1.FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {
        int i = 1;
        while (i <= 100) {
            Result result = doFizzBuzz(i);

            // Print our appropriate result.
            if (result.divisibleBy3() && result.divisibleBy5()) {

                System.out.println("Fizz Buzz");

            } else if (result.divisibleBy3()) {

                System.out.println("Fizz");

            } else if (result.divisibleBy5()) {

                System.out.println("Buzz");

            } else {

                System.out.println(i);

            }

            i++;
        }
    }

    private static Result doFizzBuzz(int i) {
        // Find out which numbers divide i.
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;
        Result result = new Result(divisibleBy3, divisibleBy5);
        return result;
    }

    private record Result(boolean divisibleBy3, boolean divisibleBy5) {
    }
}
