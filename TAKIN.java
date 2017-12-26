import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

 class SubsetApplw {

	static class Print{
		  BufferedWriter bw;
		public Print(){
			this.bw=new BufferedWriter(new OutputStreamWriter(System.out));
		}
		public void print(Object object) throws IOException{
			//this.bw=new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(String.valueOf(object));
		bw.flush();
		}
		public void println(Object object) throws IOException{
			//this.bw=new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(String.valueOf(object)+"\n");
		bw.flush();
		}
		public void close() throws IOException{
			bw.close();
		}
	}
	
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
	public static void main(String[] args) throws IOException
	{
		//Scanner scan = new Scanner(System.in);
		FastReader scan=new FastReader();
	     Print p=new Print();
		int t = scan.nextInt();
		while(t>0)
		{
			long n = scan.nextLong();
			long m = scan.nextLong();
			long ans=0,temp;
			long arr[] = new long[(int) n];
			for(int i=0;i<n;i++)
			{
				arr[i] = scan.nextLong();
			}
			for(int i=0; i<(1<<n); i++)
			{
				temp=0;
				for(int j=0;j<n;j++)
				{
					if((i &(1<<j))>0)
					{
						 temp = temp+arr[j];
					}
					if(temp>ans && temp<=m)
						ans=temp;
				}
			}
			p.println(ans);
		t--;}
		
	}
}
