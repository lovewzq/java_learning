package Homework;

public class TR1 {
    public static void yh(int n) {
        int yh[][]=new int[n][];

        for(int i=0;i<n;i++) {
            yh[i]=new int[i+1];//申请空间，第i行有i+1个数（i从0开始）
            for(int j=0;j<n-i-1;j++) {//打印等腰三角前面的空格
                System.out.print("  ");//两个空格
            }
            for(int j=0;j<i+1;j++) {
                if(j==0||j==yh[i].length-1) {//行首行末为1
                    yh[i][j]=1;
                }else {
                    yh[i][j]=yh[i-1][j]+yh[i-1][j-1];
                }
                System.out.printf("%4s",yh[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        yh(10);
    }

}
