package JavaAdvanced_Exercises.Abstraction;


        import java.util.Scanner;

public class P04_2x2_Squares_in_Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        int sizeRow = Integer.parseInt(input[0]);
        int sizeCol = Integer.parseInt(input[1]);
        Character[][] matrix = new Character[sizeRow][sizeCol];

        fillMatrix(scanner, matrix);
        System.out.println(getEqualsSquareCount(matrix));

    }

    private static void fillMatrix(Scanner scanner, Character[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            String[] reminder = scanner.nextLine().split("\\s+");
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = reminder[col].charAt(0);
            }
        }
    }

    private static int getEqualsSquareCount(Character[][] matrix) {
        int count = 0;
        for (int row = 0; row < matrix.length - 1; row++) {
            for (int col = 0; col < matrix[row].length - 1; col++) {
                if (matrix[row][col] == matrix[row][col + 1]
                        && matrix[row][col] == matrix[row + 1][col]
                        && matrix[row][col] == matrix[row + 1][col + 1]) {
                    count++;
                }
            }
        }
        return count;
    }

}
