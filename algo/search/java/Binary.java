public class Binary {
    public static void main(String[] args) {
        int key = Integer.parseInt(args[0]);
        System.out.println(Binary.binary(new int []{ 1, 2, 3, 4, 6, 7 }, key));
    }

    public static int binary(int[] nums, int key) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (key == nums[mid]) {
                return mid;
            } else if (key < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }
}
