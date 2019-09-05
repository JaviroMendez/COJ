#include <iostream>
#include <algorithm>
using namespace std;
 
int main() 
{
	int a[4];
	cin>>a[1];
	while(a[1]!=0)
	{
		cin>>a[2]>>a[3];
		sort(a+1,a+4);
		if(a[1]*a[1]+a[2]*a[2]==a[3]*a[3])
			cout<<"right"<<endl;
		else
			cout<<"wrong"<<endl;
		cin>>a[1];
	}
	return 0;
}
