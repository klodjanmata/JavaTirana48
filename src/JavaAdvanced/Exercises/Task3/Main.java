package JavaAdvanced.Exercises.Task3;

public class Main {
    public static void main(String[] args) {
        Shape sh1 = new Shape("blue",true);
        System.out.println(sh1);
        sh1 = new Circle("red", false, 5);
        System.out.println(sh1);
        sh1 = new Rectangle("green", false, 5, 8);
        System.out.println(sh1);
        sh1 = new Square("purple", true, 7);
        System.out.println(sh1);
    }
}
