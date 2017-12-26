import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

//import turri.FinalBattle.FastReader;
//import turri.FinalBattle.Print;

 class Gcd3 {
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
		 long n  = scan.nextLong();
		 long a  = scan.nextLong();
		 long b  = scan.nextLong();
		 long ans = GCD(a,b);
		 while(ans>0)
		 {
			 p.print(n);
		 ans--;}
		 p.println("");
		 t--;}
	 }

	private static long GCD(long a1, long b1) 
	{
		if(b1==0)
			return a1;
		return GCD(b1,a1%b1);
		
	}
}
