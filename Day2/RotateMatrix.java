package Day2;
import java .util.*;

public class RotateMatrix{

    public static void rightRotate(int matrix[][])
    {
        int R=matrix.length;
        int C=matrix[0].length;

        for(int i=0;i<R;i++)
        {
            for(int j=0;j<i;j++)
            {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }


        for(int i=0;i<R;i++)
        {
            int start=0;
            int end = matrix[i].length-1;
            while(start<end)
            {
                int temp=matrix[i][start];
                matrix[i][start]=matrix[i][end];
                matrix[i][end]=temp;
                start++;
                end--;
            }
        }
    }





    public static void main(String[] args) {

        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};

        rightRotate(matrix);

        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}