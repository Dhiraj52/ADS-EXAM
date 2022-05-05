class Sorting
{
	static void insertionSort(int num, int arr[])
	{
		for(int i=1;i<num;i++)
		{
			int key=arr[i];
			int j=i-1;
			
				while(j>=0 && arr[j] > key)
				{
					arr[j+1]=arr[j];
					j=j-1;
					
					printArray(arr);
				}
				
				arr[j+1]=key;
		}
	}
	
	static void printArray(int arr[])
	{
		int num=arr.length;
		
			for(int i=0;i<num;++i)
			System.out.print(arr[i]+" ");
			System.out.println();
	}
	
	public static void main(String args[])
	{
		int arr[]={1,2,4,5,3};
		
		insertionSort(5,arr);
		printArray(arr);
	}
}