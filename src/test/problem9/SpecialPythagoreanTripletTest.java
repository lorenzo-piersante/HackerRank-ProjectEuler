package problem9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SpecialPythagoreanTripletTest {

    @Test
    void shouldSolveTheProblem() {
        var solutions = Solution.warmupSpecialPythagoreanTriplets();

        Assertions.assertNull(solutions.get(1));
        Assertions.assertNull(solutions.get(4));

        // (3, 4, 5)
        Assertions.assertEquals(60, solutions.get(12));

        // (65, 72, 97)
        Assertions.assertEquals(453960, solutions.get(234));

        // (20, 99, 101)
        Assertions.assertEquals(199980, solutions.get(220));

        // (68, 285, 293)
        Assertions.assertEquals(5678340, solutions.get(646));

        // (200, 375, 425)
        Assertions.assertEquals(31875000, solutions.get(1000));
    }

}
