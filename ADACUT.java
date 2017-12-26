import java.util.*;
import java.lang.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main
{
	
	static class FastReader
	{
	  BufferedReader br;
	  StringTokenizer st; 

	  public FastReader()
	  {
	      br = new BufferedReader(new
	               InputStreamReader(System.in));
	  }

	  String next()
	  {
	      while (st == null || !st.hasMoreElements())
	      {
	          try
	          {
	              st = new StringTokenizer(br.readLine());
	          }
	          catch (IOException  e)
	          {
	              e.printStackTrace();
	          }
	      }
	      return st.nextToken();
	  }

	  int nextInt()
	  {
	      return Integer.parseInt(next());
	  }

	  long nextLong()
	  {
	      return Long.parseLong(next());
	  }
	  String nextLine()
	  {
	      String str = "";
	      try
	      {
	          str = br.readLine();
	      }
	      catch (IOException e)
	      {
	          e.printStackTrace();
	      }
	      return str;
	  }
	}
	    
		public static void main(String[] args) throws IOException {
	        FastReader scan = new FastReader();
		
		
	long n = scan.nextInt();
			
			long arr[] = new long[(int) n];
			for(long i=0; i<n; i++)
			{
				arr[(int) i] = scan.nextLong();
			}
			if(n==1){
				System.out.println(0);
			}else{
			long pre[] = new long[(int) n];
			long summ[] = new long[(int) n];
			summ[(int) (n-1)]=0;
			Arrays.sort(arr);
			pre[0]=arr[0];
			for(int i=1;i<n;i++){
				pre[i]=pre[i-1]+arr[i];
			}
			long diff[] = new long[(int) (n-1)];
			long ds[] = new long[(int) (n-1)];
			for(long i=0;i<n-1;i++){
				diff[(int) i]=arr[(int) (i+1)]-arr[(int) i];
			}
			ds[0]=diff[0];
			for(long i=1;i<n-1;i++){
				ds[(int) i]=ds[(int) (i-1)]+diff[(int) i];
			}
	long sum=0;		
for(int i=0;i<n-1;i++){
	sum=ds[i]+sum;
}
summ[0]=sum;
for(long i=1;i<n-1;i++){
	summ[(int) i]=sum-((((n)-i))*diff[(int) (i-1)]);
	sum=summ[(int) i];
}
long ans=summ[0];
for(int i=1;i<n;i++){
	long an=summ[i]+pre[i-1];
	if(an<ans)
		ans=an;
}
System.out.println(ans);
			}
			}
		
	
}
