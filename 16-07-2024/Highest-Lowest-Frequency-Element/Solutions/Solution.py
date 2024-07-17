def maxFrequency(self, nums, k):
    l, h, ans = 1, len(nums), 0
    nums.sort()

    while l <= h:
        mid = l + (h - l) // 2
        if self.pos(nums, mid, k):
            ans = mid
            l = mid + 1
        else:
            h = mid - 1

    return ans

def pos(self, nums, mid, k):
    wsum = 0
    for i in range(mid):
        wsum += nums[i]

    tsum = nums[mid - 1] * mid

    if tsum - wsum <= k:
        return True

    j = 0
    for i in range(mid, len(nums)):
        wsum -= nums[j]
        wsum += nums[i]
        tsum = nums[i] * mid

        if tsum - wsum <= k:
            return True
        j += 1

    return False