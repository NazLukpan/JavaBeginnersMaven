import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseArrayTest {

    @Test
    public void testGetReverseArray() {
        int [] array = {2, 7, 3, 10};
        int[] expectedResult = {10, 3, 7, 2};

        ReverseArray reverseArray = new ReverseArray();
        int[] actualResult = reverseArray.getReverseArray(array);

        Assertions.assertArrayEquals(expectedResult,actualResult);

    }

    @Test
    public void testGetReverseArrayIsNull() {
        int [] array = null;
        int[] expectedResult = null;

        ReverseArray reverseArray = new ReverseArray();
        int[] actualResult = reverseArray.getReverseArray(array);

        Assertions.assertArrayEquals(expectedResult,actualResult);

    }

    @Test
    public void testGetReverseArrayLengthIsZero() {
        int [] array = {};
        int[] expectedResult = null;

        ReverseArray reverseArray = new ReverseArray();
        int[] actualResult = reverseArray.getReverseArray(array);

        Assertions.assertArrayEquals(expectedResult,actualResult);

    }

    @Test
    public void testGetReverseArrayOneElement() {
        int [] array = {2};
        int[] expectedResult = {2};

        ReverseArray reverseArray = new ReverseArray();
        int[] actualResult = reverseArray.getReverseArray(array);

        Assertions.assertArrayEquals(expectedResult,actualResult);

    }

}
