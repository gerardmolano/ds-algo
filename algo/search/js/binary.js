const binary = (nums, key) => {
    let l = 0;
    let r = nums.length - 1;

    while (l <= r) {
        let mid = Math.trunc((l + r) / 2);

        if (key == nums[mid]) {
            return mid;
        } else if (key < nums[mid]) {
            r = mid - 1;
        } else {
            l = mid + 1;
        }
    }

    return -1;
}
