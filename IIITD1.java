import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

 class ThoseCollegeDays {


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
		FastReader scan=new FastReader();
	     Print p=new Print();
		//Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t>0)
		{
			String num = scan.nextLine();
			long len = num.length();
			long n = Long.parseLong(num);
			if(n==0)
				p.println("1");
			else if(n>0)
			{
				long ans = (long) Math.pow(10, len-1);
				p.println(ans);
			}
			else
			{
				long nn = -n*2;
				long ans = (long) Math.pow(10, len-2);
				long anss = ans+nn;
				p.println(anss);
			}
		t--;}
	}
 }