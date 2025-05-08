import java.util.Arrays;

public class Demo {

    public static boolean[] SumOfPrevious(int[] inputData) {
        boolean[] result = new boolean[inputData.length];
        for (int i = 0; i < inputData.length; i++) {
            if (i > 1) {
                result[i] = inputData[i] == inputData[i - 1] + inputData[i - 2];
            } else {
                result[i] = false;
            }
        }
        return result;
    }

    public static int[] removeLocalMaxima(int[] inputArray) {
        int[] result = new int[inputArray.length];
        int counter = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (i == 0) {
                if (inputArray[i] <= inputArray[i + 1]) {
                    result[counter] = inputArray[i];
                    counter++;
                }
            } else if (i == inputArray.length - 1) {
                if (inputArray[i] <= inputArray[i - 1]) {
                    result[counter] = inputArray[i];
                    counter++;
                }
            } else {
                if (inputArray[i] <= inputArray[i - 1] || inputArray[i] <= inputArray[i + 1]) {
                    result[counter] = inputArray[i];
                    counter++;
                }
            }
        }
        return Arrays.copyOf(result, counter);
    }

}


