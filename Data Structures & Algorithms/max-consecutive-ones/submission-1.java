class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cnt = 0;
        int mxCnt = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 1){
                cnt++;
                mxCnt = Math.max(mxCnt,cnt);
            }else{
                cnt = 0;
            }
        }
        return mxCnt;
    }
}