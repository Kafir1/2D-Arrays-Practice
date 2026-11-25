public class Main {
    public static void main(String[] args) {
        int[] oneD = {10, 20, 30};

        int[][] twoD = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };
        int a = twoD[2][1]; //a = 80
//        System.out.println(a);

        int[][] empty = new int[3][4]; //3 rows, 4 columns; all values start at 0

        int rows = empty.length; // number of rows
        int col = empty[0].length; //number of columns in row 0
        int sum = 0;
        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++) {
                System.out.print(twoD[i][j] + " ");
                sum += twoD[i][j];
            }
            System.out.println();
        }
        System.out.println("Sum: " + sum);
        System.out.println();

        int[][] b = {
                {10, 5, 3},
                {-12, 55, -7},
                {0, 10, 6}
        };
        int max = b[0][0];
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + " ");
                if (b[i][j] > max)
                    max = b[i][j];
            }
            System.out.println();
        }
        System.out.println("Max: " + max);

    }
}