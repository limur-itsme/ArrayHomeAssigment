public class Task2 {
    static void main(String[] args) {
        int[] numbers = {14, -5, 0, 23, -11, 8, -2, 31};
        int largest = 0;
        int smallest = 0;
        int smallestsIndex = 0;
        int largestsIndex = 0;
        for(int index = 0; index < numbers.length; index++ ){
            if(numbers[index] > largest){
                largest = numbers[index];
                largestsIndex = index;
            }
            if(numbers[index] < smallest){
                smallest = numbers[index];
                smallestsIndex = index;
            }
        }
        System.out.println("Array: " + numbers + "\n" +
                "Largest: " + largest + " at index " + largestsIndex + "\n" +
                "Smallest: " + smallest + " at index " + smallestsIndex);
    }
}
