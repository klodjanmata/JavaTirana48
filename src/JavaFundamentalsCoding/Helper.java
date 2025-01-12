package JavaFundamentalsCoding;

import java.util.Random;
import java.util.Scanner;

public class Helper {

    public static float getFloatFromUser(){
        Scanner input = new Scanner(System.in);
        float number = input.nextFloat();
        return number;
    }

    public static int getIntFromUser(){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        return number;
    }

    public static char getCharFromUser(){
        Scanner input = new Scanner(System.in);
        char character = input.next().charAt(0);
        return character;
    }

    public static String getStringFromUser(){
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        return string;
    }

    public static double calculateCirclePerimeter(double radius){
        return 2 * Math.PI * radius;
    }

    public static boolean isPrime(int number) {
        if (number == 2){
            return true;
        }
        if (number <= 1 && isEven(number)) {
            return false;
        }
        for (int i = 3; i <= number / 2; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrimeNumbers(int n) {
        if(n <= 1){
            return;
        }
        System.out.print("2, ");
        for (int i = 3; i <= n; i += 2){
            if (isPrime(i)){
                System.out.print(i + ", ");
            }
        }
    }

    public static boolean isEven(int number) {
        return (number % 2 == 0);
    }

    public static int countCharacters(String text, char character){
        int count = 0;
        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i) == character){
                count++;
            }
        }
        return count;
    }

    public static float calculatePercentage(int ocurences, int total){
        return (float) ocurences / total * 100;
    }

    public static int[] generateRandomArray(int size, int bound) {
        Random random = new Random();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = random.nextInt(bound) + 1;
        }
        return numbers;
    }

    public static int generateRandomNumber(int bound){
        Random random = new Random();
        return random.nextInt(bound) + 1;
    }

    public static int calculateSum(int... numbers) {
        int sum = 0;
        for (int i = 0;i<numbers.length;i++){
            sum = sum + numbers[i];
        }
        return sum;
    }
}
