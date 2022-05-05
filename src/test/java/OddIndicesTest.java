import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OddIndicesTest {
    @Test
    public void testGetOddIndicesHappyPath() {

        int[] input = {-45, 590, 234, 985, 12, 68};
        int [] expectedResult =  {590, 985, 68};

        OddIndices oddIndices = new OddIndices();
        int[] actualResult = oddIndices.getOddIndices(input);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testGetOddIndicesArrayLengthIsZero() {

        int[] input = {};
        int [] expectedResult = null;

        OddIndices oddIndices = new OddIndices();
        int[] actualResult = oddIndices.getOddIndices(input);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testGetOddIndicesArrayIsNull() {

        int[] input = null;
        int [] expectedResult = null;

        OddIndices oddIndices = new OddIndices();
        int[] actualResult = oddIndices.getOddIndices(input);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }




}
