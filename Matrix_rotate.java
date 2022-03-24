import java.util.Scanner;

public class Matrix_rotate{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please, enter matrix size: ");
        int size = in.nextInt();
        double[][] matrix = generateMatrix(size);
        System.out.println("How you want to rotate matrix: " + System.lineSeparator() + 
        "\t1 - 90" + System.lineSeparator() + 
        "\t2 - 180" + System.lineSeparator() +
        "\t3 - 270");
        int mode = in.nextInt();

        System.out.println(System.lineSeparator() + "Base matrix:" + System.lineSeparator());
        printMatrixToConsole(matrix);
        System.out.println();

        if (rotateMatrix(matrix, mode)){
            printMatrixToConsole(matrix);
        }
    }

    public static void transperant(double[][]matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix.length; j++) {
                double number = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = number;       
            }
        }
    }

    public static void rotate90(double[][] matrix){
        transperant(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length/2; j++) {
                double number = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length -1 - j];
                matrix[i][matrix.length -1 - j] = number;
            }
        }
    }

    public static void rotate180(double[][] matrix){
        rotate90(matrix);
        transperant(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length/2; j++) {
                double number = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length -1 - j];
                matrix[i][matrix.length -1 - j] = number;
            }
        }
    }

    public static void rotate270(double[][] matrix){
        rotate180(matrix);
        transperant(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length/2; j++) {
                double number = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length -1 - j];
                matrix[i][matrix.length -1 - j] = number;
            }
        }
    }

    public static double[][] generateMatrix(int size){
        double[][] matrix = new double[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = i+((double)j/10);
            }
        }
        return matrix;
    }

    public static void printMatrixToConsole(double[][] matrix){
        for(int i = 0; i < matrix.length; i ++){
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
    public static boolean rotateMatrix(double[][] matrix, int mode){
        switch (mode) {
            case 1:
                rotate90(matrix);
                break;
            
            case 2:
                rotate180(matrix);
                break;

            case 3:
                rotate270(matrix);
                break;

            default:
                break;
        }
        return true;
    }
}
