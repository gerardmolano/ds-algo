const jump = (nums, key) => {
    const len = nums.length;
    const JUMP_VALUE = Math.trunc(Math.sqrt(len));
    
    let i = 0;
    let j = JUMP_VALUE;

    while (true) {
        if (j > nums.length) {
            j = nums.length;
            break;
        }

        if (key < nums[j]) {
            break;
        }

        i = JUMP_VALUE;
        j += JUMP_VALUE;
    }

    while (i < j) {
        if (nums[i] == key) {
            return i;
        }
        i++;
    }

    return -1;
}

const jump2 = (nums, key) => {
    const len = nums.length;
    const JUMP_VALUE = Math.trunc(Math.sqrt(len));

    let i = 0;
    let step = JUMP_VALUE;

    while (nums[Math.min(step, len) - 1] < key) {
        i = step;
        step += JUMP_VALUE;
        if (i >= len) {
            return -1;
        }
    }

    while (nums[i] < key) {
        i++;
        if (i == Math.min(step, len)) {
            return -1;
        }
    }

    if (nums[i] == key) {
        return i;
    }

    return -1;
}
