public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("\nHello from student\n");
            return;
        }

        String studentName = args[0];
        System.out.printf("\nHello from %s!\n", studentName);
    }
}
