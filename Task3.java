import java.util.Arrays;

public class Task3 {
    static void main(String[] args) {
        int[] numbers = {19, -4, 7, 0, -12, 25};
        int countOfBigger = 0;
        double average;
        int sum = 0;
        for(int index = 0; index < numbers.length; index++){
            sum += numbers[index];
        }
        average = sum/ numbers.length;
        for(int index = 0; index < numbers.length; index++){
            if(numbers[index] > average){
                countOfBigger++;
            }
        }
        System.out.println("Array:" + Arrays.toString(numbers) + "\n" +
                "Average:" + average +  "\n" +
                "Numbers above average:" + countOfBigger + "\n");

    }
}
