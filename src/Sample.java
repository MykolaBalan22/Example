import java.util.Arrays;
import java.util.StringJoiner;

public class Sample {

    public static int binarySearch(int[] inputArray, int value) {

        int result = -1;
        if (inputArray == null || inputArray.length == 0) {
            result = -1;
        } else if (inputArray.length != 1) {

            Arrays.sort(inputArray);
            int startPosition = 0;
            int endPosition = inputArray.length - 1;
            boolean finishLoop = true;

            while (finishLoop) {
                if (endPosition - startPosition == 1) {
                    if (inputArray[startPosition] == value) {
                        result = startPosition;
                    } else if (inputArray[endPosition] == value) {
                        result = endPosition;
                    } else {
                        result = -1;
                    }
                    finishLoop = false;
                } else {

                    if (inputArray[startPosition] == value) {
                        result = startPosition;
                        finishLoop = false;
                    } else if (inputArray[endPosition] == value) {
                        result = endPosition;
                        finishLoop = false;
                    } else {
                        int middlePosition = startPosition + (endPosition - startPosition) / 2;
                        if (inputArray[middlePosition] == value) {
                            result = middlePosition;
                            finishLoop = false;
                        } else {
                            if ((endPosition - startPosition) != 2) {
                                if (value > inputArray[middlePosition]) {
                                    startPosition = middlePosition;
                                } else if (value < inputArray[middlePosition]) {
                                    endPosition = middlePosition;
                                }
                            }
                        }
                    }

                }
            }
        } else {
            if (inputArray[0] == value) {
                result = 0;
            } else {
                result = -1;
            }
        }
        return result;
    }

    public static int getMaxValue(int inputArray[]) {
        int maxValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] > maxValue) {
                maxValue = inputArray[i];
            }
        }
        return maxValue;
    }

    public static int sumOfEvenNumbers(int inputData[]) {
        if (inputData == null || inputData.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < inputData.length; i++) {
            if (inputData[i] % 2 == 0) {
                sum += inputData[i];
            }
        }
        return sum;
    }

    public static int[][] spiral(int rows, int columns) {

        int[][] resultArray = new int[rows][columns];

        int rowStartPosition = 0;
        int columnStartPosition = 0;

        int rowFinishPosition = rows - 1;
        int columnFinishPosition = columns - 1;

        int counter = 1;

        while (counter <= rows * columns) {
            for (int i = columnStartPosition; i <= columnFinishPosition; i++) {
                resultArray[rowStartPosition][i] = counter;
                counter++;
            }
            if (counter > rows * columns) {
                break;
            }
            for (int i = rowStartPosition + 1; i <= rowFinishPosition - 1; i++) {
                resultArray[i][columnFinishPosition] = counter;
                counter++;
            }
            if (counter > rows * columns) {
                break;
            }

            for (int i = columnFinishPosition; i >= columnStartPosition; i--) {
                resultArray[rowFinishPosition][i] = counter;
                counter++;
            }
            if (counter > rows * columns) {
                break;
            }
            for (int i = rowFinishPosition - 1; i >= rowStartPosition + 1; i--) {
                resultArray[i][columnStartPosition] = counter;
                counter++;
            }
            columnStartPosition++;
            columnFinishPosition--;
            rowStartPosition++;
            rowFinishPosition--;
        }
        return resultArray;
    }

    public static int[][] multiply(int[][] matrix) {
        return null;
    }


    public static int[] plusOne(int[] digits) {
        String numberLikeLine = "";
        for (int i = 0; i < digits.length; i++) {
            numberLikeLine += digits[i];
        }
        Integer number = Integer.valueOf(numberLikeLine);
        number++;
        String[] array = number.toString().split("");
        int [] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i]=Integer.valueOf(array[i]);
        }
        //////////////////////////////////////


        return result;
    }
}
