import java.util.*;
import java.lang.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

class Main
{
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
	public static void main(String args[]) throws IOException{
FastReader scan=new FastReader();
Print pp=new Print();
		long nn =10000000;
		long m = 1000000007;
		long arr[] = new long[(int) nn+1];
		arr[0] = 1;
		arr[1] = 0;
		arr[2] = 1;
		for(long i=3;i<=nn;i++)
		{
			arr[(int) i] =( ((i-1)%m)*(((arr[(int) (i-1)])%m + (arr[(int) (i-2)])%m)%m))%m;
		}

		long t=scan.nextInt();
		while(t>0) {
			

			long num=scan.nextLong();
			pp.println(arr[(int) num]);
		t--;	
		}

	}
}
