public class Main {
    public static void main(String[] args) {
        int num = 10;
        int num2 = 50;
        evenOddNumber(num);
        numberInInterval(num2);
    }

    public static boolean evenOddNumber(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean numberInInterval(int n) {
        if (n > 25 && n < 100) {
            return true;
        } else {
            return false;
        }
    }
}

