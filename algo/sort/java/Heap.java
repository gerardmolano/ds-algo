import java.util.Arrays;

public class Heap {
    public static void main(String[] args) {
        int[] arr = { 8, 5, 4, 2, 0, -2 };
        Heap.heap(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void heap(int[] nums) {
        int len = nums.length;

        for (int i = len / 2 - 1; i >= 0; i--) {
            heapify(nums, i, len);
        }

        for (int i = 1; i < len; i++) {
            int temp = nums[0];
            nums[0] = nums[len - i];
            nums[len - i] = temp;
            heapify(nums, 0, len - i);
        }
    }

    private static void heapify(int[] nums, int parent, int len) {
        final int left = 2 * parent + 1;
        final int right = 2 * parent + 2;
        int select = parent;

        if (left < len && nums[left] > nums[select]) {
            select = left;    
        }

        if (right < len && nums[right] > nums[select]) {
            select = right;
        }

        if (select != parent) {
            int temp = nums[select];
            nums[select] = nums[parent];
            nums[parent] = temp;

            heapify(nums, select, len);
        }
    }
}
