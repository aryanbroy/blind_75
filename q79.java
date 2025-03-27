public class q79 {
    public static void main(String[] args) {

    }

    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;
        boolean[][] visited = new boolean[rows][cols];

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (dfs(board, r, c, 0, word, visited)) {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean dfs(char[][] board, int row, int col, int index, String word, boolean[][] visited) {
        int rows = board.length;
        int cols = board[0].length;

        if (index == word.length()) {
            return true;
        }

        if (row < 0 || col < 0 || row >= rows || col >= cols || visited[row][col]
                || board[row][col] != word.charAt(index)) {
            return false;
        }

        visited[row][col] = true;

        boolean found = dfs(board, row - 1, col, index + 1, word, visited)
                || dfs(board, row + 1, col, index + 1, word, visited)
                || dfs(board, row, col - 1, index + 1, word, visited)
                || dfs(board, row, col + 1, index + 1, word, visited);

        visited[row][col] = false;

        return found;
    }
}
