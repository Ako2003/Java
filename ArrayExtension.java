import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayExtension{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter length of initial array: ");
        int baseArrayLength = sc.nextInt();
        int[] arr = generateRandomArray(baseArrayLength);
        int[] extendedArray = extendArray(arr);
        System.out.println("*** Initial array ***");
        System.out.println(Arrays.toString(arr));
        System.out.println("*** Extended array ***");
        System.out.println(Arrays.toString(extendedArray));
    }

    public static int[] generateRandomArray(int amountOfElements){
        int[] arr = new int[amountOfElements];
        Random number = new Random();
        for (int i = 0; i < amountOfElements; i++) {
            arr[i] = number.nextInt(20);
        }
        return arr;
    }

    public static int[] extendArray(int[] arr){
        int[] arr2 = new int[arr.length * 2];
        int number = arr.length;
        for (int i = 0; i < arr2.length; i++) {
            if(i < arr.length){
                arr2[i] = arr[i];
            }
            else{
                arr2[i] = 2*arr[i-number];
            }
        }
        return arr2;
    }
}