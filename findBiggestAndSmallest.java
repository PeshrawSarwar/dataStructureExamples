import java.util.Scanner;
public class findBiggestAndSmallest{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of numbers");
		int size = s.nextInt();
		//setting the size by user input
		int nums[] = new int[size];
		//inserting nums
		for(int i = 0 ; i < nums.length ; i++){
				System.out.println("Insert Number : "+(i+1));
				nums[i]=s.nextInt();
		}
		//declaring smallest and biggest var
		int smallest = nums[0];
		int biggest = nums[0];
		for(int i = 0 ; i < nums.length ; i++){
				//if the number is smaller than the value in the variable then the variable value will be the number
				if(nums[i] < smallest){
						smallest = nums[i];
					}
				//if the number is bigger than the value in the variable then the variable value will be then number
				if(nums[i] > biggest){
						biggest = nums[i];
					}
			}
		System.out.println("Smallest Number is : "+smallest);
		System.out.println("Biggest Number is : "+biggest);


	}
}