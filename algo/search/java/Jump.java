public class Jump {
    public static void main(String[] args) {
        int key = Integer.parseInt(args[0]);
        System.out.println(Binary.binary(new int []{ 1, 2, 3, 4, 6, 7 }, key));
    }

    public static int jump(int[] nums, int key) {
        final int LEN = nums.length;
        final int JUMP_VALUE = (int ) Math.sqrt(LEN);

        int i = 0;
        int step = JUMP_VALUE;

        while (nums[Math.min(step, LEN)] < key) {
            i = step;
            step += JUMP_VALUE;
            if (i >= LEN) {
                return -1;
            }
        }

        while (nums[i] < key) {
            i++;
            if (i == Math.min(step, LEN)) {
                return -1;
            }
        }
        
        if (nums[i] == key) {
            return i;
        }

        return -1;
    }
}