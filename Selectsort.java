public class Selectsort {
    
        public static void Sort(int [] arr){
        int [] insertionArray = arr.clone();
      
        System.out.print("\n\nSortowanie przez Wybor\n");
        
        for (int i = 0; i < insertionArray.length - 1; i++){  
            int index = i;  
            for (int j = i + 1; j < insertionArray.length; j++){  
                if (insertionArray[j] < insertionArray[index]){  
                    index = j;//searching for lowest index  
                }  
            }  
            int smallerNumber = insertionArray[index];   
            insertionArray[index] = insertionArray[i];  
            insertionArray[i] = smallerNumber;  
        }      
            System.out.println("\nWynik Sortowania przez wybór:");
        for (int i = 0; i < insertionArray.length; i++)
        {
            System.out.print(insertionArray[i]+ " ");
        }
    }   
}
