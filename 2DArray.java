public class Simple2DArray {
    public static void main(String[] args) {
        // Predefined 2D array
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Print the 2D array
        System.out.println("The 2D array is:");
        for (int i = 0; i < arr.length; i++) {         // for each row
            for (int j = 0; j < arr[i].length; j++) {  // for each column in that row
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println(); // new line after each row
        }
    }
}

