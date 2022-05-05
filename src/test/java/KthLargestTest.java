import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KthLargestTest {

    @Test
    public void testGetKthLargestHappyPathPositiveK() {
        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int k = 3;
        int expectedResult = 9;

        KthLargest kthLargest = new KthLargest();
        int actualResult = kthLargest.getKthLargest(array, k);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testGetKthLargestNegativeK() {
        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int k = -5;
        int expectedResult = Integer.MIN_VALUE;

        KthLargest kthLargest = new KthLargest();
        int actualResult = kthLargest.getKthLargest(array, k);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testGetKthLargestNegativeNumbers() {
        int[] array = {-4, -3, -7, -12, -5, -2, -9, -4, -12};
        int k = 3;
        int expectedResult = -4;

        KthLargest kthLargest = new KthLargest();
        int actualResult = kthLargest.getKthLargest(array, k);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testGetKthLargestKisEqualArrayLength() {
        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int k = 9;
        int expectedResult = 2;

        KthLargest kthLargest = new KthLargest();
        int actualResult = kthLargest.getKthLargest(array, k);

        Assertions.assertEquals(expectedResult,actualResult);
    }



}
