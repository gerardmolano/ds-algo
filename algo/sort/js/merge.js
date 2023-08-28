const join = (nums1, nums2) => {
    let i = 0; // nums1
    let j = 0; // nums2
    let nums = [];

    while (true) {
        if (i == nums1.length) {
            break;
        }

        if (j == nums2.length) {
            break;
        }

        if (nums1[i] < nums2[j]) {
            nums.push(nums1[i++]);
        } else {
            nums.push(nums2[j++]);
        }
    }

    while (i < nums1.length) {
        nums.push(nums1[i++]);
    }

    while (j < nums2.length) {
        nums.push(nums2[j++]);
    }

    return nums;
}

const merge = nums => {
    if (nums.length > 1) {
        const half = Math.trunc(nums.length / 2);
        let first = merge(nums.slice(0, half));
        let second = merge(nums.slice(half, nums.length));
        nums = join(first, second);
    }
    return nums;
}

const join2 = (nums, start, mid, end) => {
    // insertion sort
    for (let i = mid + 1; i <= end; i++) {
        const val = nums[i];
        let j = i - 1;
        
        while (j >= start && val < nums[j]) {
            nums[j + 1] = nums[j];
            j--;
        }
        nums[j + 1] = val;
    }
}

const merge2 = (nums, start = 0, end = nums.length - 1) => {
    if (start < end) {
        const mid = Math.trunc((start + end) / 2);
        merge2(nums, 0, mid);
        merge2(nums, mid + 1, end);
        join2(nums, start, mid, end);
    }
}

// test here
let nums = [5, 4, 3, 2, 1, 6, 0];
merge2(nums);
console.log(nums);
