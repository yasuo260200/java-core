import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        System.out.println("nhap n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

        }
        System.out.println("*");
    }
}
