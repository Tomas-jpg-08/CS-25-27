package U1P1;

public class EmojiDecoder {

    public static void main(String[] args) {

        // ======== TASK 1: THE RENDERER ========
        System.out.println("--- Task 1: Testing the Renderer ---");
        int[][] testPattern = {
                {1, 0, 0},
                {1, 0, 0},
                {1, 1, 1}
        };

        // TODO: Call your renderImage function here, passing in testPattern

        // renderImage(testPattern);

        // Your output should look like a small 'L' shape.


        // ======== TASK 2: THE MULTIPLIER ========
        System.out.println("\n--- Task 2: Testing the Multiplier ---");
        int[][] smallA = {
                {1, 2},
                {3, 4}
        };
        int[][] smallB = {
                {5},
                {6}
        };

        // TODO: Call your multiplyMatrices function here
        // int[][] smallResult = multiplyMatrices(smallA, smallB);

        // TODO: Now, render your smallResult using your renderImage function!
        // renderImage(smallResult);
        // (Note: The numbers will be 17 and 39. Since they aren't 0,
        //  your renderer will just print two '#' symbols.)


        // ======== THE FINAL CHALLENGE: THE DECODER ========
        System.out.println("\n--- The Final Challenge ---");
        int[][] matrixA = {
                {1, 0, 0, 0, 0},
                {0, 1, 0, 0, 0},
                {0, 1, 0, 0, 0},
                {1, 0, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 1, 0},
                {0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0},
                {1, 0, 0, 0, 0}
        };

        int[][] matrixB = {
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 1, 1, 0, 0, 1, 1, 0, 0},
                {0, 1, 0, 0, 0, 0, 0, 0, 1, 0},
                {0, 0, 1, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 1, 1, 1, 1, 0, 0, 0}
        };

        // TODO 1: Call your multiplyMatrices function with matrixA and matrixB.
        //         This will create the 10x10 'emoji' array.
        // int[][] emoji = multiplyMatrices(matrixA, matrixB);

        // TODO 2: Call your renderImage function with the final 'emoji' array.
        //         If your code is correct, you will see the secret image!
        // renderImage(emoji);
    }


    /**
     * TASK 1: Renders a 2D array, printing " " for 0 and "#" for 1.
     */
    // TODO: Write the renderImage function
    /*
    public static void renderImage(int[][] image) {
        // Loop through each row (i)
        //   Loop through each column (j)
        //     If the value at image[i][j] is 0, print " "
        //     Otherwise (else), print "#"
        //   After the inner loop, print a new line (System.out.println())
    }
    */


    /**
     * TASK 2: Multiplies two matrices (A and B) and returns the result.
     */
    // TODO: Write the multiplyMatrices function
    /*
    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        // 1. Get the dimensions
        int m = matrixA.length;       // Rows in A (and result)
        int n = matrixA[0].length;    // Cols in A / Rows in B
        int p = matrixB[0].length;    // Cols in B (and result)

        // 2. Create the new result array with the correct dimensions (m x p)
        int[][] result = new int[m][p];

        // 3. Perform the multiplication using three nested loops
        for (int i = 0; i < m; i++) {       // For each row of the result (i)
            for (int j = 0; j < p; j++) {   // For each col of the result (j)

                int sum = 0;
                for (int k = 0; k < n; k++) { // The "dot product" loop (k)
                    // Multiply the element from A's row with B's col
                    sum += matrixA[i][k] * matrixB[k][j];
                }
                // Set the final sum to the cell
                result[i][j] = sum;
            }
        }

        // 4. Return the new 2D array!
        return result;
    }
    */
}
}
