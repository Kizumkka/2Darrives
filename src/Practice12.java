public class Practice12 {
    public static void main(String[] args) {
        int[][] g = {
                {80, 90, 70, 85},
                {60, 75, 88, 92},
                {95, 82, 79, 100}
        };
        int max = g[0][0];
        int total = 0;

        for (int i = 0; i < g.length; i++) {
            int sum = 0;
            for (int j = 0; j < g[i].length; j++) {
                sum += g[i][j];
                if (g[i][j] > max) max = g[i][j];
            }
            total += sum;
            System.out.println("Student " + (i + 1) + " average = " + (double) sum / g[i].length);
        }
        System.out.println("Class maximum = " + max);
        System.out.println("Overall average = " + (double) total / (g.length * g[0].length));
    }
}