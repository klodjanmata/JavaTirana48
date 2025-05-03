package java.JavaFundamentalsCoding.Task5;

import java.JavaFundamentalsCoding.Helper;

public class PrintPrimes {
    public static void main(String[] args) {
        System.out.println("Jepni nje numer natyror: ");
        int n = Helper.getIntFromUser();
        Helper.printPrimeNumbers(n);
    }
}
