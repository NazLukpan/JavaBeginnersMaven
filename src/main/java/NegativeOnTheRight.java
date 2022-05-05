public class NegativeOnTheRight {

    public int[] getNegativeOnTheRight(int[] array) {
        if (array == null || array.length == 0) {
            return null;
        } else {
            int[] arrayNegativeOnTheRight = new int[array.length];
            int countOfNegativeNumbers = 0;
            int countOfPositiveNumbers = 0;
            for (int i = 0; i < array.length; i++) {
                    if (array[i] < 0) {
                        countOfNegativeNumbers++;
                    } else {
                        countOfPositiveNumbers++;
                    }
                }
            if (countOfNegativeNumbers == 0) {
                return array; // null;
            } else {
                countOfPositiveNumbers = 0;
                for (int i = 0; i < array.length; i++) {
                    if (array[i] < 0) {
                        arrayNegativeOnTheRight[array.length - countOfNegativeNumbers] = array[i];
                        countOfNegativeNumbers--;
                    } else {
                        arrayNegativeOnTheRight[countOfPositiveNumbers] = array[i];
                        countOfPositiveNumbers++;
                    }
                }
                return arrayNegativeOnTheRight;
            }

        }
    }
}

