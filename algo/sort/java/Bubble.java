import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = { 8, 5, 4, 2, 0, -2 };
        Bubble.bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubble(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            boolean hasSwap = false;
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    hasSwap = true;
                }
            }
            if (!hasSwap) {
                break;
            }
        }
    }
}
