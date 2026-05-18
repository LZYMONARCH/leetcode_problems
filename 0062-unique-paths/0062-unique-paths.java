class Solution {
    int arr[][];
    public int uniquePaths(int m, int n) {
         arr = new int[m][n];
          for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j]=-1;
            }
            }

        return solve(0,0,m,n);
        
    }
     public int solve(int i, int j, int m, int n) {
        if(i == m - 1 && j == n - 1) {
            return 1;
        }
        if(i >= m || j >= n) {
            return 0;
        }
        if(arr[i][j]!=-1){
            return arr[i][j];
        }
        int a= solve(i + 1, j, m, n);
             int b= solve(i, j + 1, m, n);
           arr[i][j]=a+b;
           return arr[i][j];
    }
}