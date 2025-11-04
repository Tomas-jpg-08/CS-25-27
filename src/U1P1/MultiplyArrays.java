package U1P1;

public class MultiplyArrays {
    public static void main(String[] args) {

        int firstArray[] = new int[5];
        int secondArray[] = new int[5];
        int resultArray[] = new int[5];


        firstArray[0] = 7;
        firstArray[1] = 8;
        firstArray[2] = 3;
        firstArray[3] = 4;
        firstArray[4] = 3;

        secondArray[0] = 30;
        secondArray[1] = 46;
        secondArray[2] = 28;
        secondArray[3] = 43;
        secondArray[4] = 25;

        for(int i=0; i<firstArray.length; i++) {
            resultArray[i] = firstArray[i] * secondArray[i];
           // System.out.println(resultArray[i]);
        }
        for(int i=0; i<resultArray.length; i++) {
        }


    }
}
