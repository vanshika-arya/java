import java.util.Arrays;
public class MergeIntervals {
    
    public static void mergeIntervals(int[][] intervals) {
        // Step 1: Sort intervals by start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        int n = intervals.length;
        int index = 0; // Index of last merged interval

        for (int i = 1; i < n; i++) {
            // If current overlaps with last merged
            if (intervals[index][1] >= intervals[i][0]) {
                intervals[index][1] = Math.max(intervals[index][1], intervals[i][1]);
            } else {
                index++;
                intervals[index] = intervals[i]; // copy current to next position
            }
        }

        // Print merged intervals
        System.out.println("Merged Intervals:");
        for (int i = 0; i <= index; i++) {
            System.out.println("[" + intervals[i][0] + ", " + intervals[i][1] + "]");
        }
    }

    public static void main(String[] args) {
        int[][] intervals = { {1, 3}, {2, 6}, {8, 10}, {15, 18} };
        mergeIntervals(intervals);
    }
}