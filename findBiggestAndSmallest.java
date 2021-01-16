import java.util.Scanner;
public class findBiggestAndSmallest{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of numbers");
		int size = s.nextInt();
		int nums[] = new int[size];
		for(int i = 0 ; i < nums.length ; i++){
				System.out.println("Insert Number : "+(i+1));
				nums[i]=s.nextInt();
		}
		int smallest = nums[0];
		int biggest = nums[0];
		for(int i = 0 ; i < nums.length ; i++){
				if(nums[i] < smallest){
						smallest = nums[i];
					}
				if(nums[i] > biggest){
						biggest = nums[i];
					}
			}
		System.out.println("Smallest Number is : "+smallest);
		System.out.println("Biggest Number is : "+biggest);


	}
}