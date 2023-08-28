import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int[] arr = { 8, 5, 4, 2, 0, -2 };
        Insertion.insertion(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void insertion(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            final int val = nums[i];
            int j = i - 1;
            while (j >= 0 && val < nums[j]) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = val;
        }
    }
}
