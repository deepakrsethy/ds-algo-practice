package logicbuilding;

public class PrimeTesting {
    public static void main(String[] args) {
        System.out.println(isPrime(15));
    }

    private static boolean isPrime(int num) {

        if (num <= 1) return false; // negative , 0 and 1 are not prime.

        if (num <= 3) return true; // 2 & 3 both are prime.

        if (num % 2 == 0 || num % 3 == 0) return false;

        for(int i = 5 ; i * i <= num ; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) return false;
        }
        return true;
    }
}

/*
  1. Handle small numbers separately:

    If num <= 1, it's not prime.

    If num == 2 or num == 3, it's prime (both are prime numbers).

  2. Eliminate multiples of 2 and 3 immediately:

    If the number is divisible by 2 or 3, not prime.

    No need to check even numbers anymore.

  3. Check in steps of 6:

     After 2 and 3, all primes are of the form 6k ± 1.
    (Example: 5, 7, 11, 13, 17, 19, 23, 29 → all look like 6k±1.)

    So, start checking from 5, and jump by 6 every time (i += 6).

    For each i, check i and i+2:

        For example, check 5 and 7, then 11 and 13, then 17 and 19, and so on.

  4. Only check up to √num:

    Because if a number has a factor greater than √num, the other factor must be smaller than √num.
 */
