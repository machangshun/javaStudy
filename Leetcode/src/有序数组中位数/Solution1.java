package 有序数组中位数;

public class Solution1 {
	public static double findMedianSortedArrays(int[] nums1,int[] nums2) {
		int i = 0,j = 0,temp = 0;
		int len = nums1.length + nums2.length;
		int[] nums = new int[len/2+2];
		while(i < nums1.length && j < nums2.length) {
			nums[temp++] = nums1[i] < nums2[j] ? nums1[i++] : nums2[j++];
			if(temp == len/2 +1) {
				if(len % 2 == 0) {
					return (nums[temp-1]+nums[temp-2])/2.0;
				}
				else {
					return nums[temp-1];
				}
			}	
		}
 		while(i < nums1.length) {
 			nums[temp++] = nums1[i++];
 			if(temp == len/2 +1) {
				if(len % 2 == 0) {
					return (nums[temp-1]+nums[temp-2])/2.0;
				}
				else {
					return nums[temp-1];
				}
			}	
 		}
 		while(j < nums2.length) {
 			nums[temp++] = nums2[j++];
 			if(temp == len/2 +1) {
				if(len % 2 == 0) {
					return (nums[temp-1]+nums[temp-2])/2.0;
				}
				else {
					return nums[temp-1];
				}
			}	
 		}
 		return 0.0;
	}
	public static void main(String[] args) {
		int[] nums1 = {1,2,5};
		int[] nums2 = {3,4};
		System.out.println(findMedianSortedArrays(nums1,nums2));
	}
}
