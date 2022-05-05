public class OddEven {

    public String getOddEven(int number) {
        if ((number > 0 && (number - 1) == Integer.MAX_VALUE || (number < 0 && (number + 1) == Integer.MIN_VALUE))) {
            return "Undefined";
        } else if (Math.abs(number % 2) == 1) {
            return "Odd";
        } else {
            return "Even";
        }
//          public String getOddEven(int number) {
//        if (number > Integer.MAX_VALUE || number < Integer.MIN_VALUE) {
//            return "Undefined";
//        } else if number % 2 == 0) {
//            return "Even";
//        }  else {
//            return "Odd";
//        }
    }
}






