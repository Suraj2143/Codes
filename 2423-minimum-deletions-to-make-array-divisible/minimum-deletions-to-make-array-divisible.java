class Solution {
    public static int gcd(int a,int b){
        while(b!=0){
            int temp=a%b;
            a=b;
            b=temp;
        }
        return a;
    }
    public int minOperations(int[] nums, int[] numsDivide) {

        int result=numsDivide[0];
        for(int i=1;i<numsDivide.length;i++){
            result=gcd(numsDivide[i],result);
        }
        // int count=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
           if(result%nums[i]==0) return i; 
        }
        return -1;

    }
}