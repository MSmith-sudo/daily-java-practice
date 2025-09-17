import java.util.*;

public class MergeIntervals {
  private static int[][] merge(int[][] intervals) {
    if (intervals == null || intervals.length == 0)
      return new int[0][0];

    Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

    List<int[]> result = new ArrayList<>();
    int[] curr = intervals[0];

    for (int i = 1; i < intervals.length; i++) {
      int[] next = intervals[i];

      if (next[0] <= curr[1]) {
        curr[1] = Math.max(curr[1], next[1]); 
      } else {
        result.add(curr);
        curr = next;
      }
    }
    result.add(curr);

    return result.toArray(new int[result.size()][]);
  }

  public static void main(String[] args) {
    int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
    int[][] merged = merge(intervals);
    for (int[] interval : merged) {
      System.out.println(Arrays.toString(interval));
    }
  }
}
