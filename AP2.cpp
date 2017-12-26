#include <iostream>
using namespace std;

int main() {
	
	// your code here
	int t;
    long long int x,y,z,n,d,a,i,ans;
	cin>>t;
	while(t>0)
	  {
		   cin>>x>>y>>z;
		   n = (2*z)/(x+y);
		   d = (y-x)/(n-5); 
	       a = x-(2*d);
	      cout<<n<<endl;
	//      System.out.println(d);
	//      System.out.println(a);
	      for( i=1; i<=n; i++)
	      {
	      	ans =a+(i-1)*d;
	    	 cout<<ans<<" ";
	      }
	      
	  t--;}

	return 0;
}