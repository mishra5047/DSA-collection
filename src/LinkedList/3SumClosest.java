class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int diff = Integer.MAX_VALUE;
        int sum = 0;
        Arrays.sort(nums);

        for(int i =0; i < nums.length; i++){
            int j = i + 1, k = nums.length - 1;

            while(j < k){
                int tempSum =nums[i] + nums[j] + nums[k];
                int tempDiffAbs = Math.abs(target - (tempSum));

                if(tempDiffAbs == 0){
                    return tempSum;
                }else if(tempDiffAbs < Math.abs(diff)){
                   diff = tempDiffAbs;
                    sum = tempSum;
                }
                
                if(tempSum > target){
                    k--;
                }else{
                    j++;
                }
            }
        }

        return sum;
    }
}
