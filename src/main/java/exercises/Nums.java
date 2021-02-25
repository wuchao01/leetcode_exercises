package exercises;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class Nums {
//    给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 的那 两个 整数，并返回它们的数组下标。
//
//    你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
//
//    你可以按任意顺序返回答案。
//
//    来源：力扣（LeetCode）
//    链接：https://leetcode-cn.com/problems/two-sum
//    著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
        public int[] twoSum(int[] nums, int target) {
            int[] index;
            for (int i = 0; i < nums.length; i++) {
                for(int j = i+1;j<nums.length;j++){
                    if(nums[i]+nums[j]==target){
                        System.out.println("num[i]:" + nums[i]+" num[j]:"+nums[j] + " 相等");
                        index = new int[]{i, j};
                        return index;
                    }
                }
            }
            return nums;
        }

    public int[] twoSumHash(int[] nums, int target) {
        Map<Integer,Integer> hashMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(target-nums[i])){
                return new int[]{hashMap.get(target-nums[i]),i};
            }
            hashMap.put(nums[i],i);
        }
        return nums;
    }

        @Test
        public void test(){
            int[] n = {2,7,11,15};
            int[] num = twoSum(n,9);
            int[] m = twoSumHash(n,9);
            for (int i = 0;i < m.length;i++){
                System.out.println("n:" + i);
            }
        }
}
