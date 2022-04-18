import java.util.*;

public class PascalTriangle {

    public static List<List<Integer>> generate(int numRows) {

        int currRow=0;
        List<List<Integer>> Matrix = new ArrayList<>();

        while(currRow<numRows)
        {
            int NumElements = currRow+1;
            List<Integer> thisRow = new ArrayList<>();

            Matrix.add(thisRow);



            for(int j=0;j<NumElements;j++)
            {
                //Taking care of 0th element and Kth Element
                if(j==0 || j==NumElements-1) thisRow.add(1);

                else
                {
                    int prevRow = currRow <= 1 ? currRow : currRow-1;
                    int newElement = Matrix.get(currRow-1).get(j-1) + Matrix.get(currRow-1).get(j);
                    thisRow.add(newElement);
                }
            }

            currRow++;
        }
        for(int i=0;i<Matrix.size();i++)
        {
            for(int j=0;j<Matrix.get(i).size();j++)
            {
                System.out.print(Matrix.get(i).get(j)+" ");
            }

            System.out.println();
        }
        return Matrix;
    }
    public static void main(String[] args) {

        generate(9);
    }
}
