import java.util.Scanner;

public class sequentialSearch {
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		//size of the array
		System.out.print("Size of the array : ");
		int size = s.nextInt();
		double nums[] = new double[size];
		for (int x = 0; x < nums.length ; x++) {
			System.out.println("Insert Number : "+(x+1));
			nums[x] = s.nextDouble();
		}
		//number you want to search for
		System.out.println("Insert The Number You Want To Find : ");
		double key = s.nextDouble();
		int index  = 0;
		for(int x = 0; x < nums.length ; x++){
				if(nums[x] == key){
						index = x;
						//break if the number is available
						break;
					}else{
							index = -1;
						}

			}
		if(index >= 0 ){
				System.out.println("This Number is in Index : "+index);
			}else{
					System.out.println("This Number is not available");
				}
	}
}
