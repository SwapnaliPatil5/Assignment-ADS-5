
class InsertionSort
{
	
	public static void sort(int[] arr) 
	{
		for(int i=1;i<arr.length;i++)
		{
				int item=arr[i];
				int j=i-1; 
				
				while(j>=0 && arr[j] > item ) 
				{
					arr[j+1]=arr[j]; 
					j=j-1; 
				}
				
				arr[j+1]=item; 
				
				
				
		}
	}
	public static void display(int[] arr)
	{
		for(int i:arr)
			System.out.print(i+" ");
		System.out.println();
	}
	
	public static void main(String[] args)
	{
	    int[] arr={5,22,1,7,6,12};
		InsertionSort.display(arr);
		InsertionSort.sort(arr);
		InsertionSort.display(arr);
	}
}