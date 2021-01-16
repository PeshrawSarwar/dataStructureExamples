import java.util.Scanner;
public class findAverage{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		//Insert the size of the numbers
		System.out.println("Select the size of the numbers");
		int size = s.nextInt();

		int nums[] = new int[size];
		double total = 0 ;
		double average = 0 ;
		for(int i = 0 ; i< nums.length ; i++){
				System.out.println("Insert Number "+(i+1));
				nums[i]=s.nextInt();

				//finding the average
				//each number will be added to totals variable
				 total += nums[i];
				//total variable is now equal to sum of all numbers and then will be divided to length of numbers
				 average = (total / nums.length);

			}
		System.out.println("The average is : "+average);


	}
}