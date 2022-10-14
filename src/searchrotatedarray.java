    public int search(int[] nums, int target) {
        // check if first item is greater than the target
        // if it is greater than it will be on the second half of the array
        // else it will be on the first half of the array
        
        return binarySearch(nums, target, 0, nums.length-1);
    }
    
    static int binarySearch(int[] nums, int target, int lower, int upper){
        
        if(lower > upper) return -1;
        
        int mid = (lower+upper) / 2;
        
        if(nums[mid] == target) return mid;
                
        if(nums[mid] >= nums[lower]){
            if(target >= nums[lower] && target <= nums[mid]){
                return binarySearch(nums, target, lower, mid-1);
            }
            return binarySearch(nums, target, mid+1, upper);
            // check in the second half
        }else{
            if(target <= nums[upper] && target >= nums[mid]){
                return binarySearch(nums, target, mid+1, upper);
            }
            // check in the first half
            return binarySearch(nums, target, lower, mid-1);
        }
    }
