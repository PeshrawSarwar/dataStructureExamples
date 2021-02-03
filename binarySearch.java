import java.util.Scanner;
import java.util.Arrays;
public class binarySearch{
	//finding number
	int binary_search(double [] nums , int left, int right , double x){
				//until the index is remain
				if(right >= left){
						int mid = left + (right - left) / 2;
						//if the number is in the middle index
						if(nums[mid] == x ){
								return mid;
							}
							//if the number is in the left  side
							if(nums[mid] > x){
									return binary_search(nums, left, mid - 1 , x);
								}
								//if the number is in the right side

								return binary_search(nums, mid + 1 , right, x);

					}
				return -1;
		}

	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		//size of the array
		System.out.println("Enter the length of numbers : ");
		int size = s.nextInt();
		double nums[] = new double[size];
		for(int i = 0 ; i<nums.length ; i++){
				System.out.println("Enter Number : "+(i+1));
				nums[i]=s.nextDouble();
			}
		Arrays.sort(nums);
		System.out.println("Sorted Nums : ");
		for(int i = 0 ; i < nums.length ; i++){
				System.out.println(nums[i]);
			}
		System.out.println("Enter the number you want to find");
		double key = s.nextDouble();
		binarySearch ob = new binarySearch();
		int result = ob.binary_search(nums, 0, nums.length - 1 , key);
		if(result == -1){
				System.out.println("This number is not available");
			}else{
					System.out.println("The number is in index : "+result);
				}
	}


}
