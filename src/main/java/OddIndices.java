public class OddIndices {

    public int[] getOddIndices(int[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        int arrayLength = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 1) {
                arrayLength++;
            }
        }
        int[] oddIndicesArray = new int[arrayLength];
        arrayLength = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 1) {
                oddIndicesArray[arrayLength] = array[i];
                arrayLength++;
            }
        }
        return oddIndicesArray;
    }
}
