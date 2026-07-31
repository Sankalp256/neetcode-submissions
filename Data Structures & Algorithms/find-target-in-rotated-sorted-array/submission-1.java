class Solution {
    public int search(int[] nums, int target) {

        int l = 0;
        int r = nums.length - 1;

        while(l<=r){
            int m = (l+r)/2;

            if(nums[m] == target){
                return m;
            }

            // left portion
            if(nums[m] >= nums[l]){

                if(target > nums[m] || target < nums[l])
                    l = m+1;
                else
                    r = m - 1;

            }

            //right portion
            else
            {
                if(target < nums[m]){
                    r = m - 1;
                }
                else if (target > nums[r]){
                    r = m -1;
                }
                else{
                    l = m +1;
                }
            }
        }

        /*
        if (nums[l] <= nums[mid]) {          // left sorted

    if (nums[l] <= target && target <= nums[mid]) {
        r = mid - 1;
    } else {
        l = mid + 1;
    }

} else {                             // right sorted

    if (nums[mid] <= target && target <= nums[r]) {
        l = mid + 1;
    } else {
        r = mid - 1;
    }

        */
        return -1;        
}
}
