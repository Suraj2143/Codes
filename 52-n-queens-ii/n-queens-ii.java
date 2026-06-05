import java.util.*;

class Solution {
    int count = 0;

    public int totalNQueens(int n) {
        Set<Integer> cols = new HashSet<>();
        Set<Integer> diag = new HashSet<>();
        Set<Integer> antiDiag = new HashSet<>();

        backtrack(0, n, cols, diag, antiDiag);
        return count;
    }

    private void backtrack(int r, int n,
                           Set<Integer> cols,
                           Set<Integer> diag,
                           Set<Integer> antiDiag) {

        if (r == n) {
            count++;
            return;
        }

        for (int c = 0; c < n; c++) {
            int d = r - c;
            int ad = r + c;

            if (cols.contains(c) || diag.contains(d) || antiDiag.contains(ad)) {
                continue;
            }

            cols.add(c);
            diag.add(d);
            antiDiag.add(ad);

            backtrack(r + 1, n, cols, diag, antiDiag);

            cols.remove(c);
            diag.remove(d);
            antiDiag.remove(ad);
        }
    }
}