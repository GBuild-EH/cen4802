import java.io.IOException;
import java.util.*;
import java.util.logging.*;

public class Recur {

    static Scanner sc = new Scanner(System.in);
    static Logger logger;
    public static void LogSetup() {
    logger = Logger.getLogger("Recur");
        ConsoleHandler ch = new ConsoleHandler();
        ch.setLevel(Level.WARNING);
        logger.addHandler(ch);
        try {
            FileHandler fh = new FileHandler("log.log", true);
            fh.setLevel(Level.ALL);
            logger.addHandler(fh);
        } catch (IOException e) {
            logger.severe("Error while creating log file:" + e.getMessage());
        }
    }

    public static void main(String[] args) {

        LogSetup();
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
                    int fterm = sc.nextInt();
                    sc.nextLine();
                    logger.info("Calculating fibonacci sequence for term: " + fterm);
                    int fsum = fib(fterm);
                    System.out.println("The " + fterm + "th term of the Fibonacci sequence is: " + fsum);
                    break;
                case 2:
                    System.out.println("Enter the target term for factorial sequence: ");
                    int factor = sc.nextInt();
                    sc.nextLine();
                    logger.info("Calculating factorial sequence for term: " + factor);
                    int factorial = fact(factor);
                    System.out.println(factor + " factorial equals " + factorial);
                    break;
                case 3:
                    logger.info("Shutting down");
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid operation");
                    logger.warning("Invalid operation chosen");
            }
        }
    }


    public static int fib(int n) {
        logger.finest("Calling fibonacci sequence");
        if (n == 0) {
            return 0;
        }
        else if (n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static int fact(int n) {
        logger.finest("Calling factorial sequence");
        if (n == 0) {
            return 1;
        }
        return n * fact(n - 1);
    }

}
