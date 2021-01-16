import java.util.Scanner;
public class findEvenAndOdd{
	public static void main(String[]args){
			Scanner s = new Scanner(System.in);
			System.out.println("enter size of numbers");
			int x = s.nextInt();
			int oddSize = 0;
			int evenSize = 0;
			//Size of an array by input user
			int size[] = new int[x];
			//inserting numbers
			for(int i = 0 ; i<size.length ; i++){
					System.out.println("Insert Number "+(i+1));
					size[i]=s.nextInt();
					if(size[i] % 2 == 0){
							evenSize++;
						}else{
								oddSize++;
							}
				}
			int even[] = new int[evenSize];
			int odd[] = new int[oddSize];

			int j = 0, k = 0;
			for(int i = 0 ; i < size.length ; i++){
					if(size[i] % 2 == 0 ){
							even[j++] = size[i];
						}else{
								odd[k++] = size[i];
							}
				}
			// print array method
			        System.out.println("Even Nums : ");
			    	for(int i = 0 ; i < even.length ; i++){
							System.out.println(even[i]);
						}
					System.out.println("Odd Nums : ");
					for(int i = 0 ; i < odd.length ; i++){
							System.out.println(odd[i]);
						}


		}
}