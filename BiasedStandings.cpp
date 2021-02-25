#include <bits/stdc++.h>
using namespace std;
int main()
{
    int t;
    cin >> t;
    int n;
    cin >> n;
    vector<int> a(n);
    for (auto &it : a)
    {
        cin >> it;
    }
    int res = 0;
    int badness = 0;
    int count = 0;
    while (t--)
    {
        for (int i = 0; i < n; i++)
        {
            sort(a.begin(), a.end());
            res = a[i] - (i + 1);
            badness += abs(res);
            count++;
        }
    }
    cout << endl;
    cout << badness << endl;
    return 0;
}