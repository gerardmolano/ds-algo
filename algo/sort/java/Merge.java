import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        int[] arr = { 8, 5, 4, 2, 0, -2 };
        Merge.merge2(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] merge(int[] nums) {
        if (nums.length > 1) {
            int half = nums.length / 2;
            return Merge.join(
                Merge.merge(Arrays.copyOfRange(nums, 0, half)),
                Merge.merge(Arrays.copyOfRange(nums, half, nums.length))
            );
        }

        return nums;
    }

    private static int[] join(int[] nums1, int[] nums2) {
        final int len1 = nums1.length;
        final int len2 = nums2.length;
        final int[] merged = new int[len1 + len2];
        int ctr1 = 0;
        int ctr2 = 0;

        while (true) {
            if (ctr1 == len1) {
                break;
            }

            if (ctr2 == len2) {
                break;
            }

            int val;
            if (nums1[ctr1] < nums2[ctr2]) {
                val = nums1[ctr1++];
            } else {
                val = nums2[ctr2++];
            }

            merged[ctr1 + ctr2 - 1] = val;
        }

        while (ctr1 < len1) {
            merged[ctr1 + ctr2] = nums1[ctr1];
            ctr1++;
        }

        while (ctr2 < len2) {
            merged[ctr1 + ctr2] = nums2[ctr2];
            ctr2++;
        }

        return merged;  
    }

    public static void merge2(int[] nums) {
        Merge.merge2(nums, 0, nums.length - 1);
    }

    private static void merge2(int[] nums, int start, int end) {
        if (start < end) {
            final int mid = (start + end) / 2;
            Merge.merge2(nums, 0, mid);
            Merge.merge2(nums, mid + 1, end);
            Merge.join2(nums, start, mid, end);
        }
    }

    private static void join2(int[] nums, int start, int mid, int end) {
        // insertion sort
        for (int i = mid + 1; i <= end; i++) {
            final int val = nums[i];
            int j = i - 1;
            while (j >= start && val < nums[j]) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = val;
        }
    }
}
