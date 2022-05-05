import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NegativeOnTheRightTest {

    @Test
    public void testGetNegativeOnTheRightHappyPathContainNegative () {
        int[] array = {4, -3, 7, -12, 5, -2, 9, 4, 12};
        int [] expectedResult = {4, 7, 5, 9, 4, 12, -3, -12, -2};

        NegativeOnTheRight negativeOnTheRight = new NegativeOnTheRight();
        int[] actualResult = negativeOnTheRight.getNegativeOnTheRight(array);

        Assertions.assertArrayEquals(expectedResult,actualResult);

    }

    @Test
    public void testGetNegativeOnTheRightNoNegative () {
        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int [] expectedResult = {4, 3, 7, 12, 5, 2, 9, 4, 12};

        NegativeOnTheRight negativeOnTheRight = new NegativeOnTheRight();
        int[] actualResult = negativeOnTheRight.getNegativeOnTheRight(array);

        Assertions.assertArrayEquals(expectedResult,actualResult);

    }

    @Test
    public void testGetNegativeOnTheRightNumberIsNull () {
        int[] array = {0, 0, 0, 0, 0, 0};
        int[] expectedResult = {0, 0, 0, 0, 0, 0};

        NegativeOnTheRight negativeOnTheRight = new NegativeOnTheRight();
        int[] actualResult = negativeOnTheRight.getNegativeOnTheRight(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

        @Test
        public void testGetNegativeOnTheRightArrayIsLengthIsZero () {
            int[] array = {};
            int[] expectedResult = null;

            NegativeOnTheRight negativeOnTheRight = new NegativeOnTheRight();
            int[] actualResult = negativeOnTheRight.getNegativeOnTheRight(array);

            Assertions.assertArrayEquals(expectedResult,actualResult);

        }




}
