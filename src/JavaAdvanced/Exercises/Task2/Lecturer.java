package JavaAdvanced.Exercises.Task2;

public class Lecturer extends Person{
    private String specialization;
    private int salary;

    public Lecturer(String specialization, int salary) {
        super();
        this.specialization = specialization;
        this.salary = salary;
    }

    public Lecturer(String name, String address, String specialization, int salary) {
        super(name, address);
        this.specialization = specialization;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return " -> " + specialization + " -> " + salary;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}