public class JumpStatements {

    public static int checkNumber(int num) {
        if (num < 0) {
            return -1;
        }
        return num;
    }

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            if (i == 2) {
                continue;
            }

            if (i == 4) {
                break;
            }

            System.out.println("Number: " + i);
        }

        int result = checkNumber(10);
        System.out.println("Result: " + result);
    }
}
