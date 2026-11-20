import java.util.Arrays;

public class Task1 {
    static void main(String[] args) {
        int[] array1 = {12, -3, 0, 42, -15, 7, -1, 25, -8, 2};
        int positiveNums = 0;
        int negativeNums = 0;
        int zeroNums = 0;
        for(int index = 0; index < array1.length; index++){
            if(array1[index] > 0){
                positiveNums++;
            }
            else if(array1[index] < 0){
                negativeNums++;
            }
            else{
                zeroNums++;
            }
        }
        System.out.println("Array: " + Arrays.toString(array1) + "\n" +
                "Positive: " + positiveNums + "\n" +
                "Negative: " + negativeNums + "\n" +
                "Zero: " + zeroNums + "\n");
    }
}


