import java.util.Scanner;

class DecToBinary {
    static String binary(int n) {
        String s;
        if (n == 0)
            return "0";
        if (n == 1)
            return "1";

        if (n % 2 == 0)
            s = "0";
        else
            s = "1";

        return binary(n / 2) + s;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(binary(n));
        scanner.close();
    }
}
