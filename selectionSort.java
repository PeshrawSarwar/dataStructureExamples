public class selectionSort{
	public static void main(String[]args){
		int nums[] = {11,23,67,2,100,101,3,5,99,1001,2,28,42};

		for(int i = 0 ; i < nums.length - 1; i++){
				int min_indx = i;
				for(int j = i+1 ; j < nums.length ; j++){
						if(nums[j] < nums[min_indx]){
								min_indx = j;
							}
						int temp = nums[min_indx];
						nums[min_indx] = nums[i];
						nums[i] = temp;
					}

			}
		System.out.println("Sorted Nums : ");
		for(int i = 0 ; i<nums.length ; i++){
				System.out.println(nums[i]+" ");
			}
	}
}