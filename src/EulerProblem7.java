/*
10001st prime

Problem 7
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?
 */
public class EulerProblem7 {

    public static boolean Prime(long a) {
        long s = (long) Math.sqrt(a);

        for (long i = 2; i <= s; i++) if ((a % i) == 0) return false;
        return true;
    }

    public static void main(String[] args) {
        long x = 0;
        long num = 2;
        while (x < 10001) {
            if (Prime(num)) x++;
            num++;
        }
        System.out.println("The 10 001st prime number is " + (--num) + ".");
    }
}
