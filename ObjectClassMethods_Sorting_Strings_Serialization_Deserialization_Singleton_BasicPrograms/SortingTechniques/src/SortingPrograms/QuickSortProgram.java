package SortingPrograms;


public class QuickSortProgram {

	static int partition(int arr[], int low, int high) 
    { 
        int pivot = arr[high];  
        int pIndex = low;
        for (int i=low; i<high; i++) 
        {  
            if (arr[i] <= pivot) 
            { 
                int temp = arr[i]; 
                arr[i] = arr[pIndex]; 
                arr[pIndex] = temp; 
                
                pIndex = pIndex + 1;
            } 
        }  
        int temp = arr[pIndex]; 
        arr[pIndex] = arr[high]; 
        arr[high] = temp; 
  
        return pIndex; 
    } 
  
 
    static void sort(int arr[], int low, int high) 
    { 
        if (low < high) 
        { 
         
            int pIndex = partition(arr, low, high); 
  
            sort(arr, low, pIndex-1); 
            sort(arr, pIndex+1, high); 
        } 
    } 
  
 
    public static void main(String args[]) 
    { 
        int arr[] = {10, 7, 8, 9, 1, 2, 5}; 
      
        sort(arr, 0, arr.length-1); 
  
        System.out.println("sorted array"); 
        for (int i=0; i<arr.length; ++i) 
            System.out.println(arr[i]);
    } 
    
}
