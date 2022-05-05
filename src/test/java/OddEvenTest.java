import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OddEvenTest {
    @Test
    public void testGetOddEvenHappyPathNumberIsOddPositive () {
        int number = 345;
        String expectedResult = "Odd";

        OddEven oddEven = new OddEven();
        String actualResult = oddEven.getOddEven(number);

        Assertions.assertEquals(expectedResult,actualResult);

    }

    @Test
    public void testGetOddEvenHappyPathNumberIsZero () {
        int number = 0;
        String expectedResult = "Even";

        OddEven oddEven = new OddEven();
        String actualResult = oddEven.getOddEven(number);

        Assertions.assertEquals(expectedResult,actualResult);

    }

    @Test
    public void testGetOddEvenHappyPathNumberIsEvenPositive () {
        int number = 222222;
        String expectedResult = "Even";

        OddEven oddEven = new OddEven();
        String actualResult = oddEven.getOddEven(number);

        Assertions.assertEquals(expectedResult,actualResult);

    }

    @Test
    public void testGetOddEvenHappyPathNumberIsUndefinedIntMax () {
        int number = 2147483647 + 1;
        String expectedResult = "Undefined";

        OddEven oddEven = new OddEven();
        String actualResult = oddEven.getOddEven(number);

        Assertions.assertEquals(expectedResult,actualResult);

    }

    @Test
    public void testGetOddEvenHappyPathNumberIsUndefinedIntMax1 () {
        int number = 2147483647;
        String expectedResult = "Odd";

        OddEven oddEven = new OddEven();
        String actualResult = oddEven.getOddEven(number);

        Assertions.assertEquals(expectedResult,actualResult);

    }

    @Test
    public void testGetOddEvenHappyPathNumberIsUndefinedIntMin1 () {
        int number = -2147483648;
        String expectedResult = "Even";

        OddEven oddEven = new OddEven();
        String actualResult = oddEven.getOddEven(number);

        Assertions.assertEquals(expectedResult,actualResult);

    }

    @Test
    public void testGetOddEvenHappyPathNumberIsUndefinedIntMin () {
        int number = -2147483648 - 1;
        String expectedResult = "Undefined";

        OddEven oddEven = new OddEven();
        String actualResult = oddEven.getOddEven(number);

        Assertions.assertEquals(expectedResult,actualResult);

    }

    @Test
    public void testGetOddEvenHappyPathNumberIsEvenNegative () {
        int number = -222222;
        String expectedResult = "Even";

        OddEven oddEven = new OddEven();
        String actualResult = oddEven.getOddEven(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testGetOddEvenHappyPathNumberIsOddNegative () {
        int number = -345;
        String expectedResult = "Odd";

        OddEven oddEven = new OddEven();
        String actualResult = oddEven.getOddEven(number);

        Assertions.assertEquals(expectedResult,actualResult);

    }
}
