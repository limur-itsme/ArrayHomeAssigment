import java.util.Arrays;

public class Task4 {
    static void main(String[] args) {
        int[] numbers = {11, -6, 0, 29, -3, 15, -18};
        int[] reversedNumbers = new int[numbers.length];
        int reversedIndex = 0;
        for(int index = numbers.length-1; index >= 0; index-- ){
            reversedNumbers[reversedIndex] = numbers[index];
            reversedIndex++;
        }
        System.out.println(Arrays.toString(reversedNumbers));
    }
}
