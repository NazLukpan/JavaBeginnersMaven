public class AreNumbersEqual {

    public int getAreNumbersEqual(int number1, int number2) {
        if (number1 == number2) {
            return 0;
        } else if (number1 < number2) {
            return -1;
        } else {
            return 1;
        }
    }
}
