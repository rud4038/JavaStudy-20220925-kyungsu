package j07_배열.foreach;

public class NumberForeach {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,7,8,9,10};
		int[] nums2 = new int[] {1,2,3,4,5,6,7,8,9,10};
		
		//System.out.println(new int[] {1,2,3,4,5,6,7,8,9,10});
		
		
		for(int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		System.out.println("-------------<< foreach >> -------------");
		
		for(int num : nums) {
			System.out.println(num);
		}

	}

}
