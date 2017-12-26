	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.io.OutputStreamWriter;

	import java.util.StringTokenizer;



	 class WEIGHT3 {

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

		static long ans1 = 0;
		static long ans2 = 0;
		public static void main(String[] args) throws IOException
		{
			FastReader scan=new FastReader();
		     Print p=new Print();
			int t = scan.nextInt();
			while(t>0)
			{
				int n = scan.nextInt();
				int nn = n;
				int w = scan.nextInt();
				int a[] = new int[n];
				
				int sum=0;
				for(int i=0;i<nn;i++){
					a[i]=scan.nextInt();
					sum+=a[i];
				}
				int extra=sum-w;
				boolean ma[][] = new boolean[extra+1][n+1];
				for(int i=0;i<=n;i++)
					ma[0][i]=true;
				for(int i=1;i<=extra;i++)
					ma[i][0]=false;
				for (int i = 1; i <= extra; i++)  
				{
					for (int j = 1; j <= n; j++)  
	       			{
	         			ma[i][j] = ma[i][j-1];
	         			if (i >= a[j-1])
	           				ma[i][j] = ma[i][j] || ma[i - a[j-1]][j-1];
	       			}        
	     		}
				int result=0;
				for(int i=extra;i>=0;i--)
				{
					if(ma[i][n])
					{
						result=i;
						break;
					}
				}		   
				p.println(sum-w-result);
				
			
			t--;}
		}
	}

