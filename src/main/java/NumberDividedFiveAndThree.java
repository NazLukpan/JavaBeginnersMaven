public class NumberDividedFiveAndThree {

    public String getNumberDividedFiveAndThree(int number) {
        if (number % 3 == 0 && number % 5 != 0) {
            return "Bad Number";
        } else if (number % 3 != 0 && number % 5 == 0) {
            return "Poor Number";
        } else if (number % 3 == 0 && number % 5 == 0) {
            return "Good Number";
        } else {
            return "-1";
        }

    }
}

