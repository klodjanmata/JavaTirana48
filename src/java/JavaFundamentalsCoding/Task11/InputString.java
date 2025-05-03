package java.JavaFundamentalsCoding.Task11;

import java.JavaFundamentalsCoding.Helper;

public class InputString {
    public static void main(String[] args) {
        System.out.println("Enter text or \"Enough!\" to stop: ");
        String longest = "";
        while(true){
            String input = Helper.getStringFromUser();
            if (input.equals("Enough!")){
                break;
            }
            if (input.length() > longest.length()){
                longest = input;
            }
        }
        System.out.println("The longest strin" +
                "g is: " + longest);
    }
}
