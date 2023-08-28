const bubble = nums => {
    for (let i = 0; i < nums.length - 1; i++) {
        let hasSwap = false;
        for (let j = 0; j < nums.length - i - 1; j++) {
            if (nums[j] > nums[j + 1]) {
                [nums[j], nums[j + 1]] = [nums[j + 1], nums[j]];
                hasSwap = true;
            }
        }
        if (!hasSwap) {
            break;
        }
    }
}

// test here
let nums = [5, 4, 3, 2, 1, 6, 0];
bubble(nums);
console.log(nums);
