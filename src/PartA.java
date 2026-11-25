public class PartA {
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3, 4},
                {10, 20, 30, 40},
                {5, 6, 7, 8}
        };
        int bestRow = 0;
        int bestSum = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = 0; j < a[i].length; j++) {
                sum += a[i][j];
            }
            System.out.println("Row " + i + " sum = " + sum);
            if (sum > bestSum) {
                bestSum = sum;
                bestRow = i;
            }
        }
        System.out.println("Largest sum is in row " + bestRow + " (" + bestSum + ")");
    }
}