import java.util.Scanner;

public class AddTwoMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter the size of the array");
        System.out.println("Enter the number of rows :");
        int n = sc.nextInt();
        System.out.println("Enter the number of columns :");
        int m = sc.nextInt();

        int[][] matrix1 = new int[n][m];
        //int[][] matrix2 = new int[n][m];
        //int[][] result = new int[n][m];
        System.out.println("Enter the elements of the matrix 1");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the elements of the matrix 2");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix1[i][j] += sc.nextInt();
            }
        }
        /* 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix1[i][j] += matrix2[i][j];
                //result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        */
        System.out.println("The result is");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}