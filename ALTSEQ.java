import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

//import turri.FinalBattle.FastReader;
//import turri.FinalBattle.Print;

 class AlternatingSequence {
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
		int n = scan.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i] = scan.nextInt();
		}
		int pre[] = new int[n];
		for(int i=0;i<n;i++)
		{
			pre[i]=1;
		}
		for(int j=1;j<n;j++)
		{
			for(int i=0; i<j; i++)
			{
				if( Math.abs(arr[j]) > Math.abs(arr[i]) && ((arr[i]>0 &&arr[j]<0 )||(arr[i]<0 && arr[j]>0)))
				{
					pre[j]=Math.max(pre[j], pre[i]+1);
				}
			}
		}
		int ans = 0;
		for(int i=0;i<n;i++)
		{
			if(ans<pre[i])
			{
				ans = pre[i];
			}
		}
		p.println(ans);
	}
}
