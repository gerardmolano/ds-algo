const selection = (nums) => {
    for(let i = 0; i < nums.length; i++) {

        let select = i;
        for (let j = i + 1; j < nums.length; j++) {
            if (nums[j] < nums[select]) {
                select = j;
            }
        }

        if (select != i) {
            [ nums[select], nums[i] ] = [ nums[i], nums[select] ];
        }
    }
}

// test here
let nums = [5, 4, 3, 2, 1, 6, 0];
selection(nums);
console.log(nums);
