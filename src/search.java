    public int searchInsert(int[] nums, int target) {
        int pointer = 0;
        while(pointer<nums.length){
            if(nums[pointer]>target){
                return pointer;
            }
            if(nums[pointer]==target){
                return pointer;
            }
            pointer++;
        }
        return pointer;
        
    }
