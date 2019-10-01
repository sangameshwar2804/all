package javaprep1;

public class CountLength {
	 public static int removeDuplicates(int[] nums) {
	        if(nums == null || nums.length == 0) return 0;
	        if(nums.length == 1) return 1;
	        int num = nums[0], cnt = 0, len = nums.length;
	        for(int i = 1; i < len; i++) {
	            if(nums[i] == num) {
	                // duplicates count
	                cnt++;
	            } else {
	                // update the array
	                num = nums[i];
	                nums[i - cnt] = nums[i];
	            }
	        }
	        int len1=len-cnt;
	        System.out.println(len1);
	        return len1;
	    }
	 public static void main(String[] args) {
		 int[] ar= {1,1,2};
		removeDuplicates(ar);
	}
}
