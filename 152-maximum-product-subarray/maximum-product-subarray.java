class Solution {
    public int maxProduct(int[] nums) {
        int maxProd = nums[0];
        int minProd = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];

            int tempMax = maxProd;

            maxProd = Math.max(curr,
                      Math.max(curr * maxProd, curr * minProd));

            minProd = Math.min(curr,
                      Math.min(curr * tempMax, curr * minProd));

            result = Math.max(result, maxProd);
        }

        return result;
    }
}