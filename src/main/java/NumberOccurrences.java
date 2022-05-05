import java.util.Arrays;

public class NumberOccurrences {

    public int[][] getNumberOccurrences(int[] array) {
        Arrays.sort(array);
        int countNumbers = 0;
        int countUnique = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length - 1; j++) {
                if (array[i] !=  array[j]) {
                    countNumbers++;
                }
            }
        }
        int [][] arrayOfNumberOccurrences = new int[countNumbers][2];
        countNumbers = 0;
        int n = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length - 1; j++) {
                if (array[i] ==  array[j]) {
                    arrayOfNumberOccurrences[countNumbers][0] = array[i];
                    arrayOfNumberOccurrences[countNumbers][1] = array[n];
                    n++;
                    countNumbers++;
                }
            }
        }
        return arrayOfNumberOccurrences;
    }
}
