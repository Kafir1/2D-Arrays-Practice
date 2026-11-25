import java.util.Scanner;
public class Task6_12 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

//        //Task 6
        int[][] mat = new int[2][3];
        System.out.println("Enter 6 elements of matrix: ");
        for (int i=0; i< mat.length; i++){
            for (int j=0; j<mat[i].length; j++){
                mat[i][j] = in.nextInt();
            }
        }
        System.out.println("Matrix: ");
        for (int i=0; i< mat.length; i++){
            for (int j=0; j<mat[i].length; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        //Task 7
        System.out.println();
        int[][] columns = {
                {13, 97, -35},
                {64, 9, 25},
                {-17, 18, 51}
        };
        System.out.println("2D array: ");
        for (int[] array : columns){
            for (int a : array)
                System.out.print(a + " ");
            System.out.println();
        }
        for (int j = 0; j < columns.length; j++){
            int colSum = 0;
            for (int i = 0; i < columns[j].length; i++)
                colSum += columns[i][j];
            System.out.println("Column " + (j+1) + " sum: " + colSum);
        }

        //Task 8
        System.out.println();
        System.out.print("Enter a threshold: ");
        int hold = in.nextInt();
        int count = 0;
        for (int[] array : columns){
            for (int a : array){
                if (a > hold){
                    count++;
                }
            }
        }
        if (count != 1)
            System.out.println(count + " values are greater than threshold.");
        else {
            System.out.println("1 value is greater than threshold.");
        }

        //Task 9
        System.out.println(search(columns));

        //Task 10
        System.out.println();
        int[][] dio = {
                {24, 87, -14},
                {-71, 56, 93},
                {38, 84, 69}
        };
        for (int[] array : dio){
            for (int num : array)
                System.out.print(num + " ");
            System.out.println();
        }
        int dsum = 0;
        for (int i = 0; i < dio.length; i++){
            dsum += dio[i][i];
        }
        System.out.println("Diagonal sum: " + dsum);

        //Task 11
        System.out.println();
        System.out.println("Original: ");
        for (int[] array : dio){
            for (int num : array)
                System.out.print(num + " ");
            System.out.println();
        }
        System.out.println();
        System.out.println("Updated: ");
        for (int[] array : dio){
            for (int num : array) {
                if (num < 0)
                    num = 0;
                System.out.print(num + " ");
            }
            System.out.println();
        }

        //Task 12
        int[][] scores = {
                {64, 48, 87, 95},
                {9, 84, 51, 71},
                {19, 93, 45, 81}
        };
        int max = scores[0][0];

        for (int i = 0; i < scores.length; i++){
            System.out.print("Student " + (i+1) + ": ");
            for (int j = 0; j < scores[i].length; j++){
                System.out.print(scores[i][j] + " ");
                if (scores[i][j] > max)
                    max = scores[i][j];
            }
            System.out.println();
        }
        System.out.println();
        double overall = 0;
        for (int i = 0; i < scores.length; i++){
            double avg = 0;
            System.out.print("Student " + (i+1) + " average score: ");
            for (int j = 0; j < scores[i].length; j++){
                avg += scores[i][j];
                overall += scores[i][j];
            }
            avg = avg/scores[i].length;
            System.out.println(avg);
        }
        overall = overall/(scores.length*scores[0].length);
        System.out.println("Class maximum: " + max);
        System.out.println("Overall average: " + overall);
    }

    //Task 9
    public static String search(int[][] a){
        System.out.println();
        Scanner in = new Scanner(System.in);
        System.out.println("Matrix: ");
        for (int[] array : a){
            for (int num : array)
                System.out.print(num + " ");
            System.out.println();
        }
        System.out.println();
        System.out.print("Find: ");
        int find = in.nextInt();
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a.length; j++){
                if (a[i][j] == find){
                    return "Found it! \nRow: " + (i+1) + "\nColumn: " + (j+1);
                }
            }
        }
        return "Not found.";
    }
}
