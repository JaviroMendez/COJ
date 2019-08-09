#include <iostream>
using namespace std;
 
int main()
{
       ios_base::sync_with_stdio(0);
       cin.tie(0);
       int a;
       cin >> a;
       if (a >= 0)
                cout<<(a + (a * (a - 1)) / 2);
       else
                cout<<(((a * (a - 1)) / -2)+1);
       return 0;
}
