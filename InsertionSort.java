package sortingAlgorithms;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PJ
 */
public class InsertionSort {
    
    public void Sort(int [] arr)
    {
        int [] insertionArray = arr.clone();

        for (int i = 1; i < insertionArray.length; i++)
        {
            int key = insertionArray[i];
            int j = i - 1;

            while(j >= 0 && insertionArray[j] > key)
            {
                insertionArray[j+1] = insertionArray[j];
                j--;
            }
            insertionArray[j+1] = key;
        }
        
        for (int i = 0; i < insertionArray.length; i++)
        {
            System.out.print(insertionArray[i]+ " ");
        }
    }
    
}
