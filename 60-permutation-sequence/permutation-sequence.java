import java.util.*;

class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= n; i++) nums.add(i);

        int fact = 1;
        for (int i = 1; i < n; i++) fact *= i;

        k--;

        StringBuilder sb = new StringBuilder();

        for (int i = n; i > 0; i--) {
            int idx = k / fact;
            sb.append(nums.get(idx));
            nums.remove(idx);

            if (i > 1) {
                k %= fact;
                fact /= (i - 1);
            }
        }
        return sb.toString();
    }
}