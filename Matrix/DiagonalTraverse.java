import java.util.*;

public class DiagonalTraverse{
  private static in[] findDiagonalOrder(int[][] matrix){
    if (matrix == null || matrix.length == 0) return new int[0];
    int m = matrix.length, n = matrix[0].length;
    int[] result = new int[m * n];
    int r = 0, c = 0, d = 1;
    for(int i = 0; i < result.length; i++){
      result[i] = matrix[r][c];
      int newR = r + (d == 1 ? -1 : 1);
      int newC = c + (d == 1 ? 1 : -1);
      if(newR < 0 || newR == m || newC < 0 || newC == n){
        if(dir == 1){
          r += (c == n - 1 ? 1 : 0);
          c += (c < n - 1 ? 1 : 0);
        } else{
          c += (r == m - 1 ? 1 : 0);
          r += (r < m - 1 ? 1 : 0);
        }
        d = 1 - d;
      } else{
        r = newR;
        c = newC;
      }
    }
  }
  return result;
}

  public static void main(String[] args){
    int[][] matrix = {
      {1, 2, 3},
      {4, 5, 6},
      {7, 8, 9}
    };
    int[] result = findDiagonalOrder(matrix);
  }
}