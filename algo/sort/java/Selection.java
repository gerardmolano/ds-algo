import java.util.Arrays;

public class Selection {
    public static void main(String[] args){
        int[] arr = { 8, 5, 4, 2, 0, -2, 4, 8, 0 };
        Selection.selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selection(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int select = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[select]) {
                    select = j;
                }
            }

            if (select != i) {
                int temp = nums[select];
                nums[select] = nums[i];
                nums[i] = temp;
            }
        }
    }
}
