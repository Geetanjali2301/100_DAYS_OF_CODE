package DAY_66;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mergeIntervals {

    public static int[][] merge(int[][] intervals) 
    {
        if (intervals.length <= 1) return intervals;
        Arrays.sort(intervals, (arr1, arr2) -> Integer.compare(arr1[0], arr2[0]));

        List<int[]> arr = new ArrayList<>();
        int[] current_interval = intervals[0];
        arr.add(current_interval);

        for (int[] interval : intervals) {
            int current_begin = current_interval[0];
            int current_end = current_interval[1];
            int next_begin = interval[0];
            int next_end = interval[1];

            if (current_end >= next_begin) {
                current_interval[0] = Math.min(current_begin, next_begin);
                current_interval[1] = Math.max(current_end, next_end);
            } else {
                current_interval = interval; 
                arr.add(current_interval);
            }
        }

        return arr.toArray(new int[arr.size()][]);
        
    }

    public static void main(String[] args) {
        int arr[][]={{1,3},{2,6},{8,10},{15,18}};
        int ans[][]=merge(arr);
        for(int i=0;i<ans.length;i++)
        {
            for(int j=0;j<ans[0].length;j++)
            {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
