package U1P1;

public class Linear_Search {

    public static void main(String[] args) {
        int[] number = {7, 9, 3, 4,2};
        int target = 4;
        int positions = -1;
        int i = 0;

       /*

        // to traverse a array
        for (int i =0; i<numbers.length; i++){
       // to find a value
            if (number[i] == target) {
                positions = i;
            }
        */

        // to stop when the value found
        while (positions == -1 && i < number.length) {
            if (number[i] == target) {
                positions = i;
            }
            i++;

        }

        if (positions != -1){
            System.out.println("Element found at position " + positions);
        }
        else {
            System.out.println("Element not found");
        }



    }
}
