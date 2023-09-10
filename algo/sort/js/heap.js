const heapify = (nums, parent, len) => {
    const left = 2 * parent + 1;
    const right = 2 * parent + 2;

    let select = parent;

    if (left < len && nums[left] > nums[select]) {
        select = left;
    }

    if (right < len && nums[right] > nums[select]) {
        select = right;
    }

    if (select != parent) {
        [nums[select], nums[parent]] = [nums[parent], nums[select]];
        heapify(nums, select, len);
    }

}
const heap = nums => {
    const len = nums.length;

    for (let i = Math.trunc(len / 2 - 1); i >= 0; i--) {
        heapify(nums, i, len);
    }

    for (let i = 1; i < len; i++) {
        [nums[0], nums[len - i]] = [nums[len - i], nums[0]];
        heapify(nums, 0, len - i);
    }
}

const nums = [5, 4, 3, 2, 1, 6, 0];
heap(nums);
console.log(nums);
