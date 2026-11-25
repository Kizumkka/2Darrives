import java.util.Scanner;

public class Practice9 {
    public static void main(String[] args) {
        int[][] a = {
                {4, 8, 15},
                {16, 23, 42},
                {7, 8, 9}
        };
        Scanner sc = new Scanner(System.in);
        System.out.print("Value to find: ");
        int x = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < a.length && !found; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == x) {
                    System.out.println("Found at row " + i + ", column " + j);
                    found = true;
                    break;
                }
            }
        }
        if (!found) System.out.println("Not found");
        sc.close();
    }
}