import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

   class PrimalFear {

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
int b= 1000000;
boolean arr[]=new boolean[b+1];
int s=2;
arr[0]=arr[1]=false;
for(int k=2; k<=b; k++)
{
	
	arr[s++]=true;
}
for(int i=2; i<=Math.sqrt(b); i++)
{
	if(arr[i])
	{
		for(int j=i*i; j<b; j=j+i)
		{
			arr[j]=false;
		}
	}
}
int count=0;
int[] cnt=new int[b+1];
cnt[0]=cnt[1]=0;
boolean flag=false;
for(int g=2; g<=b; g++)
{
          if(arr[g])
	        {
		       int ss=g;
		        String str=String.valueOf(ss);
		         if(str.contains("0")){
		        	cnt[g]= count;
		        	 continue;
		         }
			         
		
	                	int length=str.length();
	                     if(length==1){
	                      	count++;
		
	                           }
	                     int l=0;
	                     if(length>1){
	                    l =(int) Math.pow(10,length-1);}
	                     for(int i=1;i<length;i++){
	                    	int num=ss%l;
	                    
	                    	 if(arr[num]==true)
		                    	{
		                    		flag=true;
		                    	}else{
                                 flag=false;
			                		break;
                                 
			                	}
	                    	 ss=num;
	                    	 l=l/10;
	                    	 
	                     }
//	                   	for(int i=1;i<length;i++){
//		                    	String s2=str.substring(i);
//		                    	int num=Integer.parseInt(s2);
//		                    	
//	                   	}
	                 
	                   	if(flag){
	                   		count++;
	                   		flag=false;				
	                   	}
	        }
          cnt[g]=count;

	//g++;
}



		int t=scan.nextInt();
	while(t>0){
		int n=scan.nextInt();
		p.println(cnt[n]);
		t--;
	}
	p.close();

		
		
		
		
	}

}
