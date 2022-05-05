public class KthLargest {

    public int getKthLargest(int[] array, int k) {
        if (array == null || array.length == 0 || k < 0 || k > array.length) {
            return Integer.MIN_VALUE;
        } else {
            for (int i = 0; i < array.length; i++) {
                for (int j = 1; j < array.length - i; j++) {
                    if (array[j] < array[j - 1]) {
                        int temporaryNumber = array[j];
                        array[j] = array[j - 1];
                        array[j - 1] = temporaryNumber;
                    }
                }
            }
            return array[array.length - k];
        }

    }
}

