public class MinMaxAve {

    public int[] getMinMaxAveArray(int[] array, int index1, int index2) {

        if (array == null || array.length == 0) {
            return null;
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int[] arrayOfMinMaxAverage = new int[3];
        if (index1 > 0 && index2 > 0 && index1 < index2 && index2 <= array.length) {
            for (int i = index1; i <= index2 ; i++) {
                max = Math.max(array[i], max);
                min = Math.min(array[i], min);
               sum += array[i];
            }
            arrayOfMinMaxAverage [0] = min;
            arrayOfMinMaxAverage[1] = max;
            arrayOfMinMaxAverage[2] = sum / (index2 - index1 +1);
            return arrayOfMinMaxAverage;
        } else if(index1 == index2) {
            arrayOfMinMaxAverage [0] = array[index1];
            arrayOfMinMaxAverage[1] = array[index1];
            arrayOfMinMaxAverage[2] = array[index1];
            return arrayOfMinMaxAverage;
        } else {
            return null;

        }
    }
}
