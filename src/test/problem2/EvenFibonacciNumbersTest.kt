package problem2

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class EvenFibonacciNumbersTest {

    @Test
    fun shouldSolveTheProblem() {
        Assertions.assertEquals(10, sumEvenFibonacciNumber(10))
        Assertions.assertEquals(44, sumEvenFibonacciNumber(100))
    }

}
