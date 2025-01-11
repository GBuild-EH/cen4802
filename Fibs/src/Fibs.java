public class Fibs {

    public static void main(String[] args) {
        int fsum;
        int fterm = 10;
        fsum = fib(fterm);
        System.out.println("The " + fterm + "th term of the Fibonacci sequence is: " + fsum);
    }

    public static int fib(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        return fib(n - 1) + fib(n - 2);
    }

}
