package problem5

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class SmallestMultipleTest {

    @Test
    fun shouldSolveTheProblem() {
        Assertions.assertEquals(1, smallestMultiple(1))
        Assertions.assertEquals(6, smallestMultiple(3))
        Assertions.assertEquals(2520, smallestMultiple(10))

        assertThrows<Exception> { smallestMultiple(40) }  // HackerRank is not testing with big numbers
    }

}
