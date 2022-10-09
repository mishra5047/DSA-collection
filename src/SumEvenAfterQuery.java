class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int evenSum = 0;
        
        for(int x : nums){
            if(!isOdd(x)){
                evenSum += x;
            }
        }
        int[] res = new int[nums.length];
        int idx  = 0;
        for(int i = 0; i< queries.length; i++){
            idx = queries[i][1];
            if(!isOdd(nums[idx])){
                evenSum = evenSum - nums[idx];
            }
            nums[idx] = nums[idx] + queries[i][0];
            if(!isOdd(nums[idx])){
                evenSum = evenSum + nums[idx];
            }
            res[i] = evenSum;
        }
        
        return res;
    }
    
    static boolean isOdd(int num){
        return ((num & 1) == 1);
    }
}
