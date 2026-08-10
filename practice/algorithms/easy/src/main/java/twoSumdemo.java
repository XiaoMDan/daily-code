import java.util.HashMap;
import java.util.Map;

public class twoSumdemo {
    public static void main(String[] args) {

        int[] result = twoSum(new int[]{2,7,11,15},9);
        System.out.println(result[0] +"," + result[1]);
        int[] result2 = twoSum2(new int[]{2,7,11,15},9);
        System.out.println(result2[0] +"," + result2[1]);

    }
//    1.暴力遍历 时间复杂度 O(N*N)
    public static int[] twoSum(int[] nums,int target){
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <n ; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i,j};

                }

            }

        }
        return new int[0];
    }
//    哈希表 时间复杂度O（N）
    public static  int[] twoSum2(int [] nums,int target){
        Map<Integer,Integer> hashtable = new HashMap<Integer,Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (hashtable.containsKey(target - nums[i])){
                return new int[]{hashtable.get(target - nums[i]), i };
            }
            hashtable.put(nums[i],i );
        }
        return new int[0];
    }
}
