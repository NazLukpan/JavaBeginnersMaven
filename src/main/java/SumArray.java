public class SumArray {

    public int getSumArray(int [] array) {

        if (array == null || array.length == 0) {
            return 0;
        } else {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }

            return sum;
        }
    }
}
