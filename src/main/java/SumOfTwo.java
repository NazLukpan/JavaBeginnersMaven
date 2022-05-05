public class SumOfTwo {

    public int[][] getSumOfTwo(int[] array, int n) {
        if (array == null || array.length <= 0) {
            return null;
        } else {
            int length = 0;
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = i + 1; j < array.length - 1; j++) {
                    if (array[j] + array[i] == n) {
                        length++;
                    }
                }
            }
            int[][] arraySumOfTwo = new int[length][2];
            if (length == 0) {
                return arraySumOfTwo;
            } else {
                length = 0;
                for (int i = 0; i < array.length - 1; i++) {
                    for (int j = i + 1; j < array.length - 1; j++) {
                        if (array[j] + array[i] == n) {
                            arraySumOfTwo[length][0] = array[i];
                            arraySumOfTwo[length][1] = array[j];
                            length++;
                        }
                    }
                }
                return arraySumOfTwo;
            }
        }
    }
}
