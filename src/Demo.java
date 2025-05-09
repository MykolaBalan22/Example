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


    public static void cycleSwap(int[] array) {
        int lastElement = array[array.length - 1];

        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = lastElement;
    }

    public static void cycleSwap(int[] array, int shift) {

        int[] shiftArray = new int[shift];
        System.arraycopy(array, array.length - shift, shiftArray, 0, shift);

        for (int j = shift; j > 0; j--) {
            for (int i = array.length - j - 1; i > 0; i--) {
                array[i] = array[i - 1];
            }
        }
        for (int i = 0; i < shiftArray.length; i++) {
            array[i] = shiftArray[i];
        }
    }

    public static int[][] spiral(int rows, int columns) {
        int[][] resultArray = new int[rows][columns];

        int counter = 1;
        int rowStartPosition = 0;
        int colStartPosition = 0;

        int rowEndPosition = rows;
        int colEndPosition = columns;

        while (counter <= rows * columns) {
            for (int i = colStartPosition; i < colEndPosition; i++) {
                resultArray[rowStartPosition][i] = counter;
                counter++;
            }
            if(counter>=rows * columns){
                break;
            }
            for (int i = rowStartPosition + 1; i < rowEndPosition - 1; i++) {
                resultArray[i][colEndPosition-1] = counter;
                counter++;
            }
            if(counter>=rows * columns){
                break;
            }
            for (int i = colEndPosition-1; i >= colStartPosition; i--) {
                resultArray[rowEndPosition-1][i] = counter;
                counter++;
            }
            if(counter>=rows * columns){
                break;
            }
            for (int i = rowEndPosition - 2; i >= rowStartPosition + 1; i--) {
                resultArray[i][colStartPosition] = counter;
                counter++;
            }
            rowStartPosition++;
            rowEndPosition--;
            colStartPosition++;
            colEndPosition--;
        }
        return resultArray;

    }

}


