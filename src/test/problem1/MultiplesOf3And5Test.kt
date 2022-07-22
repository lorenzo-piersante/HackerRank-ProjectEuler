package problem1

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class MultiplesOf3And5Test {

    @Test
    fun shouldSolveTheProblem() {
        Assertions.assertEquals(23, sumMultiplesOf3And5(10))
        Assertions.assertEquals(2318, sumMultiplesOf3And5(100))
    }

    @Test
    fun shouldSolveTheProblemV2() {
        Assertions.assertEquals(23, sumMultiplesOf3And5V2(10))
        Assertions.assertEquals(2318, sumMultiplesOf3And5V2(100))
    }

    @Test
    fun shouldSolveTheProblemV3() {
        Assertions.assertEquals(23, sumMultiplesOf3And5V3(10))
        Assertions.assertEquals(2318, sumMultiplesOf3And5V3(100))
    }

}
