#include <iostream>

using namespace std;
int Fact(int n);
int main()
{
    int t,r,c,a,b,tt,ans;
    cin>>t;
    while(t>0)
    {
        cin>>r;
        cin>>c;
        a=Fact(r-1);
        b = Fact(c-1);
        tt =Fact(r-1 + c-1);
        ans = tt/(a*b);
        cout <<ans <<endl;
    t--;
    }
    //cout << "Hello world!" << endl;
    return 0;
}

int Fact(int n)
{
    if(n==0)
        return 1;
    else
        return n*Fact(n-1);
}
