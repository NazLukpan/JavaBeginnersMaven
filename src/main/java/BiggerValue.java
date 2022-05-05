public class BiggerValue {

    public int getBiggerValue(int param1, int param2) {
        if (Math.max(param1,param2) == param1) {
            return param1;
        } else if (Math.max(param1,param2) == param2) {
            return param2;
        } else {
            return 0;
        }
    }

}
