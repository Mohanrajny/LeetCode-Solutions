public int findMin(int[] nums) {
    if (nums == null || nums.length == 0)
        return -1;

    int l = 0, r = nums.length - 1;
    while (l < r) {
        int mid = (l + r) / 2;
        if (nums[mid] > nums[r])
            l = mid + 1;
        else
            r = mid;
    }
    return nums[l];
}
