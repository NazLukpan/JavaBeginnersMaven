public class ReverseArray {

    public int[] getReverseArray(int[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        int[] reverseArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reverseArray[array.length - 1 - i] = array[i];
        }
        return reverseArray;
    }
}
