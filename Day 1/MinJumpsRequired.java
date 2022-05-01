

public class MinJumpsRequired {

    public static int minJumps(int[] arr){
        // your code here

        int toMove=arr[0];
        int bestSeen=0;
        int bestValue=0;
        int steps=0;
        int curPos=arr[0];
        int idx=0;

        if(arr.length == 1) return -1;

        while(idx+1<arr.length-1)
        {
            if(arr[bestSeen] > 0) {
                idx += 1;

                if (arr[idx] > bestValue) {
                    bestValue = arr[idx];
                    bestSeen = idx;
                }

                toMove--;

                if (toMove == 0) {
                    if (bestValue == 0) return -1;

                    toMove = bestValue;
                    steps++;
                    bestValue = 0;
                    idx = bestSeen;
                }
            }
            else
                return -1;

        }

        //System.out.println(idx);

        return steps+1;

    }

    public static void main(String[] args) {

        int jumps[]={2,1,0,3};
        System.out.println(minJumps(jumps));

    }
}
