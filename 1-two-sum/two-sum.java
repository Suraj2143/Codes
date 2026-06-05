class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0; i<nums.length;i++){
            int SecondElement= target-nums[i];
            if(map.containsKey(SecondElement)){
                return new int[]{map.get(SecondElement),i};// return the index of both elements which is equal to target
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}