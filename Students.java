import java.util.Scanner;

class Students {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student roll number: ");
        int rollNo = sc.nextInt();

        System.out.print("Enter student grade: ");
        char grade = sc.next().charAt(0);

        System.out.print("Enter student percentage: ");
        double percentage = sc.nextDouble();

        System.out.print("Is the student passed? (true/false): ");
        boolean isPassed = sc.nextBoolean();

       

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.println("\n--- Student Details ---");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Grade: " + grade);
        System.out.println("Percentage: " + percentage);
        System.out.println("Passed: " + isPassed);
        System.out.println("Name: " + name);

        sc.close();
    }
}
