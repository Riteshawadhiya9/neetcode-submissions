class Solution {
    public int mySqrt(int x) {
          if (x == 0 || x == 1)
            return x;
        int ans = -1;
        int st = 0, end = x;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            long val = (long) mid * mid;
            if (val == x) {
                return mid;
            } else if (val > x) {
                end = mid - 1;
            } else {
                st = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }
}