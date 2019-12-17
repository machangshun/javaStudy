package 两数之和;

import java.util.ArrayList;

public class Solution {
	public int[] twoSum(int[] nums, int target) {
		int[] a = new int[2];
		for(int i = 0; i < nums.length-1; i++) {
			int n = target - nums[i];
			for(int j = i+1; j < nums.length; j++) {
				if(n == nums[j]) {
					a[0] = i;
					a[1] = j;
				}
			}
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,7,11,15};
		Solution s = new Solution();
		s.twoSum(nums,9);
	}

}
