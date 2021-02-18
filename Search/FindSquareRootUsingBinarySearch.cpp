#include <bits/stdc++.h>
using namespace std;
// 0-----N
float search_root(int n, int p)
{
    int s = 0;
    int e = n;
    float ans = -1;
    while (s <= e)
    {
        int mid = (s + e) / 2;

        if (mid * mid == n)
        {
            return mid;
        }
        if (mid * mid < n)
        {
            ans = mid;
            s = mid + 1;
        }
        else
        {
            e = mid - 1;
        }
    }

    //For floating point numbers
    float inc = 0.1;
    for (int i = 1; i <= p; i++)
    {
        while (ans * ans <= n)
        {
            ans = ans + inc;
        }
        ans = ans - inc;
        inc = inc / 10;
    }

    return ans;
}

int main()
{

    int n;
    cin >> n;
    cout << search_root(n, 3) << endl;

    return 0;
}