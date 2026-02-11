public class ControlStructures {

    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        int age = 20;
        int marks = 85;
        int day = 2;

        if (age >= 18) {
            System.out.println("Adult");
        }

        if (marks % 2 == 0) {
            System.out.println("Marks are even");
        } else {
            System.out.println("Marks are odd");
        }

        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else if (marks >= 50) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }

        boolean hasID = true;
        if (age >= 18) {
            if (hasID) {
                System.out.println("Entry allowed");
            }
        }

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Invalid day");
        }

        for (int i = 1; i <= 5; i++) {

            if (i == 2) {
                continue;
            }

            if (i == 4) {
                break;
            }

            System.out.println("For loop: " + i);
        }

        int i = 1;
        while (i <= 3) {
            System.out.println("While loop: " + i);
            i++;
        }

        int j = 1;
        do {
            System.out.println("Do-While loop: " + j);
            j++;
        } while (j <= 2);

        int[] numbers = {10, 20, 30};
        for (int num : numbers) {
            System.out.println("For-each: " + num);
        }

        int sum = add(5, 10);
        System.out.println("Sum = " + sum);
    }
}
