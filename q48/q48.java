public class q48 {
  public static void main(String args[]) {
    int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
  }
  public void rotate(int[][] matrix) {

    int n = matrix.length;

    for (int i = 0; i<=n-2; i++) {
      for (int j = i + 1; j < n; j++) {
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
      }
    }

    for (int i = 0; i<n; i++) {
      for (int j = 0; j<n/2; j++) {
        int temp = arr[i][j];
        arr[i][j] = arr[i][n-1-j];
        arr[i][n-1-j] = temp;
      }
    }
  }
}
