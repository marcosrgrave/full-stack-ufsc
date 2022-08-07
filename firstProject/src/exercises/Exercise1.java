package exercises;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Exercise1 {

    public static void main(String[] args) {
        int length = 6;
        int minValue = 1;
        int maxValue = 10;
        int[][] squareMatrix = matrixVectorValues(length, minValue, maxValue);
        sumSquareMatrixValuesAboveAverage(squareMatrix);
        return;
    }

    private static int randomInteger(int min, int max) {
        int randInt = ThreadLocalRandom.current().nextInt(min, max + 1);
        return randInt;
    }

    private static int[] vectorInit(int length, int min, int max) {
        int[] vector = new int[length];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = randomInteger(min, max);
        }
        System.out.println("Vetor A: " + Arrays.toString(vector));
        return vector;
    }

    private static int[][] squareMatrixInit(int length) {
        int[][] matrix = new int[length][length];
        return matrix;
    }

    // como faço para retornar mais de um valor e utilizá-los separadamente?
    private static int[][] matrixVectorValues(int length, int min, int max) {
        // int sum = 0;
        int[] vector = vectorInit(length, min, max);
        int[][] matrixWithVectorValues = squareMatrixInit(length);
        System.out.println("Matriz M:");
        for (int i = 0; i < matrixWithVectorValues.length; i++) {
            for (int j = 0; j < matrixWithVectorValues.length; j++) {
                matrixWithVectorValues[i][j] = vector[i] * vector[j];
                // sum += matrixWithVectorValues[i][j];
                System.out.print(matrixWithVectorValues[i][j] + "\t");
            }
            System.out.println();
        }
        // return new Object[] { matrixWithVectorValues, sum };
        return matrixWithVectorValues;
    }

    // não queria fazer essa função, mas não sei retornar mais de um valor em Java
    private static int sumMatrixValues(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    public static float average(int sum, int length) {
        float avg = sum / length;
        System.out.println("Média: " + avg);
        return avg;
    }

    private static int sumSquareMatrixValuesAboveAverage(int[][] squareMatrix) {
        int sum = sumMatrixValues(squareMatrix);
        float average = average(sum, squareMatrix.length * squareMatrix.length);
        int amountNumbersAboveAverage = 0;
        int sumAboveAverage = 0;
        for (int i = 0; i < squareMatrix.length; i++) {
            for (int j = 0; j < squareMatrix.length; j++) {
                if (squareMatrix[i][j] > average) {
                    sumAboveAverage += squareMatrix[i][j];
                    amountNumbersAboveAverage += 1;
                }
            }
        }
        System.out.println("Números acima da média: " + amountNumbersAboveAverage);
        System.out.println("Soma dos valores acima da média: " + sumAboveAverage);
        return sumAboveAverage;
    }

}
