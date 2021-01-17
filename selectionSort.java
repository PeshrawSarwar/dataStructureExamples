public class selectionSort{
	public static void main(String[]args){
		int nums[] = {11,23,67,2,100,101,3,5,99,1001,2,28,42};

		for(int i = 0 ; i < nums.length - 1; i++){
			//minimum index = 0
				int min_indx = i;
				for(int j = i+1 ; j < nums.length ; j++){
					//if number in one index after i is less than the minimum index then :
						if(nums[j] < nums[min_indx]){
							//minimum index is equal to the index of minimum number
								min_indx = j;
							}
						//inserting the minimum one to temp variable
						int temp = nums[min_indx];
						//inserting the other number to the min_index variable
						nums[min_indx] = nums[i];
						//inserting the temp variable which is the minimum value to minimum index
						nums[i] = temp;
					}

			}
		System.out.println("Sorted Nums : ");
		for(int i = 0 ; i<nums.length ; i++){
				System.out.println(nums[i]+" ");
			}
	}
}