import java.util.List;

public class StudentManager {

    import java.util.List;

public class StudentManager {

    // Using Java 17 'record' to define a simple data class
    record Student(String name, int age, String grade) {}

    public static void main(String[] args) {
        // List of students
        List<Student> students = List.of(
            new Student("Anjali", 19, "A"),
            new Student("Ravi", 20, "B"),
            new Student("Meena", 18, "A"),
            new Student("Amit", 21, "C")
        );

        System.out.println("All Students:");
        students.forEach(System.out::println);

        System.out.println("\nStudents with Grade A:");
        students.stream()
                .filter(s -> s.grade().equals("A"))
                .forEach(System.out::println);

        // Example of enhanced switch expression
        System.out.println("\nFeedback based on grade:");
        for (Student s : students) {
            String feedback = switch (s.grade()) {
                case "A" -> "Excellent!";
                case "B" -> "Good.";
                case "C" -> "Needs Improvement.";
                default -> "No feedback.";
            };
            System.out.printf("%s: %s%n", s.name(), feedback);
        }
    }
}import java.util.List;

public class StudentManager {

    // Using Java 17 'record' to define a simple data class
    record Student(String name, int age, String grade) {}

    public static void main(String[] args) {
        // List of students
        List<Student> students = List.of(
            new Student("Anjali", 19, "A"),
            new Student("Ravi", 20, "B"),
            new Student("Meena", 18, "A"),
            new Student("Amit", 21, "C")
        );

        System.out.println("All Students:");
        students.forEach(System.out::println);

        System.out.println("\nStudents with Grade A:");
        students.stream()
                .filter(s -> s.grade().equals("A"))
                .forEach(System.out::println);

        // Example of enhanced switch expression
        System.out.println("\nFeedback based on grade:");
        for (Student s : students) {
            String feedback = switch (s.grade()) {
                case "A" -> "Excellent!";
                case "B" -> "Good.";
                case "C" -> "Needs Improvement.";
                default -> "No feedback.";
            };
            System.out.printf("%s: %s%n", s.name(), feedback);
        }
    }
}
    record Student(String name, int age, String grade) {}

    public static void main(String[] args) {
        // List of students
        List<Student> students = List.of(
            new Student("Anjali", 19, "A"),
            new Student("Ravi", 20, "B"),
            new Student("Meena", 18, "A"),
            new Student("Amit", 21, "C")
        );

        System.out.println("All Students:");
        students.forEach(System.out::println);

        System.out.println("\nStudents with Grade A:");
        students.stream()
                .filter(s -> s.grade().equals("A"))
                .forEach(System.out::println);

        // Example of enhanced switch expression
        System.out.println("\nFeedback based on grade:");
        for (Student s : students) {
            String feedback = switch (s.grade()) {
                case "A" -> "Excellent!";
                case "B" -> "Good.";
                case "C" -> "Needs Improvement.";
                default -> "No feedback.";
            };
            System.out.printf("%s: %s%n", s.name(), feedback);
        }
    }
}