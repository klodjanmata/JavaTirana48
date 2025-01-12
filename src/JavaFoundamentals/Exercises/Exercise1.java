package JavaFoundamentals;


import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vendos nje numer:");

        int number = scanner.nextInt();
        int gameCount = 0;
        int score = 0;

        while(number != 0){
            gameCount++;
            if (number % 7 == 0) {
                System.out.println("Numri plotepjestohet me 7!");
                score++;
            } else {
                System.out.println("Numri nuk plotepjestohet me 7!\nMbetja eshte:" + number % 7);
            }
            System.out.println("\nVendos nje numer ose vendos 0 per te ndaluar:");
            number = scanner.nextInt();
        }
        System.out.println("Piket tuaja: " + score + "/" + gameCount);
    }
}