
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;



 class ADASEQEN {

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
			//bw.flush();
			}
			public void close() throws IOException{
				bw.flush();
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
	
	long n=scan.nextLong();
	long m=scan.nextLong();
	int[]arr=new int[26];
	for(int i=0;i<26;i++){
		arr[i]=scan.nextInt();
	}
	String s1=scan.next();
	String s2=scan.next();
	long[][] mat=new long[s1.length()+1][s2.length()];
	for(int i=0;i<s2.length();i++)
		mat[0][i]=0;
	
	//calculation
	char c1[]=s1.toCharArray();
	char c2[]=s2.toCharArray();
	int n1=s1.length()+1;
	int n2=s2.length();
	for(int i=1;i<n1;i++){
		for(int j=0;j<n2;j++){
			if(c1[i-1]==c2[j]){
				if(j>0 ){
					mat[i][j]=arr[c2[j]-'a']+mat[i-1][j-1];
				}
				else
					mat[i][j]=arr[c2[j]-'a'];
			}else{
				if(j>0){
				mat[i][j]=Math.max(mat[i-1][j], mat[i][j-1]);	
				}else
				{
					mat[i][j]=mat[i-1][j];
				}
			}
		}
	}
	p.println(mat[n1-1][n2-1]);
	p.close();
		}
}
