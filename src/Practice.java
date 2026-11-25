
public class Practice {
    public static void main(String[] args){
        int[][] nine = new int[3][3];
        int num = 1;
        int sum  = 0;
        int even = 0;
        int odd = 0;

        //Task 1
        for (int i = 0; i < nine.length; i++){
            for (int j = 0; j < nine[i].length; j++){
                nine[i][j] = num;
                System.out.print(nine[i][j] + " ");
                sum += nine[i][j];        //Task 3
                if (nine[i][j]%2==0)
                    even++;               //Task 4
                else {
                    odd++;                //Task 4
                }
                num++;
            }
            System.out.println();
        }
        System.out.println("Sum: " + sum);      //Task 3

        System.out.println("Even: " + even);    //Task 4
        System.out.println("Odd: " + odd);      //Task 4

        int[][] nums = {
                {5, 10, 15},
                {20, 25, 30}
        };

        //Task 2
        System.out.println();
        System.out.println(nums[1][2]);
        nums[0][1] = 99;
        System.out.println(nums[0][1]);
        for (int[] array : nums){
            for (int a : array)
                System.out.print(a + " ");
            System.out.println();
        }

        //Task 5
        System.out.println();
        int max = nine[0][0];
        int min = nine[0][0];
        for (int  i = 0; i < nine.length; i++){
            for (int j = 0; j < nine[i].length; j++){
                if (nine[i][j] > max)
                    max = nine[i][j];
                if (nine[i][j] < min)
                    min = nine[i][j];
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);


    }
}
