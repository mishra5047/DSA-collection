    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result , nums , 0);
        return result;
    }
    private static void backtrack(List<List<Integer>> result , int[] nums , int start){
        if(start==nums.length){
            result.add(toList(nums));
        }else{
            for (int i = start; i < nums.length; i++) {
                swap(i , start , nums);
                backtrack(result, nums, start+1);
                swap(i , start , nums);
            }
        }
    }
    private static List<Integer> toList(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (Integer integer : nums) {
            res.add(integer);
        }
        return res;
    }
    private static void swap(int i , int j , int nums[]){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;   
    }
