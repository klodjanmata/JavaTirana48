package University.Entity;

public enum Department {
    ELECTRONICS,
    STATISTICS,
    MARKETING,
    FINANCE,
    ENGINEERING,
    ARCHITECTURE;

    public static void printChoseDepartment(){
        System.out.println(
                "1 - Electronics\n" +
                "2 - Statistics\n" +
                "3 - Marketing\n" +
                "4 - Finance\n" +
                "5 - Engineering\n" +
                "6 - Architecture");
    }
}
