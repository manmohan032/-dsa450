#include<iostream>
using namespace std;

int main()
{
    int i,n;
    cin>>n;
    int a[n];
    for(i=0;i<n;i++)
    {
        cin>>a[i];
    }
    int ans=2;
    int cur=2;
    int pd=a[1]-a[0];
    int j=2;
    while (j<n)
    {
        if(a[j]-a[j-1]==pd)
        {

            cur++;
        }
        else
        {
            pd=a[j]-a[j-1];            
            cur=2;
        }
        ans = max(ans,cur);
        j++;
    }


    cout<<ans;
    return 0;
}