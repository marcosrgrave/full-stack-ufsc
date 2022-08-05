package atividade1;
import java.util.Arrays;

public class AtividadesUFSC {

    public static void main(String[] args) {
        int[] vector = new int[6];
        System.out.println("Vetor A:\n" + Arrays.toString(vector));

        int lines = 6;
        int columns = 6;
        int[][] matrix = new int[lines][columns];
        // System.out.println(Arrays.toString(matrix));

        int sum = 0;
        System.out.println("\nMatriz M: ");
        for (int line = 0; line < matrix.length; line++) {
            for (int column = 0; column < matrix.length; column++) {
                matrix[line][column] = line + column;
                sum += matrix[line][column];
                System.out.print(matrix[line][column] + "\t");
            }
            System.out.println();
        }
        System.out.println("\nSOMA: " + sum);

        float avg = sum / (lines * columns);
        System.out.println("MÉDIA: " + avg);

        int sumGreaterAvg = 0;
        int amountGreaterAvg = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] > avg) {
                    sumGreaterAvg += matrix[i][j];
                    amountGreaterAvg += 1;
                }
            }
        }
        float percentSum = sumGreaterAvg / sum;
        float percentAmount = amountGreaterAvg / (lines * columns);
        System.out.println("SOMA VALORES ACIMA DA MÉDIA: " + sumGreaterAvg + " (" + percentSum + "%)");
        System.out.println("QTD VALORES ACIMA DA MÉDIA: " + amountGreaterAvg + " (" + percentAmount + "%)");

    }

}
