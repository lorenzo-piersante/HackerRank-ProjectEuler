package problem9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * might be improved more using Pythagorean triples theory:
 * en.wikipedia.org/wiki/Formulas_for_generating_Pythagorean_triples
 * I think it is a bit out of scope tho
 */
public class Solution {

    static Map<Integer, Integer> warmupSpecialPythagoreanTriplets() {
        Map<Integer, Integer> solutions = new HashMap<>();

        for (int a = 1; a < 3000; a++) {
            for (int b = a + 1; b < 3000 - a ; b++) {
                int cSquared = a*a + b*b;
                int c = (int) Math.sqrt(cSquared);

                if (c*c != cSquared) {
                    continue;
                }

                int sum = a + b + c;
                if (sum > 3000) {
                    break;
                }

                solutions.put(sum, a * b * c);
            }
        }

        return solutions;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        int[] inputs = new int[t];
        for(int i = 0; i < t; i++){
            inputs[i] = sc.nextInt();
        }

        Map<Integer, Integer> solutions = warmupSpecialPythagoreanTriplets();

        for (int input : inputs) {
            if (! solutions.containsKey(input)) {
                System.out.println(-1);
                continue;
            }

            System.out.println(solutions.get(input));
        }
    }

}
