import java.util.*;
import java.util.logging.*;

public class Recur {

    static Scanner sc = new Scanner(System.in);
    static Logger logger = Logger.getLogger("Recur");

    public static void main(String[] args) {
        try {
            ConsoleHandler ch = new ConsoleHandler();
            logger.addHandler(ch);
            ch.setLevel(Level.WARNING);
            FileHandler fh = new FileHandler("log.log", true);
            logger.addHandler(fh);
            fh.setLevel(Level.ALL);

            boolean flag = true;
            int op;
            while (flag) {
                System.out.println("Enter 1 for fibonacci sequence, Enter 2 for factorial, Enter 3 to exit: ");
                logger.config("Awaiting operational input");
                op = sc.nextInt();
                sc.nextLine();
                switch (op) {
                    case 1:
                        System.out.println("Enter the target term for fibonacci sequence: ");
                        logger.config("Awaiting target fibonacci term");
                        int fterm = sc.nextInt();
                        sc.nextLine();
                        int fsum = fib(fterm);
                        System.out.println("The " + fterm + "th term of the Fibonacci sequence is: " + fsum);
                        break;
                    case 2:
                        System.out.println("Enter the target term for factorial sequence: ");
                        logger.config("Awaiting target factorial term");
                        int factor = sc.nextInt();
                        sc.nextLine();
                        int factorial = fact(factor);
                        System.out.println(factor + " factorial equals " + factorial);
                        break;
                    case 3:
                        flag = false;
                        break;
                    default:
                        System.out.println("Invalid operation");
                        logger.warning("Invalid operation chosen");
                }
            }

        } catch (Exception e) {
            logger.severe("Exception thrown:" + e.getMessage());
        }
    }


    public static int fib(int n) {
        if (n == 0) {
            logger.info("Fibonacci sequence terminated - term 0");
            return 0;
        }
        else if (n == 1) {
            logger.info("Fibonacci sequence terminated - term 1");
            return 1;
        }
        logger.info("Recurring into Fibonacci sequence");
        return fib(n - 1) + fib(n - 2);
    }

    public static int fact(int n) {
        if (n == 0) {
            logger.info("Factorial sequence terminated - term 0");
            return 1;
        }
        logger.info("Recurring into factorial sequence");
        return n * fact(n - 1);
    }

}
