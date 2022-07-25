package problem7

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class `10001stPrimeTest` {

    @Test
    fun shouldSolveTheProblem() {
        warmup(10000)

        Assertions.assertEquals(2, getNthPrimeNumber(1))
        Assertions.assertEquals(5, getNthPrimeNumber(3))
        Assertions.assertEquals(13, getNthPrimeNumber(6))
        Assertions.assertEquals(29, getNthPrimeNumber(10))
        Assertions.assertEquals(104729, getNthPrimeNumber(10000))
    }

}
