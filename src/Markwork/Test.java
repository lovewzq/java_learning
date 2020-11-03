package Markwork;

import java.util.Scanner;

public class Test {
    public static void main(String[] args)
    {
//        第一题
        test1();
    }

    static void test1()
    {
        int [] nums = new int [10];

        for (int i=0;i<10;i++)
        {
            nums[i] = 10 + i;
        }

//        输出
        for (int j=0;j<nums.length;j++)
        {
            System.out.print(nums[j] + " ");
        }
    }

    static void test2()
    {
        int[] num = {12,4,6,8,21,9};
        for (int i=0;i<num.length;i++)
        {
            System.out.print(i + " " + num[i]);
            System.out.print("\n");
        }
    }

    static void test3()
    {
        Scanner ro = new Scanner(System.in);
        System.out.print("请输入数字：");
        int rows = ro.nextInt();
        int [] nums = new int[rows];

        for (int i=0;i<nums.length;i++)
        {
            if (i==0)
            {
                nums[i] = 0;
            }else if (i==1 || i==2)
            {
                nums[i] = 1;
            }else
            {
                nums[i] = nums[i-1] + nums[i-2];
            }
        }

        System.out.println("到" + rows + "为止的所有的数列：");
        for (int j=0;j<nums.length;j++)
        {
            System.out.print(nums[j] + " ");
        }
        System.out.print("\n");
        System.out.print("斐波那契函数的第" + rows + "个数为：" + nums[rows-1]);
    }

    static void test4()
    {
        int [] nums = {15,16,10,5,19};
        Scanner ro = new Scanner(System.in);
        System.out.print("请输入目标数据：");
        int goal = ro.nextInt();
        int flag = -1;
        for (int i=0;i<nums.length;i++)
        {
            if (nums[i]==goal)
            {
                flag = i;

            }
        }
        if (flag!=-1)
        {
            System.out.print(goal + " 在数组中，数组下标为：" + flag);
        }else
        {
            System.out.print(goal + " 不在数组中！！！");
        }
    }

    static void test5()
    {
        int [] nums = {1,2,3,4,5,6,7,8,9};
        Scanner ro = new Scanner(System.in);
        System.out.print("请输入目标数据：");
        int goal = ro.nextInt();
        int flag = -1;
        for (int i=0;i<nums.length;i++)
        {

        }
    }

    static void test6()
    {
        int [] nums = {9,8,5,4,2,0};
        System.out.print("排序前的数组：");
        for (int k=0;k<nums.length;k++)
        {
            System.out.print(nums[k] + " ");
        }
        System.out.print("\n");

        for (int i=1;i<nums.length;i++)
        {
            for(int j=0;j<nums.length-i;j++)
            {
                if (nums[j]>nums[j+1])
                {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
            System.out.print("第" + i + "次排序后的数组：");
            for (int k=0;k<nums.length;k++)
            {
                System.out.print(nums[k] + " ");
            }
            System.out.print("\n");
        }
        System.out.print("排序后的数组：");
        for (int k=0;k<nums.length;k++)
        {
            System.out.print(nums[k] + " ");
        }
    }

    static void test7()
    {
        int [] nums = {9,8,5,4,2,0};
        System.out.print("排序前的数组：");
        for (int k=0;k<nums.length;k++)
        {
            System.out.print(nums[k] + " ");
        }
        System.out.print("\n");

        for (int i=0;i<nums.length;i++)
        {
            System.out.print("\n");
            for(int j=i+1;j<nums.length;j++)
            {
                if (nums[i]>nums[j])
                {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
            System.out.print("第" + i + "次排序后的数组：");
            for (int k=0;k<nums.length;k++)
            {
                System.out.print(nums[k] + " ");
            }
        }
        System.out.print("\n");
        System.out.print("排序后的数组：");
        for (int k=0;k<nums.length;k++)
        {
            System.out.print(nums[k] + " ");
        }
        System.out.print("\n");
    }

}
