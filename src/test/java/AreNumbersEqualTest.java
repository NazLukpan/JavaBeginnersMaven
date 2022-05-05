import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AreNumbersEqualTest {
    @Test
    public void testGetAreNumbersEqualHappyPathSameNumbers () {
        int number1 = 89;
        int number2 = 89;
        int expectedResult = 0;

        AreNumbersEqual areNumbersEqual = new AreNumbersEqual();
        int actualResult = areNumbersEqual.getAreNumbersEqual(number1, number2);

        Assertions.assertEquals(expectedResult,actualResult);

    }

    @Test
    public void testGetAreNumbersEqualHappyPathSecondNumberIsGreater () {
        int number1 = -89;
        int number2 = 89;
        int expectedResult = -1;

        AreNumbersEqual areNumbersEqual = new AreNumbersEqual();
        int actualResult = areNumbersEqual.getAreNumbersEqual(number1, number2);

        Assertions.assertEquals(expectedResult,actualResult);

    }

    @Test
    public void testGetAreNumbersEqualHappyPathFirstNumberIsGreater () {
        int number1 = 89;
        int number2 = -89;
        int expectedResult = 1;

        AreNumbersEqual areNumbersEqual = new AreNumbersEqual();
        int actualResult = areNumbersEqual.getAreNumbersEqual(number1, number2);

        Assertions.assertEquals(expectedResult,actualResult);

    }
}
