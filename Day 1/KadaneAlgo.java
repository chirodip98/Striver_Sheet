import java.util.*;
public class KadaneAlgo {
    private static List<Integer> Kandane(int[] arr) {

        List<Integer> ans = new ArrayList<>();
        int max_seen_so_far=arr[0];
        int max_end_here=0;
        int start=0;
        for(int i=0;i<arr.length;i++)
        {
            max_end_here+=arr[i];
            if(max_end_here >max_seen_so_far)
            {
                ans.clear();
                max_seen_so_far=max_end_here;
                int k=start;
                while(k<=i)
                    ans.add(arr[k++]);

            }
            if(max_end_here<0)
            {
                max_end_here=0;
                start=i+1;
            }
        }
        System.out.println("The maximum sum obtained: "+max_seen_so_far);
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,5,4};
        System.out.println(Kandane(arr).toString());
    }


}
