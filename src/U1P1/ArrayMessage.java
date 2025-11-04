package U1P1;

public class ArrayMessage {
    public static void main(String[] args) {
        int[][] rawSignal = {
                {114, 100, 115, 110, 100, 120,  80},
                { 90, 110,  90, 110, 120, 120, 114},
                {114, 114, 111, 110,  98, 114,  86},
                { 80, 112, 100, 110, 118, 110, 114}
        };

        // Transpose the rawSignal

        int rows = rawSignal.length;
        int cols = rawSignal[0].length;
        int[][] transpose = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose [j][i] = rawSignal[i][j];
            }
        }


       
        // vertically reflect every even indexed column
        // column 0 must be vertically reflected, etc.
        // column 1 must remain the same

        // Calculate the average of the 4 integers in each row.

        // find the ASCII value of each result and print it to the console



    }

}
