import java.util.*;

public class SetMatrixZero
{
    public static void setZeroes(int[][] matrix) {

        int Rows=matrix.length;
        int Cols=matrix[0].length;
        int isStartZero=0;

        for(int i=0;i<Rows;i++)
        {
            if(matrix[i][0]==0) isStartZero=1;
            for(int j=1;j<Cols;j++)
            {
                if(matrix[i][j]==0)
                {
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }

        for(int i=Rows-1;i>=0;i--)
        {
            for(int j=Cols-1;j>=1;j--)
            {
                if(matrix[0][j]==0 || matrix[i][0]==0)
                {
                    matrix[i][j]=0;
                }
            }
            if(isStartZero!=0)
            {
                matrix[i][0]=0;
            }
        }
        return;
    }

    public static void main(String[] args) {

        int matrix[][]={{1,1,1},{1,0,1},{1,1,1}};

        setZeroes(matrix);

        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }

            System.out.println();
        }

        return;
    }
}