package Homework;

public class Work1 {
    public static void main(String[] args)
    {
        /*
        定义二维数组，初始化值为：
         3    7    2
         10   5    1
         8    14   4
         求数组元素之和，以及数组元素平均值。
         */
        int [][] nums = {{3,7,2},{10,5,1},{8,14,4}};
        int sum = 0;
        double avg = 0.0;

        for(int i=0;i<nums.length;i++)
        {
            for (int j=0;j<nums[i].length;j++)
            {
                sum = sum + nums[i][j];
            }
        }

        avg = (double) sum/9;

        System.out.print("二维数组的和为：" + sum + " 平均值为：" + avg);
    }
}
