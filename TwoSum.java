import java.util.ArrayList;
import java.util.Arrays;

class TwoSum {
    private static ArrayList<Integer> result = new ArrayList<Integer>();

    private static int[] findTwoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int sum = nums[i] + nums[j];
                if (target == sum) {
                    result.add(i);
                    result.add(j);
                }
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int[] nums = { 3, 2, 4 };
        int target = 6;
        System.out.println(Arrays.toString(findTwoSum(nums, target)));
    }
}