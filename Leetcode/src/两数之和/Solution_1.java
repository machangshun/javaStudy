/*
 * 找到目标，就返回位置，没找到就将自己加入hashmap中
 * */
package 两数之和;

import java.util.HashMap;
import java.util.Map;


public class Solution_1 {
	public int[] twoSum(int[] nums, int target) {
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if(map.containsKey(complement)) {
				return new int[] {map.get(complement),i};
			}
			map.put(nums[i],i);
		}
		throw new IllegalArgumentException();
	}
}
