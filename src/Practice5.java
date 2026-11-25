public class Practice5 {
    public static void main(String[] args) {
        int[][] a = {
                {12, 5, 8, 30},
                {7, 44, 3, 19},
                {25, 1, 60, 9}
        };
        int min = a[0][0];
        int max = a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] < min) min = a[i][j];
                if (a[i][j] > max) max = a[i][j];
            }
        }
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }
}