public class ArrayFunHouse {
    // instance variables and constructors could be used, but are not really needed

    // getSum() will return the sum of the numbers from start to stop, not including
    // stop
    public static int getSum(int[] numArray, int start, int stop) {
        int sum = 0;
        for (int i = start; i < stop; i++) {
            sum += numArray[i];
        }
        return sum;
    }

    // getCount() will return number of times val is present
    public static int getCount(int[] numArray, int val) {
        int count = 0;
        for(int i = 0; i < numArray.length; i++) {
            if(numArray[i] == val) {
                count++;
            }
        }
        return count;
    }

    public static int[] removeVal(int[] numArray, int val) {
        int num_val = getCount(numArray, val);

        int [] r_arr = new int[numArray.length - num_val];

        int r_index = 0;
        for(int i = 0; i < numArray.length; i++) {
            if( numArray[i] != val) {
                r_arr[r_index] = numArray[i];
                r_index++;
            }
        }
        return r_arr;
    }
}