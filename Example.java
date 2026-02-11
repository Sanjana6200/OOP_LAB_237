import java.util.Scanner;

class Example{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

    System.out.print("enter your name");
    String name = sc.nextLine();

    System.out.print("enter your age");
    int age = sc.nextInt();

    System.out.print("are u a student");
    boolean isStudent = sc.nextBoolean(); 
    
    System.out.println("Hello " + name+ "your age is" +age+ "and student status is" +isStudent);

    sc.close();
    }
}