package sortingAlgorithms;

public class Main
{
    static InsertionSort insertionSort = new InsertionSort();
    public static void main (String [] args)
    {
        System.out.println("Hello, this program sorts array with 4 algorithms: bubble, insertion, select and quicksort.");
        int[] arr = new int[]{12, 11, 5, 71, 21, 2, 7};
        
        System.out.println("Unsorted array:");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+ " ");
        }
        
        System.out.println("\nInsertion sorted array:");
        insertionSort.Sort(arr);
        
        
    }
}