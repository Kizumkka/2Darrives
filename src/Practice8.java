import java.util.Scanner;

public class Practice8 {
    public static void main(String[] args) {
        int[][] a = {
                {1, 12, 3},
                {14, 5, 26},
                {7, 18, 9}
        };
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int t = sc.nextInt();

        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > t) count++;
            }
        }
        System.out.println("Values greater than " + t + ": " + count);
        sc.close();
    }
}