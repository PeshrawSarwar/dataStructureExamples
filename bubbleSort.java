public class bubbleSort{
	public static void main(String[]args){
		int nums[] = {3,5,12,1,45,3,100,22,8,6,105,32};
		int temp = 0;
		int n = nums.length;
		for(int i = 0 ; i < n - 1; i++){
				for(int j = 0 ; j < n-i-1 ; j++){
						//if the index before the other index is greater then :
						if(nums[j] > nums[j+1]){
							//insert the greater index to temp veriable
								temp = nums[j];
							//insert the smaller one to the index of the greater one
								nums[j] = nums[j+1];
							//insert the greater one to the index of the smaller one
								nums[j+1] = temp;
							}
					}
			}
		System.out.println("Sorted Numbers : ");
		for(int i = 0 ; i < nums.length ; i++){

				System.out.print(nums[i] + " ");
			}
	}
}