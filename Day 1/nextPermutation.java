import java.util.Arrays;

public class nextPermutation {
    private static void find_next_greater_permutation(int[] nums) {

        int N=nums.length;

        //Ist step found the first number such that nums[i] <=nums[i+1]
        int idx=nums.length-2;
        while(idx>=0 && nums[idx] >= nums[idx+1])
        {
            idx--;
        }

        System.out.println(idx+" $");

        int idx2=N-1;
        if(idx>=0)
        {
            //IInd step found the number that is just greater than num[idx]

            while(nums[idx2] <= nums[idx])
            {
                idx2--;
            }


            //Step 3 Swap the elements foun so far
            int temp=nums[idx];
            nums[idx]=nums[idx2];
            nums[idx2]=temp;
        }


        //Final step Reverse
        int s=idx+1;
        int e=N-1;

        while(s<=e)
        {
            int temp=nums[s];
            nums[s]=nums[e];
            nums[e]=temp;
            s++;
            e--;
        }

        System.out.println(Arrays.toString(nums));
        return;
    }
    public static void main(String[] args) {

        int arr[]={4,1,9,5};
        find_next_greater_permutation(arr);
       // System.out.println(find_next_greater_permutation(arr));
    }


}
