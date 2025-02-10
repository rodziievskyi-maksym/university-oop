public class Main {
    public static void main(String[] args) {
        Student studentOne = new Student();

        studentOne.name = "Maksym";
        studentOne.age = 29;
        studentOne.grade = 9.99f;

        studentOne.displayInfo();

        Student studentTwo = new Student();

        studentTwo.name = "Jon";
        studentTwo.age = 35;
        studentTwo.grade = 10.99f;

        studentTwo.displayInfo();
    }
}