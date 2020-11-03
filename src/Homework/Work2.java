package Homework;

public class Work2 {
    public static void main(String[] args)
    {
        /*
        某学习小组有4位学生，每个学生有3门课程的考试成绩，如下所示。
        科目\姓名   王云  刘静涛 南天华 雷静
        Java基础    77    65    91    84
        前端技术     56    71    88    79
        后端技术     80    81    85    66
        请使用二维数组求各科目的平均成绩和总平均成绩。
        */

        int [][] nums = {{77,65,91,84},{56,71,88,79},{80,81,85,66}};

        int java_sum = 0, front_sum = 0, back_sum = 0;
        double java_avg, front_avg, back_avg;
        double all_avg;

        for (int i=0; i<4; i++)
        {
//            java基础总成绩
            java_sum = java_sum + nums[0][i];

//            前端技术总成绩
            front_sum = front_sum + nums[1][i];

//            后端技术总成绩
            back_sum = back_sum + nums[2][i];
        }

//        平均成绩
        java_avg = (double) java_sum/4;
        front_avg = (double) front_sum/4;
        back_avg = (double) back_sum/4;

        all_avg = (java_avg + front_avg + back_avg)/3;

        System.out.print("Java基础的平均成绩：" + java_avg + "\n");
        System.out.print("前端技术的平均成绩：" + front_avg + "\n");
        System.out.print("后端技术的平均成绩：" + back_avg + "\n");
        System.out.print("全部科目的总平均成绩：" + all_avg + "\n");
    }
}
