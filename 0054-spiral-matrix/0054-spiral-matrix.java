class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();

        int sr = 0, sc=0;
        int er = matrix.length-1;
        int ec = matrix[0].length-1;


        while(sr <= er && sc<= ec){
            for(int j=sc; j<=ec; j++){
                list.add(matrix[sr][j]);
            }

            for(int i=sr+1; i<=er; i++){
                list.add(matrix[i][ec]);
            }

            for(int j=ec-1; j>=sc; j--){
                if(sr == er){
                    break;
                }
                list.add(matrix[er][j]);
            }

            for(int i=er-1; i>=sr+1; i--){
                if(sc == ec){
                    break;
                }
                list.add(matrix[i][sc]);
            }
            sr++;
            sc++;
            er--;
            ec--;
        }

        return list;
    }
}