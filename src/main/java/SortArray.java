import java.util.Arrays;

public class SortArray {

    public int[] getSortArray (int[] array) {

        if (array == null || array.length == 0) {
            return null;
        } else {
        Arrays.sort(array);
        return array;
        }
    }
}
