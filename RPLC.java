import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

 class Coke_Madness {

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
		//Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		int tt=1;
		while(tt<=t)
		{
			long min=999999999;
			int ind =0;
			int n = scan.nextInt();
			long sum=0;
			int arr[] = new int[n];
			for(int i=0; i<n; i++)
			{
				arr[i] = scan.nextInt();
				sum = sum + arr[i];
				min = Min(min,sum);
			}
			if(min>0)
				p.println("Scenario #"+tt+": "+"1");
			else
			{
				long a = -min +1;
				p.println("Scenario #"+tt+": "+a);
			}
		tt++;}
	}

	private static long Min(long min, long sum) 
	{
		if(min>sum)
			return sum;
		else
			return min;
	}
}
