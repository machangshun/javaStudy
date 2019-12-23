package 有序数组中位数;

import java.util.ArrayList;

public class Solution {
	public static double findMedianSortedArrays(int[] nums1,int[] nums2) {
		double res = 0;
		int i = 0,j = 0;
		ArrayList<Integer> nums = new ArrayList<Integer>();
 		while(i < nums1.length && j < nums2.length) {
			nums.add(nums1[i] < nums2[j] ? nums1[i++] : nums2[j++]);
		}
 		while(i < nums1.length) {
 			nums.add(nums1[i++]);
 		}
 		while(j < nums2.length) {
 			nums.add(nums2[j++]);
 		}
 		if(nums.size() % 2 == 0) {
 			res = (nums.get(nums.size()/2-1)+nums.get(nums.size()/2))/2.0;
 		}
 		else {
 			res = nums.get(nums.size()/2)/1.0;
 		}
		return res;
	}
	public static void main(String[] args) {
		int[] nums1 = {1,2,5};
		int[] nums2 = {3,4};
		System.out.println(findMedianSortedArrays(nums1,nums2));
	}
}
