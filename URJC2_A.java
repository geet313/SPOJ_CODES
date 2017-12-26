import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.TreeSet;



 class URJC2_A {
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
		//	bw.flush();
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
static class time{
int st;
int end;
public time(int st,int end){
this.st=st;
this.end=end;
}
}
	public static void main(String args[]) throws IOException{
FastReader scan=new FastReader();
Print p=new Print();
int t=scan.nextInt();

while(t>0){
	int n=scan.nextInt();
	HashMap<Integer, String> map=new HashMap<>();
	TreeSet<Integer> set1=new TreeSet<>();
	//TreeSet<Integer> set2=new TreeSet<>();
	HashMap<Integer, String> map2=new HashMap<>();
	for(int i=0;i<n;i++){
		String t1=scan.next();
		String s11=t1.substring(0, 2);
		String s12=	t1.substring(3);
		int st=Integer.parseInt(t1.substring(0, 2))*60+Integer.parseInt(t1.substring(3));
		String t2=scan.next();
		int end=Integer.parseInt(t2.substring(0, 2))*60+Integer.parseInt(t2.substring(3));
		time tt=new time(st, end);
		String name=scan.next();
		map.put(st, name);
		map2.put(end, name);
		set1.add(st);
		//set2.add(end);
		
	}
	int q=scan.nextInt();
	while(q>0){
String ss=scan.next();
int tii=Integer.parseInt(ss.substring(0, 2))*60+Integer.parseInt(ss.substring(3));
Object c=set1.ceiling(tii);
if(c==null){
	p.println(map.get(0));
}else{
	if(Integer.parseInt(c.toString())==tii){
		Object c1=set1.ceiling(tii+1);
		if(c1==null){
			p.println(map.get(0));
		}else{
			p.println(map.get(c1));
		}
	}else{
	p.println(map.get(c));
	}
}
		
		q--;
	}
	t--;
}
	}
}

