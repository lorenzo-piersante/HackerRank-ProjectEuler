package problem10;

import java.util.*;

public class Solution {

    private static boolean isPrime(int n)
    {
        if (n <= 1) return false;
        if (n <= 3) return true;

        if (n % 2 == 0 || n % 3 == 0) return false;

        for (int i = 5; i*i <= n; i = i + 6){
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }

        return true;
    }

    /**
     * note: LinkedList is used over ArrayList because it does enforce items order consistency
     */
    static LinkedList<Integer> warmupPrimeNumbers() {
        LinkedList<Integer> primeNumbers = new LinkedList<>();

        for (int number = 0; number <= 3000000; number++) {
            if (isPrime(number)) primeNumbers.add(number);
        }

        return primeNumbers;
    }

    static long sumPrimeNumbersUnderInput(LinkedList<Integer> primeNumbers, int input) {
        long sum = 0;

        for (int primeNumber : primeNumbers) {
            // this is why we need a LinkedList ...
            if (primeNumber > input) {
                return sum;
            }

            sum += primeNumber;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        int[] inputs = new int[t];
        for(int i = 0; i < t; i++){
            inputs[i] = sc.nextInt();
        }

        LinkedList<Integer> primeNumbers = warmupPrimeNumbers();

        for (int input : inputs) {
            long solution = sumPrimeNumbersUnderInput(primeNumbers, input);
            System.out.println(solution);
        }
    }

}
