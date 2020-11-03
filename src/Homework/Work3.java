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
        int rows = 10;
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
                    nums[i][j] = nums[i-1][j-1] + nums[i-1][j];
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
        System.out.println("直角输出杨辉三角：");
        for(int i=0; i<nums.length; i++)
        {
            for (int j=0; j<=i; j++)
            {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println("");
        }

//       等腰输出杨辉三角
        System.out.println("等腰输出杨辉三角：");
        for(int i=0; i<nums.length; i++)
        {
//            输出空格
            for (int k=0;k<(rows-i-1);k++)
            {
                System.out.print("   ");
            }
            for (int j=0; j<=i; j++)
            {
                System.out.print(nums[i][j] + "     ");
            }
            System.out.println("");
        }
    }
}
