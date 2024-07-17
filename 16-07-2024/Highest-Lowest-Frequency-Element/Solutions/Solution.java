class Solution {
    public int maxFrequency(int[] nums, int k) {
        int l = 1, h = nums.length, ans = 0;
        Arrays.sort(nums);

        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (pos(nums, mid, k)) {
                ans = mid;
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }

        return ans;
    }
    public  boolean pos(int[] nums,int mid,int k) {
      long wsum = 0, tsum = 0;
      for (int i = 0; i < mid; ++i)
          wsum += nums[i];

      tsum =1L* nums[mid - 1] * mid;

      if (tsum - wsum <= k)
          return true;

      int j = 0;
      for (int i = mid; i < nums.length; ++i) {
          wsum -= nums[j];
          wsum += nums[i];
          tsum = 1L* nums[i] * mid;

          if (tsum - wsum <= k)
              return true;
          j++;
      }

      return false;
    }
}