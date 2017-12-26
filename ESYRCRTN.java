import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

//import turri.FinalBattle.FastReader;
//import turri.FinalBattle.Print;
 class WhyRecursion {

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
			int ans = (int) (n%6);
			if(ans==0)
				p.println("0");
			else if(ans==1)
				p.println("1");
			else if(ans==2)
				p.println("4");
			else if(ans==3)
				p.println("6");
			else if(ans==4)
				p.println("5");
			else if(ans==5)
				p.println("2");
		t--;}
	}
}
