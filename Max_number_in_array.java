import java.util.Arrays;
import java.util.Scanner;

public class Max_number_in_array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter integer number separated by space: ");
        String numbers = sc.nextLine();
        int[] intArray = convertStringToArray(numbers.split("\\s+"));
        System.out.println("*** Initial Array ***");
        System.out.println(Arrays.toString(intArray));
        System.out.println("*** Max number in array ***");
        System.out.println(maxInt(intArray));
    }

    public static int maxInt(int[] intArray){
        int max = intArray[0];
        for (int i : intArray) {
            if(i > max){
                max = i;
            }
        }
        return max;

    }
    private static int[] convertStringToArray(String[] numbers){
        int[] intArray = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++){
            // intArray[i] = Integer.valueOf(numbers[i]);
            intArray[i] = Integer.parseInt(numbers[i]);
        }
        return intArray;
    }
}
