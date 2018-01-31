
public class sort {
	
	
	int[]BubbleSort(int array[])
	{

	boolean done=true;
	boolean donedone=true;
	int temp;
	do
	{
		for(int i=0;i<((array.length)-1);i++)
			{
			
			if(array[i]>array[i+1])
			
			{
				
			temp = array[i];
			array[i] = array[i+1];
			array[i+1]= temp;
			done=false;}
			
			}
		
		if(done==true){donedone=true;}else {donedone=false;}


	}while(donedone!=true);

	return array;

	}	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
