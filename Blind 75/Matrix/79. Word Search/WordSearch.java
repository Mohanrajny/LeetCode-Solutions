public class Solution {
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++)
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board, i, j, word, 0))
                    return true;
            }
        return false;
    }

    private boolean dfs(char[][] board, int i, int j, String word, int idx) {
        if (idx == word.length())
            return true;
        if (i < 0 || i > board.length - 1 || j < 0 || j > board[0].length - 1 || board[i][j] != word.charAt(idx))
            return false;
        board[i][j] = '*'; // use '*' to represent this cell is visited
        boolean result = dfs(board, i - 1, j, word, idx + 1) ||
            dfs(board, i, j - 1, word, idx + 1) ||
            dfs(board, i + 1, j, word, idx + 1) ||
            dfs(board, i, j + 1, word, idx + 1);
        board[i][j] = word.charAt(idx);
        return result;
    }
}
