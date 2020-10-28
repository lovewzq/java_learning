package Homework;

public class Work3 {
    public static void main(String[] args)
    {
        /*
        输出如下的杨辉三角：
                1
              1   1
            1   2   1
          1   3   3   1
        1   4   6   4   1

        */

//        定义杨辉三角的行数
        int rows = 9;

        int [][] nums = new int [rows][rows];

        for (int i=0; i<nums.length; i++)
        {
            for (int j=0; j<=i; j++)
            {
                if (j == 0 || j == i)
                {
                    nums[i][j] = 1;
                }
                else
                {
                    nums[i][j] = nums[i][j-1] + nums[i-1][j];
                }
            }
        }

//        输出直角的杨辉三角，如下：
        /*
        1
        1  1
        1  2  1
        1 3  3  1
        */
        for(int i=0; i<nums.length; i++)
        {
            for (int j=0; j<=i; j++)
            {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
