public class recursion{
	public static void main(String[]args){
		int nums[] = {13,27,12,1,2,4,25};
		System.out.println("Numbers : ");
		for(int r : nums){
				System.out.println(r);
			}
		System.out.println("\n\n");
		for(int d = 0 ; d < nums.length ; d++){
				int result = factorial(nums[d]);

				System.out.println("Factorial : "+nums[d]+" = "+result);
			}



		System.out.println("\n\n\n");


		int result2 = linearSum(nums, nums.length);
		System.out.println("Sum of the nums : "+result2);

		System.out.println("\n\n\n");

		int result3[] = riverseArray(nums, 0, nums.length-1);
		System.out.println("Riversed nums : ");
		for(int s : result3){
							System.out.println(s);
				}
	}

	static int factorial(int n){
			if(n == 0 ){
					return 1;
				}
			else{
					return n * factorial(n-1);
				}
		}

	static int linearSum(int nums[], int n){
			if(n == 1){
					return nums[0];
				}
			else{
					return nums[n-1] + linearSum(nums, n-1);
				}
		}
	static int[] riverseArray(int numbers[], int i, int j){
			if(i < j){
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
					riverseArray(numbers, i+1, j-1);
				}
			return numbers;
		}
}