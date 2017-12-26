#include<iostream>
using namespace std;
int main()
{
    int t,a,b,temp,j,k;
   
 cin>>t;
 while(t--)
    {
    cin>>a>>b;
    int g[a],m[b];

     for(j=0;j<a;j++)
 {
 cin>>g[j] ;
 }
 for( j=0;j<b;j++)
 {
 cin>>m[j];
  }
    for(j=0,k=j+1;j<a-1;j++,k++)
       {
       if (g[j]>g[k])
       {
   temp=g[k];
   g[k]=g[j];
   g[j]=temp;
   }
   }

      for(j=0,k=j+1;j<b-1;j++,k++ )
      {
 if(m[j]>m[k])
 {
   temp=m[k];
   m[k]=m[j] ;
   m[j] =temp;
   }
  }

  if(g[a-1]>=m[b-1])
  {
   cout<<"Godzilla"<<endl;
   }
  else
  {
   cout<<"MechaGodzilla"<<endl;
        }
        }
      return 0;
      }
