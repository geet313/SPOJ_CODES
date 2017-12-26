import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

 class AdaAndFriends {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int q = scan.nextInt();
		TreeMap<String,Long>hm = new TreeMap<>();
		int k = scan.nextInt();
		while(q>0)
		{
			String s = scan.next();
			long e = scan.nextLong();
			if(hm.containsKey(s))
			{
				long x = hm.get(s);
				long xx = x+e;
				hm.put(s, xx);
			}
			else
				hm.put(s, e);
		q--;}
		int size = hm.size();
		int i=0;
		long arr[]=new long[size];
		for(String key:hm.keySet())
		{
			arr[i++]=hm.get(key);
		}
		long ans=0;
		Arrays.sort(arr);
		while(k>0 && i-1>=0)
		{
			ans = ans + arr[--i];
			k--;
			
		}
		System.out.println(ans);
	}
}
