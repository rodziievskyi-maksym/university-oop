public class Student {
    public String name;
    public Integer age;
    public Float grade;

    public void displayInfo() {
        System.out.printf(
                "Student Information:\n Name: %s\n Age: %d\n Grade: %.2f\n",
                name, age, grade
        );
    }
}
