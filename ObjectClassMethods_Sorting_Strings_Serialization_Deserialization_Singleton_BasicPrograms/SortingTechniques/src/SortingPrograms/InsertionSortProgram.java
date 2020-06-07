package SortingPrograms;

//Performance is better for small arrays 

public class InsertionSortProgram {

	static void InsertionSort(int array[]) {

		for(int i=1; i<array.length; i++) {
			
			int value = array[i];

			int hole=i;
			while((hole > 0) && array[hole-1] > value) {
				array[hole] = array[hole-1];
				hole = hole - 1;
			}
			array[hole] = value;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {10,20,5,60,32,2};

		InsertionSort(arr);

		for(int i = 0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
