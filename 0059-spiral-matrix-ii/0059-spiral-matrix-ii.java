class Solution {
    public int[][] generateMatrix(int n) {

        int matrix[][] = new int[n][n];
        int count = 1;
        int sr = 0, sc=0;
        int er = matrix.length-1;
        int ec = matrix[0].length-1;


        while(sr <= er && sc<= ec){
            for(int j=sc; j<=ec; j++){
                matrix[sr][j] = count;
                count++;
            }

            for(int i=sr+1; i<=er; i++){
                matrix[i][ec] = count;
                count++;
            }

            for(int j=ec-1; j>=sc; j--){
                if(sr == er){
                    break;
                }
                matrix[er][j] = count;
                count++;
            }

            for(int i=er-1; i>=sr+1; i--){
                if(sc == ec){
                    break;
                }
                matrix[i][sc] = count;
                count++;
            }
            sr++;
            sc++;
            er--;
            ec--;
        }

        return matrix;
    }
}