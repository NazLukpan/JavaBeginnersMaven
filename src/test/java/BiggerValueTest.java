import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BiggerValueTest {

    @Test
    public void testGetBiggerValueHappyPathPositiveNumbers() {
        int param1 = 3333;
        int param2 = 9999;
        int expectedResult = 9999;

        BiggerValue biggerValue = new BiggerValue();
        int actualResult = biggerValue.getBiggerValue(param1,param2);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testGetBiggerValueHappyPathNegativeNumbers() {
        int param1 = -3333;
        int param2 = -9999;
        int expectedResult = -3333;

        BiggerValue biggerValue = new BiggerValue();
        int actualResult = biggerValue.getBiggerValue(param1,param2);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testGetBiggerValueHappyPathSameNumbers() {
        int param1 = 0;
        int param2 = 0;
        int expectedResult = 0;

        BiggerValue biggerValue = new BiggerValue();
        int actualResult = biggerValue.getBiggerValue(param1,param2);

        Assertions.assertEquals(expectedResult,actualResult);
    }
}
