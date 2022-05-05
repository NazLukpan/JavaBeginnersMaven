import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberDividedFiveAndThreeTest {

    @Test
    public void testGetNumberDividedFiveAndThreeDivBoth() {
        int number = 15;
        String expectedResult = "Good Number";

        NumberDividedFiveAndThree numberDividedFiveAndThree = new NumberDividedFiveAndThree();
        String actualResult = numberDividedFiveAndThree.getNumberDividedFiveAndThree(number);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testGetNumberDividedFiveAndThreeDivThree() {
        int number = 27;
        String expectedResult = "Bad Number";

        NumberDividedFiveAndThree numberDividedFiveAndThree = new NumberDividedFiveAndThree();
        String actualResult = numberDividedFiveAndThree.getNumberDividedFiveAndThree(number);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testGetNumberDividedFiveAndThreeDivFive() {
        int number = 25;
        String expectedResult = "Poor Number";

        NumberDividedFiveAndThree numberDividedFiveAndThree = new NumberDividedFiveAndThree();
        String actualResult = numberDividedFiveAndThree.getNumberDividedFiveAndThree(number);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testGetNumberDividedFiveAndThreeDoesntdivideThreeAndFive() {
        int number = 28;
        String expectedResult = "-1";

        NumberDividedFiveAndThree numberDividedFiveAndThree = new NumberDividedFiveAndThree();
        String actualResult = numberDividedFiveAndThree.getNumberDividedFiveAndThree(number);

        Assertions.assertEquals(expectedResult,actualResult);
    }
}
