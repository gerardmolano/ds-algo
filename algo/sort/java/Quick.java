import java.util.Arrays;

public class Quick {
    public static void main(String[] args) {
        int[] arr = { 8, 5, 4, 2, 0, -2, 4 };
        Quick.quick(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void quick(int[] nums) {
        Quick.quick(nums, 0, nums.length - 1);
    }

    private static void quick(int[] nums, int start, int end) {
        if (start < end) {
            final int idx = Quick.partition(nums, start, end);
            Quick.quick(nums, start, idx - 1);
            Quick.quick(nums, idx + 1, end);
        }
    }

    private static int partition(int[] nums, int start, int end) {
        final int pivotValue = nums[end];
        int pivotIdx = start;
        int i;

        for (i = start; i < end; i++) {
            if (nums[i] > pivotValue) {
                continue;
            }
            
            if (pivotIdx != i) {
                int temp = nums[pivotIdx];
                nums[pivotIdx] = nums[i];
                nums[i] = temp;
            }
            pivotIdx++;
        }

        if (pivotIdx != i) {
            int temp = nums[pivotIdx];
            nums[pivotIdx] = nums[i];
            nums[i] = temp;
        }

        return pivotIdx;
    }
}
