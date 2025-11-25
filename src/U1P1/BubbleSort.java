package U1P1;

public class BubbleSort {
    public void main(String[] args) {
        int[] numbers = {7, 9, 3, 4, 2};

        //traverse array
        for (int i = 0; i < numbers.length; i++) {
            //check pair for sorting
            for (int j = 0; j < numbers.length - i; j++) {

                if (numbers[j] > numbers[j + 1]) {
                    tempValue = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = tempValue;
                }
            }
            // if not sorted swap
            // if sorted move to next pair


        }
    }
}
