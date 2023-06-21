const insertion = nums => {
    for (let i = 1; i < nums.length; i++) {

        let j = i;
        while (j > 0 && nums[j] < nums[j - 1]) {
            [ nums[j], nums[j-1] ] = [ nums[j - 1], nums[j] ];
            j--;
        }
    }
}

// test here
let nums = [5, 4, 3, 2, 1, 6, 0];
insertion(nums);
console.log(nums);
