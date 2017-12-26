import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

//import turri.SumOf2And3.FastReader;
//import turri.SumOf2And3.Print;

 class FinalBattle {
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
			
			long n = scan.nextLong();
			long i = (long) Math.sqrt(n);
			long a1 = ((i)*2) - 1;
			long j = i+1;
			long b1 = ((j*j - ((i)*(i))) -1) / 2;
			if(n==((i)*(i)))
				p.println(a1);
			else if(n<((i)*(i)+b1+1))
				p.println(a1+1);
			else
				p.println(a1+2);
		t--;}
	}
}
