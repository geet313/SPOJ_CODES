import java.util.Scanner;

class ToAndFro {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		while(n!=0)
		{
			//char[] tem = new char[n];
			String s = scan.next();
			char[] arr = s.toCharArray();
			int len = s.length();
			for(int i=n;i<len;i=i+(2*n))
			{
				swap(arr,i,i+n-1);
			}
			for(int i=0;i<len;i++)
			{
				for(int j=i;j<len;j=j+n)
				{
					if(arr[j]!='0')
					{
					System.out.print(arr[j]);
					arr[j]='0';
					}
				}
				
			}
			n = scan.nextInt();
			System.out.println();
			
	}
}

	private static void swap(char[] arr, int i, int j) {
		
		while(i<j)
		{
			char temp = arr[j];
			arr[j] = arr[i];
			arr[i] = temp;
			i++;
			j--;
		}
	}
}
