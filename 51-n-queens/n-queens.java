import java.util.*;

class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();

        char[][] board = new char[n][n];
        for (char[] row : board) Arrays.fill(row, '.');

        Set<Integer> cols = new HashSet<>();
        Set<Integer> diag = new HashSet<>();
        Set<Integer> antiDiag = new HashSet<>();

        backtrack(0, n, board, res, cols, diag, antiDiag);
        return res;
    }

    private void backtrack(int r, int n, char[][] board,
                           List<List<String>> res,
                           Set<Integer> cols,
                           Set<Integer> diag,
                           Set<Integer> antiDiag) {

        if (r == n) {
            res.add(construct(board));
            return;
        }

        for (int c = 0; c < n; c++) {
            int d = r - c;
            int ad = r + c;

            if (cols.contains(c) || diag.contains(d) || antiDiag.contains(ad)) {
                continue;
            }

            board[r][c] = 'Q';
            cols.add(c);
            diag.add(d);
            antiDiag.add(ad);

            backtrack(r + 1, n, board, res, cols, diag, antiDiag);

            board[r][c] = '.';
            cols.remove(c);
            diag.remove(d);
            antiDiag.remove(ad);
        }
    }

    private List<String> construct(char[][] board) {
        List<String> list = new ArrayList<>();
        for (char[] row : board) {
            list.add(new String(row));
        }
        return list;
    }
}