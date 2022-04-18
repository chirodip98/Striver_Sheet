import java.util.*;
public class KadaneAlgo {
    private static int Kandane(int[] arr) {

        int max_seen_so_far=Integer.MIN_VALUE;
        int max_end_here=0;
        for(int i=0;i<arr.length;i++)
        {
            max_end_here+=arr[i];
            if(max_end_here >max_seen_so_far)
            {
                max_seen_so_far=max_end_here;
            }
            if(max_end_here<0)
            {
                max_end_here=0;
            }
        }

        return max_seen_so_far;
    }
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        int x = Kandane(arr);
        System.out.println("The maximum sum obtained: "+x);
    }


}
