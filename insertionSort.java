public class insertionSort{
		public static void main(String[]args){
			int arr[] = { 12, 11, 13, 5, 6, 22, 46, 1 };

			insertionSort ob = new insertionSort();
        	ob.sort(arr);

        	System.out.println("Sorted array : ");
        	for(int i : arr){
					System.out.println(i);
			}

			}
		    void sort(int arr[])
		    {
		        int n = arr.length;
		        for (int i = 1; i < n; ++i) {
					//key = number in index 1 .... +1
		            int key = arr[i];

		            //j = one index less than i
		            int j = i - 1;

		            /* Move elements of arr[0..i-1], that are
		               greater than key, to one position ahead
		               of their current position */
		            while (j >= 0 && arr[j] > key) {
						//number in one index more than j (arr[j] is the greater one) is <-- number in index j
		                arr[j + 1] = arr[j];
		                j = j - 1;
		            }
		            //if the condition in the while isn't true then :

		            arr[j + 1] = key;
		        }
    }


	}