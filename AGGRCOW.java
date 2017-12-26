import java.util.*;
import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
Scanner scan = new Scanner(System.in);
	long t=scan.nextInt();
	while(t>0){
		int n=scan.nextInt();
	int c=scan.nextInt();
	long[] ar=new long[(int)n];
	for(int i=0;i<n;i++){
		ar[i]=scan.nextLong();
	}
	Arrays.sort(ar);
	long low=0;
	long high=(int) (ar[n-1]-ar[0]);
	long ans=search(ar,low,high, c);
	System.out.println(ans);
	t--;	
	}
	}

	private static long search(long[] ar, long low, long high,int c) {
		// TODO Auto-generated method stub
while(high-low>1){
		long mid=low+(high-low)/2;

boolean s=check(ar,mid,c);
		if(s==true){
			low=mid;
		}else
			high=mid;
}
		return low;
	}

	private static boolean check(long[] ar, long mid,int c) {
		// TODO Auto-generated method stub
	boolean exists=false;
	boolean na=false;
	long ini=ar[0];
	long nex=ini+mid;	
	long num=0;
	for(int i=1;i<ar.length;i++){
		if(exists!=true&&na!=true){
			if(ar[i]>=nex){
			if(ar[i]==nex)
			exists=true;
			else
			na=true;
			nex=ar[i]+mid;
			num++;
			
		}}else{
			if(ar[i]>=nex){
				nex=ar[i]+mid;
				num++;
			}
		}
	}
	if(num>=(c-1)){
	
		return true;
	}
	else
		return false;
	}
}
