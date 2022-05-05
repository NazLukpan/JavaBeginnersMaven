public class Intersection {

    public int[] getIntersection(int[] array1, int[] array2) {

        if (array1 == null || array2 == null || (array1.length == 0 && array2.length == 0)) {
            return null;
        } else {
            int[] arrayCommon = new int[array2.length + array1.length];
            for (int i = 0; i < array1.length; i++) {
                arrayCommon[i] = array1[i];

            }
            for (int i = 0; i < array2.length; i++) {
                arrayCommon[array1.length + i] = array2[i];
            }
            for (int i = 0; i < arrayCommon.length; i++) {
                for (int j = i + 1; j < arrayCommon.length; j++) {
                    if (arrayCommon[i] != arrayCommon[j]) {
                        arrayCommon[j] = Integer.MIN_VALUE;
                    }
                }
            }
            int count = 0;
            for (int i = 0; i < arrayCommon.length; i++) {
                if (arrayCommon[i] != Integer.MIN_VALUE) {
                    count++;
                }
            }
            int[] array = new int[arrayCommon.length - count];
            count = 0;
            for (int i = 0; i < arrayCommon.length; i++) {
                if (arrayCommon[i] != Integer.MIN_VALUE) {
                    array[count] = arrayCommon[i];
                    count++;
                }
            }
        }
        return array1;
    }

}
