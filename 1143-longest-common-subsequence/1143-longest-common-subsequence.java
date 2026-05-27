class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int [][] rr=new int[text1.length()+1][text2.length()+1];
        for(int i =0; i<rr.length;i++){
            for (int j=0;j<rr[0].length;j++){
                rr[i][j]=-1;
            }
        }

         return solve(text1, text2, 0, 0,rr);
    }

    public int solve(String text1, String text2, int i, int j,int [][]rr) {
        if (i == text1.length() || j == text2.length()) {
            return 0;
        }
        if(rr[i][j]>-1){
            return rr[i][j];
        }
        if (text1.charAt(i) == text2.charAt(j)) {
            return rr[i][j]=1 + solve(text1, text2, i + 1, j + 1,rr);
        }
        return rr[i][j]= Math.max(
                solve(text1, text2, i + 1, j,rr),
                solve(text1, text2, i, j + 1,rr)
        );
    }
}