const quick = (nums, start = 0, end = nums.length - 1) => {
    if (start < end) {
        const pivotIdx = pivot(nums, start, end);
        quick(nums, start, pivotIdx - 1);
        quick(nums, pivotIdx + 1, end);
    }
}
const pivot = (nums, start, end) => {
    const pivotValue = nums[end];
    let pivotIdx = start;

    for (var i = start; i < end; i++) {
        if (nums[i] < pivotValue) {
            if (i != pivotIdx) {
                [nums[i], nums[pivotIdx]] = [nums[pivotIdx], nums[i]]
            }
            pivotIdx++;
        }
    }

    if (i != pivotIdx) {
        [nums[i], nums[pivotIdx]] = [nums[pivotIdx], nums[i]]
    }

    return pivotIdx;
}

// test here
let nums = [5, 4, 3, 2, 1, 6, 0];
quick(nums);
console.log(nums);
