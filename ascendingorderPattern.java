import java.util.Scanner;

public class ascendingorderPattern {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter n\n");
        int n = s.nextInt();
        int number = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println(" ");
        }
    }

}
