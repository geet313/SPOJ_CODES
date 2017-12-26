import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
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
			//bw.flush();
			}
			public void println(Object object) throws IOException{
				//this.bw=new BufferedWriter(new OutputStreamWriter(System.out));
			bw.write(String.valueOf(object)+"\n");
			bw.flush();
			}
			public void close() throws IOException{
				//bw.flush();
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
	Print p=new Print();
	
	int n=scan.nextInt();
	int q=scan.nextInt();
	long[] arr=new long[n+1];
	for(int i=1;i<=n;i++){
		arr[i]=scan.nextLong();
	}
	while(q>0){
		int  l=scan.nextInt();
		int r=scan.nextInt();
		if(l!=r)
			p.println(0);
		else{
			p.println(arr[l]);
		}
		q--;
	}
	
		}
    
}

