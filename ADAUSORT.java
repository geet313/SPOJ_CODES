import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;


 class ADAUSORT {
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
long arr[]=new long[(int) n];
HashMap<Long,ArrayList<Integer>> h=new HashMap<>();
for(int i=0;i<n;i++){
	arr[i]=scan.nextLong();
	if(h.containsKey(arr[i])){
		ArrayList<Integer> al=h.get(arr[i]);
		al.add(i);
		h.put(arr[i], al);
	}else{
		ArrayList<Integer> al=new ArrayList<>();
		al.add(i);
		h.put(arr[i], al);
	}
}
Arrays.sort(arr);
for(int i=0;i<n;){
long num=arr[i];
if(h.containsKey(num)){
	ArrayList<Integer> al=h.get(arr[i]);
	
	for(int j=al.size()-1;j>=0;j--){
		p.print(al.get(j)+1+" ");
	}
	i=i+al.size();
}
}
p.close();
	}
}
