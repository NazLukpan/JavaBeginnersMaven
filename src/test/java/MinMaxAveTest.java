import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinMaxAveTest {

    @Test
    public void testGetMinMaxAveHappyPath () {

        int [] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int index1 = 2;
        int index2 = 6;
        int[] expectedResult = {3, 7, 5};

        MinMaxAve minMaxAve = new MinMaxAve();
        int[] actualResult = minMaxAve.getMinMaxAveArray(array, index1, index2);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }

    @Test
    public void testGetMinMaxAveHappyPathArrayIsNull () {

        int [] array = null;
        int index1 = 2;
        int index2 = 6;
        int[] expectedResult = null;

        MinMaxAve minMaxAve = new MinMaxAve();
        int[] actualResult = minMaxAve.getMinMaxAveArray(array, index1, index2);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }

    @Test
    public void testGetMinMaxAveHappyPathArrayLengthIsZero () {

        int [] array = {};
        int index1 = 2;
        int index2 = 6;
        int[] expectedResult = null;

        MinMaxAve minMaxAve = new MinMaxAve();
        int[] actualResult = minMaxAve.getMinMaxAveArray(array, index1, index2);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }

    @Test
    public void testGetMinMaxAveHappyPathIndex1IsGreaterThanIndex2 () {

        int [] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int index1 = 6;
        int index2 = 2;
        int[] expectedResult = null;

        MinMaxAve minMaxAve = new MinMaxAve();
        int[] actualResult = minMaxAve.getMinMaxAveArray(array, index1, index2);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }

    @Test
    public void testGetMinMaxAveHappyPathIndexIsSame () {

        int [] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int index1 = 2;
        int index2 = 2;
        int[] expectedResult = {3, 3, 3};

        MinMaxAve minMaxAve = new MinMaxAve();
        int[] actualResult = minMaxAve.getMinMaxAveArray(array, index1, index2);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }

    @Test
    public void testGetMinMaxAveHappyPathIndexIsNegative () {

        int [] array = {-1, -2, -3, -4, -5, -6, -7, -8};
        int index1 = 2;
        int index2 = 5;
        int[] expectedResult = {-6, -3, -4};

        MinMaxAve minMaxAve = new MinMaxAve();
        int[] actualResult = minMaxAve.getMinMaxAveArray(array, index1, index2);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }

}
