import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IsPositiveNumberTest {

    @Test
    public void testGetIsPositiveNumberHappyPath() {
        int number = 555;
        boolean expectedResult = true;

        IsPositiveNumber positiveNumber = new IsPositiveNumber();
        boolean actualResult = positiveNumber.getIsPositiveNumber(number);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testGetIsPositiveNumberHappyPathNegative() {
        int number = -555;
        boolean expectedResult = false;

        IsPositiveNumber positiveNumber = new IsPositiveNumber();
        boolean actualResult = positiveNumber.getIsPositiveNumber(number);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testGetIsPositiveNumberHappyPathIsZero() {
        int number = 0;
        boolean expectedResult = true;

        IsPositiveNumber positiveNumber = new IsPositiveNumber();
        boolean actualResult = positiveNumber.getIsPositiveNumber(number);

        Assertions.assertEquals(expectedResult,actualResult);
    }



}
