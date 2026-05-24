class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int idx = n;
        int st = 0;
        int end = n-1;
        while(st <= end){
            int mid = st+(end-st)/2;

            if(nums[mid] >= target){
                idx = mid;
                end = mid-1;
            }else{
                st = mid+1;
            }
        }
        return idx;
    }
}