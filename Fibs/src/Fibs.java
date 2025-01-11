public class Fibs {

    public static void main(String[] args) {
        int fsum;
        int fterm = 10;
        fsum = fib(fterm);
        System.out.println("The " + fterm + "th term of the Fibonacci sequence is: " + fsum);
    }

    /**
     * Returns an int value calculated as term 'n' of the Fibonacci Sequence
     * <p>
     * This method uses recursion to calculate later terms of the Fibonacci
     * sequence by adding the two previous terms.
     *
     * @param n an int value enumerating the term of the sequence to calculate
     * @return the calculated term of the Fibonacci Sequence
     */
    public static int fib(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        return fib(n - 1) + fib(n - 2);
    }

}
