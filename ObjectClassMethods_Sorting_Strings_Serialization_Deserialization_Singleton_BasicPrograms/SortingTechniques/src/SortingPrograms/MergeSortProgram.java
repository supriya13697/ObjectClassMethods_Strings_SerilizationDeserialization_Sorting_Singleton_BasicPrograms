package SortingPrograms;


public class MergeSortProgram {

	static void merge(int arr[], int low, int mid, int high) 
    { 
        // Find sizes of two subarrays to be merged 
        int n1 = mid - low + 1; 
        int n2 = high - mid;    
  
        //Create temp arrays
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
  
        //Copy data to temp arrays
        for (int i=0; i<n1; ++i) 
            L[i] = arr[low + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = arr[mid + 1+ j]; 
  
        
        int i = 0, j = 0; 
        int k = low; 
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            { 
                arr[k] = L[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
  
        //Copy remaining elements of L[] if any
        while (i < n1) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        //Copy remaining elements of R[] if any 
        while (j < n2) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 
  
    static void MergeSort(int arr[], int low, int high) 
    { 
        if (low < high) 
        { 
       
            int mid = (low+high)/2; 
  
            // Sort first and second halves 
            MergeSort(arr, low, mid); 
            MergeSort(arr , mid+1, high); 
  
            // Merge the sorted halves 
            merge(arr, low, mid, high); 
        } 
    } 

    public static void main(String args[]) 
    { 
        int arr[] = {12, 11, 13, 5, 6, 7}; 
 
        MergeSort(arr, 0, arr.length-1); 
  
        for (int i=0; i<arr.length; ++i) 
            System.out.print(arr[i] + " ");
    } 
} 
