package problem10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static problem10.Solution.*;

public class SummationOfPrimesTest {

    @Test
    void shouldWarmupPrimeNumbers() {
        var primeNumbers = warmupPrimeNumbers();

        Assertions.assertEquals(216816, primeNumbers.size());

        Assertions.assertEquals(2, primeNumbers.get(0));
        Assertions.assertEquals(2999, primeNumbers.get(429));
    }

    @Test
    void shouldSolveTheProblem() {
        var primeNumbers = warmupPrimeNumbers();

        Assertions.assertEquals(0, sumPrimeNumbersUnderInput(primeNumbers, 1));
        Assertions.assertEquals(10, sumPrimeNumbersUnderInput(primeNumbers, 5));
        Assertions.assertEquals(17, sumPrimeNumbersUnderInput(primeNumbers, 10));
        Assertions.assertEquals(593823, sumPrimeNumbersUnderInput(primeNumbers, 3000));
        Assertions.assertEquals(312471072265L, sumPrimeNumbersUnderInput(primeNumbers, 3000000));
    }

}
