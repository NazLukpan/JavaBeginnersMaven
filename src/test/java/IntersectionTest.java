import org.junit.jupiter.api.Test;

public class IntersectionTest {

    @Test
    public void testGetIntersectionHappyPathPositive() {
        int[] array1 = {1, 2, 4, 5, 89};
        int[] array2 = {8, 9, 4, 2};
        int[] expectedResult = {2, 4};

        Intersection intersection = new Intersection();
        int[] actualResult = intersection.getIntersection(array1,array2);
    }

    @Test
    public void testGetIntersectionHappyPathNegative() {
        int[] array1 = {1, 2, 4, 5, 8, 9};
        int[] array2 = {8, 9, -4, -2};
        int[] expectedResult = {8, 9};

        Intersection intersection = new Intersection();
        int[] actualResult = intersection.getIntersection(array1,array2);
    }

    @Test
    public void testGetIntersectionNoCommonNumbers() {
        int[] array1 = {1, 2, 4, 5, 89};
        int[] array2 = {8, 9, 45};
        int[] expectedResult = {};

        Intersection intersection = new Intersection();
        int[] actualResult = intersection.getIntersection(array1,array2);
    }

}
