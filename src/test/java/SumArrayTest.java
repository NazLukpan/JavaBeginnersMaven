import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumArrayTest {
    @Test
    public void testGetSumArrayHappyPathPositiveArray() {
        int[] array = {0, 1, 2, 3, 4, 5};
        int expectedResult = 15;

        SumArray sumArray = new SumArray();
        int actualResult = sumArray.getSumArray(array);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testGetSumArrayHappyPathNegativeArray() {
        int[] array = {-7, -3};
        int expectedResult = -10;

        SumArray sumArray = new SumArray();
        int actualResult = sumArray.getSumArray(array);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testGetSumArrayHappyPathArrayIsNull() {
        int[] array = null;
        int expectedResult = 0;

        SumArray sumArray = new SumArray();
        int actualResult = sumArray.getSumArray(array);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testGetSumArrayHappyPathArrayLengthIsZero() {
        int[] array = {};
        int expectedResult = 0;

        SumArray sumArray = new SumArray();
        int actualResult = sumArray.getSumArray(array);

        Assertions.assertEquals(expectedResult,actualResult);
    }


}
