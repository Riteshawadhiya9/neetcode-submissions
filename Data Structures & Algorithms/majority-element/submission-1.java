class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int elem : nums){
            if(!mp.containsKey(elem)){
                mp.put(elem,1);
            }else{
                int currFreq = mp.get(elem);
                mp.put(elem, currFreq + 1);
            }
        }
        int ans = -9999;
        for(int cnt : nums){
            if(mp.get(cnt) > nums.length/2){
                ans = cnt;
                break;
            }
        }
        return ans;
    }
}