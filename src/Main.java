import java.util.Scanner;

class Main {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {
            int s = scanner.nextInt();
            System.out.println(Problem_Collatza(s));
            t--;
        }
    }

    public static int Problem_Collatza(int n) {
        int x = 0;

        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n * 3 + 1;
            }
        x++;
        }
        return x;
    }
}
