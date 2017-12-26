import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;



 class CNTDO {

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
	int t=scan.nextInt();
	while(t>0){
		int n=scan.nextInt();
		int[] arr=new int[n];
		HashSet<Integer> h=new HashSet<>();
		for(int i=0;i<n;i++){
			arr[i]=scan.nextInt();
			h.add(arr[i]);
			arr[i]=2*arr[i];
		}
		long count=0;
		for(int i=0;i<n;i++){
		if(h.contains(arr[i])){
			count++;
		}
		}
		System.out.println(count);
	t--;	
	}
}
}
