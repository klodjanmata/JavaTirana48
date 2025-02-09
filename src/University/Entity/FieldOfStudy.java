package University.Entity;

public enum FieldOfStudy {
    INFORMATICS,
    PROGRAMMING,
    MECHANICS,
    STATISTICS;

    public static void printChoseField() {
        System.out.println(
                "1 - Informatics" +
                "2 - Programming" +
                "3 - Mechanics" +
                "4 - Statistics"
        );
    }

}
