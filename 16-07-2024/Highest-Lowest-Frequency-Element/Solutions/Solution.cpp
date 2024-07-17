int maxFrequency(vector<int>& nums, int k) {
    int l = 1, h = nums.size(), ans = 0;
    sort(nums.begin(), nums.end());

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

bool pos(vector<int>& nums, int mid, int k) {
    long long wsum = 0, tsum = 0;
    for (int i = 0; i < mid; ++i)
        wsum += nums[i];

    tsum = static_cast<long long>(nums[mid - 1]) * mid;

    if (tsum - wsum <= k)
        return true;

    int j = 0;
    for (int i = mid; i < nums.size(); ++i) {
        wsum -= nums[j];
        wsum += nums[i];
        tsum = static_cast<long long>(nums[i]) * mid;

        if (tsum - wsum <= k)
            return true;
        j++;
    }

    return false;
}