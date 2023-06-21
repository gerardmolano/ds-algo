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
    if (nums.length != 1) {
        let half = Math.trunc(nums.length / 2);
        let first = merge(nums.slice(0, half));
        let second = merge(nums.slice(half, nums.length));
        nums = join(first, second);
    }
    return nums;
}

// test here
let nums = [5, 4, 3, 2, 1, 6, 0];
nums = merge(nums);
console.log(nums);
