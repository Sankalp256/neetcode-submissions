class Solution {
    public boolean isValidSudoku(char[][] board) {
      Map<Integer,Set<Character>> cols = new HashMap<>();
      Map<Integer,Set<Character>> rows = new HashMap<>();
      Map<String,Set<Character>> squares = new HashMap<>();

      for(int i =0 ;i <9; i++){
        for (int j=0;j<9;j++)
        {
          if(board[i][j] == '.') continue;

          String squareKey = (i/3) + "," + (j/3);

          if(rows.get(i) == null){
            rows.put(i, new HashSet<>());
          }

          if(cols.get(j) == null){
            cols.put(j, new HashSet<>());
          }

          if(squares.get(squareKey) == null){
            squares.put(squareKey, new HashSet<>());
          }

         if(rows.get(i).contains(board[i][j]) || cols.get(j).contains(board[i][j])
         || squares.get(squareKey).contains(board[i][j]))
         return false;

         rows.get(i).add(board[i][j]);
         cols.get(j).add(board[i][j]);
         squares.get(squareKey).add(board[i][j]);

        }
      }

      return true;
        
    }
}
