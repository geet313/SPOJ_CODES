import java.util.Scanner;

class MergeSort {
//	static long count=0;
	
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t>0)
		{
			System.out.println("");
		
		int n = scan.nextInt();
		int [] arr = new int[n];

		for(int i=0; i<n; i++)
		{
			arr[i]=scan.nextInt();	
		}
		System.out.println("");
		
		long ans = Divide(arr,0,n-1);
		
//		for(int i=0; i<n; i++)
//		{
//			System.out.println(arr[i]);
//		}
		
		System.out.println(ans);
	t--;}
	}

	static long Divide(int arr[],int low,int high)
	{
		long count=0;
		int mid=0 ;
		if(low<high)
		{
			mid = (high+low)/2;
		    count = Divide(arr,low,mid);
			count = count + Divide(arr,mid+1,high);
			count = count + Merge(arr,low,mid,high);
		}
		return count;
		
	}
	
	static long Merge(int arr[],int low,int mid,int high)
	{
		long count=0;
		int l=low;
		int r=high;
		int m=mid+1;
		int temp[] = new int[high-low+1];
		int k=0;
	       while(l <= mid && m <= r) {
	            if(arr[l] <= arr[m]) {
	            	
	                temp[k++] = arr[l++];
	            }
	            else {
	            	count = count + ((mid+1)-l);
	                temp[k++] = arr[m++];
	            }
	        }

	        while(l <= mid)
	        {
	        	
	            temp[k++] = arr[l++];
	        }

	        while(m <= r) {
	            temp[k++] = arr[m++];
	        }

		for(int s=0,i1=low; i1<=high; i1++)
		{
			arr[i1] = temp[s++];
		}
		return count;

	
	
	}
	
	
}
